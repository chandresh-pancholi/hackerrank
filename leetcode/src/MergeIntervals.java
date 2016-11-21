import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by chandresh.pancholi on 17/07/16.
 */
public class MergeIntervals {
    public static void main(String[] args) {

    }
    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> list = new ArrayList<>();

        if(intervals.size() == 0) {
            return list;
        }

        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                if(i1.start!=i2.start)
                    return i1.start-i2.start;
                else
                    return i1.end-i2.end;
            }
        });

        Interval startInterval = intervals.get(0);

        for (int i = 0; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);

            if(curr.start>startInterval.end){
                list.add(startInterval);
                startInterval = curr;
            }else{
                Interval merged = new Interval(startInterval.start, Math.max(startInterval.end, curr.end));
                startInterval = merged;
            }
        }
        list.add(startInterval);
        return list;
    }
}

