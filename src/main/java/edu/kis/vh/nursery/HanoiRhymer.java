package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static int VALUE_TOTAL_REJECTED = 0;

    private int totalRejected = VALUE_TOTAL_REJECTED;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}//5,12,14,15 - źle sformatowane wiersze
// alt + -> w IntelliJ jest przełączaniem między otwartymi kartami

