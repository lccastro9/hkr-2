
import java.util.*;
public class Arr{
        public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        String  s = lee.next();
        char[] word;
        word = s.toCharArray(); 
        int n= s.length();
        int u=1;
        for(int i=0;i<n;i++){
                if(word[i]>=65 && word[i]<=90){
                        u=u+1;
                }//end if
        }//fin de for
        System.out.println(u);

        }//fin del metodo principal

}//fin de la clase

