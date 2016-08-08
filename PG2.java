import java.util.Scanner;
public class PG2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer str=new StringBuffer(s.next());
		for(int i=0;i<str.length();i++)
			for(int j=i+1;j<str.length();){
				if(str.charAt(j)==str.charAt(i))
					str.deleteCharAt(j);
				else
					j++;
			}
		System.out.print(str);
		s.close();
	}

}

