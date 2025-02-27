
public class DaysOfTheYear {
	
	
	//https://leetcode.com/problems/day-of-the-year/
	//https://getsdeready.com/courses/design-dsa-combined/lesson/day-of-the-year-3/
	static int[]  daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
 public static void main(String[] args) {	
		System.out.println("Minm Sum : "+dayOfYear("2004-02-19"));
	}

    public static int dayOfYear(String date) {   	
    	 int totalDays =0;
         int year = Integer.valueOf(date.substring(0,4));
         int month = Integer.valueOf(date.substring(5,7));
         int day = Integer.valueOf(date.substring(8,10));
         
        int i=0;
         while(i<month-1){
             if(i==1 && year%4==0 &&(year%400==0 || year%100!=0))
                 totalDays += daysOfMonth[i]+1;
             else
                 totalDays += daysOfMonth[i];
             i++;
         }
         totalDays += day;
     return totalDays;
    }
}
