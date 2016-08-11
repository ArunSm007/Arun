import java.util.Scanner;

public class Pro25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		double x=Math.pow(2, k);
		int j=0;
		while(j<=k){
			for(int i=0;i<x;i++){
				String str=Integer.toBinaryString(i);
				if(str.replaceAll("[^1]", "").length()==j)
					System.out.println(String.format("%0"+k+"d", Integer.parseInt(str)));
			}
			j++;
		}
	}

}
