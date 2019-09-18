import java.util.*;
public class seventh {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] count=new int[10];
        int temp=0;
        while(n>0)
        {
            int x=n%10;
            count[x]++;
            n=n/10;
            temp++;
        }
        int i=9,sum=0;
        while(i>=0)
        {
            if(count[i]>0) {
                n = n * 10 + i;
                count[i]--;
                if(i%2==0)
                    sum+=i;
            }
            else
                i--;
        }
        System.out.println("Sorted number in non-increasing order :"+n);
        System.out.println("Sum of even numbers :"+sum);
        if(sum>15)
            System.out.println("True");
        else
            System.out.println("False");


    }
}
