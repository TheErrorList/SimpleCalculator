import java.util.Scanner;
class Operations
{
    public float Addition(float x, float y)
    {
        return x+y;
    }

    public float Subtraction(float x, float y)
    {
        return x-y;
    }

    public float Multiplication(float x, float y)
    {
        return x*y;
    }

    public float Division(float x, float y)
    {
        return x/y;
    }
}
public class SimpleCalculator {
    public static void main(String[] args)
    {
        int option;
        float num1, num2, Answer=0;

        Scanner scan = new Scanner(System.in);
        Operations operator = new Operations();

        System.out.println("Hello!\nWht do you want to do?\n");
        while(true)
        {
            System.out.println("press num 1 for sum");
            System.out.println("press num 2 for diff");
            System.out.println("press num 3 for multi");
            System.out.println("press num 4 for divid\n");

            System.out.println("press your option .....[0-Exit]");
            option = scan.nextInt();

            if (option==0)
            {
                scan.close();
                return;
            }
            else if(option>=0 && option<=4)
            {
                System.out.println("\nEnter number1 .....");
                num1 = scan.nextFloat();
                System.out.println("\nEnter number2 .....");
                num2 = scan.nextFloat();

                switch (option) {
                    case 1 -> Answer = operator.Addition(num1, num2);
                    case 2 -> Answer = operator.Subtraction(num1, num2);
                    case 3 -> Answer = operator.Multiplication(num1, num2);
                    case 4 -> Answer = operator.Division(num1, num2);
                }

                System.out.println("\nAnswer is " + Answer + "\n");
            }
            else
                System.out.println("\nInvalid Option!!!\npress num between 0 to 4\n");
        }
    }
}