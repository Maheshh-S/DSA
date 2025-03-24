import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
        List<int[]> events = new ArrayList<>();

        // Convert meetings into start (+1) and end (-1) events
        for (int[] meeting : meetings) {
            events.add(new int[]{meeting[0], 1});
            events.add(new int[]{meeting[1] + 1, -1});
        }

        // Sort events by day
        events.sort(Comparator.comparingInt(a -> a[0]));

        int availableDays = 0, activeMeetings = 0, prevDay = 1;

        for (int[] event : events) {
            int currDay = event[0], change = event[1];

            if (activeMeetings == 0) {
                availableDays += (currDay - prevDay);
            }

            activeMeetings += change;
            prevDay = currDay;
        }

        // Count free days after the last meeting
        if (activeMeetings == 0) {
            availableDays += (days - prevDay + 1);
        }

        return availableDays;
    }
}