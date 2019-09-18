import java.util.*;
public class first {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        long n=sc.nextLong();
        long dup=n,temp=0,temp2=0;
        while(dup>0)
        {
            temp=temp*10+dup%10;
            dup=dup/10;
        }
        if(temp==n)
        {
            System.out.print(n+" is palindrome");
            while(temp>0)
            {
                if((temp%10)%2==0)
                    temp2+=temp%10;
                temp/=10;
            }
            if(temp2>25)
                System.out.print(" and the sum of even numbers is greater than 25");
            else
                System.out.print(" and the sum of even numbers is less than 25");
        }
        else
            System.out.print(n+" is not palindrome");
    }
}
