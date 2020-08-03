public class CircularBuffer {
    private int size;
    private String buffer[] = new String[10];
    private int readPointer = 0;
    private int writePointer = 0;
    private boolean emptyStatus = true;
    private boolean fullStatus = false;

    public CircularBuffer(int i) {
        this.size = i;
    }

    public boolean isEmpty() {
        return emptyStatus;
    }

    public void writeData(String s) {
        buffer[writePointer] = s;
        if (writePointer == size - 1) {
            writePointer = 0;
            this.fullStatus = true;
        } else {
            writePointer++;
        }
    }

    public boolean isFull() {
        return fullStatus;
    }

    public String readData() {
        String result = this.buffer[readPointer];
        if (readPointer == size - 1) {
            readPointer = 0;
        } else {
            readPointer++;
        }
        return result;
    }
}
