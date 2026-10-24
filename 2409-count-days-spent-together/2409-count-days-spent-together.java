class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int alices = toDay(arriveAlice,days);
        int alicee = toDay(leaveAlice,days);
        int bobs = toDay(arriveBob,days);
        int bobe = toDay(leaveBob,days);
        int start = Math.max(alices,bobs);
        int end = Math.min(alicee,bobe);
        return start<=end ? end-start + 1 : 0;
    }
    private int toDay(String s, int[] days){
        int month = (s.charAt(0)-'0')*10 + (s.charAt(1)-'0');
        int day = (s.charAt(3)-'0')*10 + (s.charAt(4)-'0');
        int res = day;
        for(int i=0;i<month-1;i++){
            res += days[i];
        }
        return res;
    }

}