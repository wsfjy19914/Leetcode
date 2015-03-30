
public class InsertInterval {

	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals.size() == 0)
        {
            intervals.add(newInterval);
            return intervals;
        }
        
        if (newInterval.end < intervals.get(0).start )
        {
            intervals.add(0, newInterval);
            return intervals;
        }
        
        if (newInterval.start > intervals.get(intervals.size() - 1).end)
        {
            intervals.add(newInterval);
            return intervals;
        }
        
        int startInterval = -1;
        int endInterval = -1;
        
        int delStart = -1;
        int delEnd = -1;
        
        int position = 0;
        
        for(int i = 0; i < intervals.size(); i ++)
        {
            Interval itv = intervals.get(i);
            if(itv.start > newInterval.end)
            {
                position = i;
                break;
            }
            if(itv.start > newInterval.start && itv.end < newInterval.end)
            {
                position = i;
                intervals.remove(i);
                i --;
                continue;
            }
            if(itv.start <= newInterval.start && itv.end >= newInterval.start)
               startInterval = i;
            if(itv.start <= newInterval.end && itv.end >= newInterval.end)
               endInterval = i;
            
        }
        
        if(startInterval != -1 && endInterval != -1)
        {
            if(startInterval == endInterval)
                return intervals;
            int a = intervals.get(startInterval).start;
            int b = intervals.get(endInterval).end;
            
            intervals.remove(startInterval);
            intervals.remove(endInterval - 1);
            intervals.add(startInterval, new Interval(a, b));
            
        }
        else if(startInterval != -1 && endInterval == -1)
        {
            int a = intervals.get(startInterval).start;
            intervals.remove(startInterval);
            intervals.add(startInterval, new Interval(a, newInterval.end));
        }
        else if(startInterval == -1 && endInterval != -1)
        {
            int b = intervals.get(endInterval).end;
            intervals.remove(endInterval);
            intervals.add(endInterval, new Interval(newInterval.start , b));
            
        }
        else
            intervals.add(position, new Interval(newInterval.start , newInterval.end));
   
        return intervals;
    }

}
