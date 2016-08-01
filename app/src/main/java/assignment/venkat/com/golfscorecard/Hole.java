package assignment.venkat.com.golfscorecard;

/**
 * Created by venkatgonuguntala on 8/1/16.
 */

public class Hole {
    private String mLabel;
    private int mStrokeCount;

    public Hole (String label, int strokeCount) {
        mLabel = label;
        mStrokeCount = strokeCount;
    }

    public String getLabel() {
        return mLabel;
    }

    public void setLabel(String label) {
        mLabel = label;
    }

    public int getStrokeCount() {
        return mStrokeCount;
    }

    public void setStrokeCount(int strokeCount) {
        mStrokeCount = strokeCount;
    }
}
