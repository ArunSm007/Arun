import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Arun
 */
public class ArrayTwice {
    
    public static void findUnique(int... inp) {
        Arrays.sort(inp);
        for(int i = 0;i < inp.length;){
            if(inp[i] != inp[i+1]){
                System.out.println(inp[i]);
                return;
            }
            i+=2;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        findUnique(12, 45, 32, 65, 32, 65, 45); 
    }
    
}
