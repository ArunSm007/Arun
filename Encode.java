/**
 *
 * @author Arun
 */
public class Encode {

    
    public static void main(String[] args){
        // TODO code application logic here
        String str = "code kata";
        char[] result = new char[str.length()];
        int limit = 0;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                if(ch >= 'a' && ch <= 'z')
                   limit = 'z';
                else
                    limit = 'Z';
                ch = (char) (ch+10);
                if(ch > limit){
                    ch = (char) (ch - 26);
                }
            }
            result[i] = ch;
        }
        for(char ch : result)
            System.out.print(ch);
    }
    
}
