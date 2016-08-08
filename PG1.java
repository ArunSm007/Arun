import java.util.Scanner;

public class PG1 {
	static Scanner s=new Scanner(System.in);
	static int a[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter array size:");
		a=new int[s.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		System.out.println("Enter index value:");
		System.out.println(a[s.nextInt()]);
	}

}
