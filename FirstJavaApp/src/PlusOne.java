import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PlusOne
{
    public static void main(String args[]){
        int[] n = new int[] {4,3,2,1};

       System.out.println(Arrays.toString(addingOne(n)));

    }

    protected static int[] addingOne(int[] n){

        for(int i = 0; i < n.length; i++){
            if(i == n.length-1){
                n[i] += 1;
            }
        }
        return n;
    }
}
