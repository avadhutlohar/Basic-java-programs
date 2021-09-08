import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int no = input.nextInt();
        if(no % 2 == 0)
        {
            System.out.println(no + " is even Number");
        }
        else
        {
            System.out.println(no + " is odd Number");
        }

    }
}
