package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int FULL_STACK_VALUE = 11;
    public static final int STAC_CAPACITY = 12;
    public static final int  EMPTY_STACK_VALUE = -1;
    private int[] numbers = new int[STAC_CAPACITY];

    public int total = EMPTY_STACK_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == FULL_STACK_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }

}
