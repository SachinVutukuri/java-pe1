import java.util.*;
public class ninth {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        System.out.println(rev);
    }
}
