import java.util.Arrays;
import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String x=s.nextBigDecimal()+"";
		char ch[]=x.toCharArray();
		Arrays.sort(ch);
		x=String.valueOf(ch);
		System.out.println(x.substring(0,x.length()-s.nextInt()));
	}

}
