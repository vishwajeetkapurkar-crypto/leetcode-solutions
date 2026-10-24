class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

         int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        
        int aliceStart = convertToDayOfYear(arriveAlice, daysInMonth);
        int aliceEnd = convertToDayOfYear(leaveAlice, daysInMonth);
        int bobStart = convertToDayOfYear(arriveBob, daysInMonth);
        int bobEnd = convertToDayOfYear(leaveBob, daysInMonth);
        
        
        int latestStart = Math.max(aliceStart, bobStart);
        int earliestEnd = Math.min(aliceEnd, bobEnd);
        
        
        if (latestStart <= earliestEnd) {
            return earliestEnd - latestStart + 1;
        }
        
        return 0;
    }
     private int convertToDayOfYear(String date, int[] daysInMonth) {
        
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        
        int dayOfYear = 0;
        
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        
        
        return dayOfYear + day;
    }
}
