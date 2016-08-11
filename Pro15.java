import java.util.Arrays;

import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int N=s.nextInt();
		System.out.println("Enter array elements");
		int a[]=new int[N];
		int b[]=new int[N];
		for(int i=0;i<N;i++){
			int x=s.nextInt();
			int y=Integer.toBinaryString(x).replaceAll("[^1]", "").length();
			a[i]=x;
			b[i]=y;
		}
		for(int i=0;i<N-1;i++)
			for(int j=i+1;j<N;j++){
				for(int k=0;k<=j;k++){
					if(b[k]>b[j]){
						int x=a[k];
						a[k]=a[j];
						a[j]=x;
						x=b[k];
						b[k]=b[j];
						b[j]=x;
					}
					else if(b[k]==b[j]){
						if(a[k]>a[j]){
							int x=a[k];
							a[k]=a[j];
							a[j]=x;	
						}
					}
				}
			}
		for(int i=N-1;i>=0;i--)
			System.out.print(a[i]+" ");
		System.out.println(" ");
	}

}
