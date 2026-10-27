/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return 0;
        }

        Collections.sort(intervals, (a,b) -> Integer.compare(a.start,b.start));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0 ; i < intervals.size(); i++ )    {
            if (!pq.isEmpty() && intervals.get(i).start >= pq.peek())    {
                pq.poll();
            }
            pq.offer(intervals.get(i).end);
        }

        return pq.size();
    }
}