/**
 *
 * @author Arun
 */
public class Pyramid {
    public static void main(String[] args) {
        // TODO code application logic here
        int j = 0;
        Scanner s = new Scanner(System.in);
        for(int i = s.nextInt();i > 0;i--){
            j = 1;
            while(j <= i){
                System.out.print("*");
                ++j;
            }
            System.out.print(" ");
            while(j > 1){
                System.out.print("*");
                --j;
            }
            System.out.println("");
        }
    }
}
