import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    CircularBuffer cb = new CircularBuffer(10);
    @Test
    public void new_buffer_should_be_empty() {
        boolean result = cb.isEmpty();
        assertTrue(result);
    }

    @Test
    public void new_buffer_size_should_be_10() {
        boolean result = cb.isFull();
        assertFalse("Buffer ไม่เต็มนะ", result);
    }

    @Test
    public void write_A_to_buffer_should_read_A() {
        cb.writeData("A");
        assertEquals("A", cb.readData());
    }

    @Test
    public void write_A_then_B_to_buffer_should_read_A_then_B() {
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void writing_10_times_should_make_buffer_full() {
        for(int i = 0;i<10;i++){
            cb.writeData(Integer.toString(i));
        }
        assertTrue(cb.isFull());
    }

    @Test
    public void writing_11_times_should_overwrite_first_string() {
        for (int i = 1; i <= 10; i++) {
            cb.writeData(Integer.toString(i));
        }
        assertEquals("1", cb.readData());
        for (int i = 1; i <= 8; i++) {
            cb.readData();
        }
        cb.writeData("11");
        cb.readData();
        assertEquals("11", cb.readData());

    }
}