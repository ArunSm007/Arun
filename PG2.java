import java.util.Scanner;
public class PG2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		StringBuffer str=new StringBuffer(str1);
		for(int i=0;i<str.length();i++)
			for(int j=i+1;j<str.length();){
				if(str.charAt(j)==str.charAt(i))
					str.deleteCharAt(j);
				else
					j++;
			}
		for(int i=0;i<str.length();i++)
			System.out.print(str.charAt(i));
		s.close();
	}

}
