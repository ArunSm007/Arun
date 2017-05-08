import java.util.Scanner;
/**
 *
 * @author Arun
 */
public class Square {
    static int x[] = new int[4],y[] = new int[4],diff = -1;
    static boolean visited[] = new boolean[4];
    
    public static void main(String[] args){
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        for(int i = 0;i < 4;i++){
            x[i] = s.nextInt();
            y[i] = s.nextInt();
        }
        int tmp;
        for(int i = 0;i < 4;i++){
            visited[i] = true;
            for(int j = 0;j < 4;j++){
                if(x[j] == x[i] || y[j] == y[i]){
                    if(visited[j] != true){
                        tmp = Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
                        if(diff == -1){
                            diff = tmp;
                        }
                        else if(diff != tmp){
                            System.out.println("Not a Square");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Square");
    }
}
