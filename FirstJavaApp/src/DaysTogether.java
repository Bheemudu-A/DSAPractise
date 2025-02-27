
public class DaysTogether {
	//https://leetcode.com/problems/count-days-spent-together/description/
	//https://getsdeready.com/courses/design-dsa-combined/lesson/count-days-spent-together-2/
	
	
	int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void main(String[] args) {
		
		DaysTogether classObj = new DaysTogether();
		System.out.println("Days Together : "+classObj.countDaysTogether("08-15","08-18","08-16","08-19"));
	}
	
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int x1 = getDays(arriveAlice);
        int x2 = getDays(leaveAlice);
        int y1 = getDays(arriveBob);
        int y2 = getDays(leaveBob);

        if(x1 > y2 || x2 < y1)
            return 0;
        else
            return Math.min(x2,y2)-Math.max(x1,y1)+1;
    }

    protected int getDays(String stay){
        int total =0;
        int month = Integer.parseInt(stay.substring(0,2));
        int days  =  Integer.parseInt(stay.substring(3,5));
         
         for(int i=0;i<month-1;i++){
            total += daysOfMonth[i];
         }
         total += days;
        return total; 
    }

}
