import java.util.*;
public class tenth {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        String sub=s.substring(s.length()-n);
        while(n-->0)
        {
            s=s+sub;
        }
        System.out.println(s);
    }
}
