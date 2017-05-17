import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Arun
 */

public class Seeds {
    
    public static int y[];

    public static int compute(int num) {
        if(num > 9){
            if(y[num] != 0)
                return y[num];
            else{
                return ( y[num] = num%10 * (compute(num/10)));
            }
        }
        else
            return num;
    }
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        y = new int[ (int)(x+1/2) ];
        List<Integer> result = new ArrayList<>();
        for(int i = 1;i <= x/2;i++){
            if(i * compute(i) == x)
                result.add(i);
        }
        if( !result.isEmpty() )
            for(int i:result)
                System.out.println(i);
        else
            System.out.println("No Seeds");
        
    }
}
