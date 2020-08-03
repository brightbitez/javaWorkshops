import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    @Test
    public void new_buffer_should_be_empty(){
        CircularBuffer cb = new CircularBuffer(10);
        boolean result = cb.isEmpty();
        assertTrue(result);
    }
    @Test
    public void new_buffer_size_should_be_10(){
        CircularBuffer cb = new CircularBuffer(10);
        boolean result = cb.isFull();
        assertFalse("Buffer ไม่เต็มนะ",result);
    }
    @Test
    public void write_A_to_buffer_should_read_A(){
        CircularBuffer cb = new CircularBuffer(10);
        cb.writeData("A");
        assertEquals("A",cb.readData());
    }
    @Test
    public void write_A_then_B_to_buffer_should_read_A_then_B(){
        CircularBuffer cb = new CircularBuffer(10);
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A",cb.readData());
        assertEquals("B",cb.readData());
    }
    @Test
    public void writing_10_times_should_make_buffer_full(){
        CircularBuffer cb = new CircularBuffer(10);
        cb.writeData("A");
        cb.writeData("A");
        cb.writeData("A");
        cb.writeData("A");
        cb.writeData("A");
        cb.writeData("A");
        cb.writeData("A");
        cb.writeData("A");
        cb.writeData("A");
        cb.writeData("A");
        assertTrue(cb.isFull());
    }
    @Test
    public void writing_11_times_should_overwrite_first_string(){
        CircularBuffer cb = new CircularBuffer(10);
        cb.writeData("1");
        cb.writeData("2");
        cb.writeData("3");
        cb.writeData("4");
        cb.writeData("5");
        cb.writeData("6");
        cb.writeData("7");
        cb.writeData("8");
        cb.writeData("9");
        cb.writeData("10");
        assertEquals("1",cb.readData());
        cb.readData();
        cb.readData();
        cb.readData();
        cb.readData();
        cb.readData();
        cb.readData();
        cb.readData();
        cb.readData();
        cb.writeData("11");
        cb.readData();
        assertEquals("11",cb.readData());

    }
}