import java.util.*;
import java.lang.*;
public class third {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        int i=0;
        while(i<s.length())
        {
            if(!Character.isLetter(s.charAt(i)))
            {
                System.out.print("Specified wrong input");
                System.exit(0);
            }
            i++;
        }
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                System.out.print("Vowel ");
            else
                System.out.print("Consonant ");
        }
    }
}
