import java.util.*;
public class eighth {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int target=53;
        int guess;
        System.out.print("Enter your guess(limit: 1 - 100):");
        guess=sc.nextInt();
        while(guess!=target)
        {
            if(guess<target)
                System.out.println("Number guessed is less than original number");
            if(guess>target)
                System.out.println("Number guessed is more than original number");
            System.out.print("Enter your guess:(limit: 1 - 100)-");
            guess=sc.nextInt();
        }
        System.out.println("Number guessed matches the original number");
    }
}
