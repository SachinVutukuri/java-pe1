import java.util.*;
class sixth {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch))
            System.out.print("Capital letter");
        else if(Character.isLowerCase(ch))
            System.out.print("Small letter");
        else if(Character.isDigit(ch))
            System.out.print("Digit");
        else
            System.out.print("Special symbol");

    }
}
