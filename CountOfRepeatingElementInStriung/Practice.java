import java.util.Scanner;

public class Practice{
 public static void main(String[] args){
     String str = "sinstriiintng";
     int[] ch = new int[26];
     for(int i =0;i<str.length();i++){
       if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
        ch[str.charAt(i)- 'a']++;
       }  
     }
     for(int i =0;i<ch.length;i++){
       if(ch[i]>1){
         System.out.println((char)(i+'a')+" - "+ ch[i]);
       }
     }
   }
}