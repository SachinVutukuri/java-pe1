import java.util.*;
public class fifth {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int total=0;
        String[] str=s.split(" ");
        try {
            for (int i = 0; i < str.length; i++) {
                int x = Integer.parseInt(str[i]);
                total += x;
            }
            System.out.print(total);
        }
        catch(NumberFormatException e)
        {
            System.out.print("Wrong Input: Specified non integer values");
        }
    }
}
