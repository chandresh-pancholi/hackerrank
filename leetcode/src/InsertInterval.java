import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by chandresh.pancholi on 18/07/16.
 */
public class InsertInterval {
    public static void main(String[] args) {

    }
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        List<Interval> output = new ArrayList<>();
        for (Interval interval : intervals) {
            if(interval.end < newInterval.start) {
                output.add(interval);
            } else if (interval.start > newInterval.end) {
                output.add(newInterval);
                newInterval = interval;
            } else if(interval.end >= newInterval.start || interval.end <= newInterval.end) {
                newInterval = new Interval(Math.min(interval.start, newInterval.start), Math.max(interval.end, newInterval.end));
            }
        }

        output.add(newInterval);
        return output;
    }

}
