
public class BinarySearchDemo {

	public static void main(String[] args) {
	System.out.println(	"Ans : "+mySqrt(35));
	}
	
    public static int mySqrt(int x) {
        
        int start = 1;
        int end = x;

        while(start<=end){
            int mid = (start+end)/2;

            if(mid*mid==x){
                return (int) mid;
            }else if(mid*mid>x){
                 end = mid-1;
            }else{
                start = mid+1;      
            }
       
        }
        return (int)end;
    }
	
}
