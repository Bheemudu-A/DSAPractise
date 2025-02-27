import java.util.Scanner;

public class ValidPalindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        System.out.println("isValidPali : "+isValidPalindrome(num));
    }

    public static boolean isValidPalindrome(int x) {
    	
    	int orginalNum = x;
    	int num =0;
    	
    	while(x>0) {
    		int rem = x%10;
    		num = num*10+rem;
    		x = x/10;  		
    	}
    	return orginalNum==num;
    }
}
