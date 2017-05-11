import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Arun
 */
public class ReverseWords {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String inp = s.nextLine();
        String[] str = inp.split(" ");
        String output = "";
        for(int i = str.length;i > 0;i--){
            output += str[i - 1] + " ";
        }
        output = output.trim();
        System.out.println(output);
    }
}
