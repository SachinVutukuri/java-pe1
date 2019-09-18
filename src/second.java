import java.util.*;
public class second {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>20 && n<30)
            if(n%2 == 1)
                System.out.print("Tom");
            else
                System.out.print("Jerry");
    }
}
