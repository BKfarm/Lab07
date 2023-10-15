import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        for (int x = 1; x < 31; x++)
        {
            System.out.println(x);
        }
        for (int x = 30; x > 0; x--)
        {
            System.out.println(x);
        }
        for (int x = 0; x < 21; x += 3)
        {
            System.out.println(x);
        }
        for (int x = 10; x > 0; x-= 2)
        {
            System.out.println(x);
        }

        for (int x = 0; x < 5; x++)
        {
            for (int y = 0; y < (x+1); y++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
                for (int x = 0; x < 5; x++)
        {
            for (int y = 5; (y+1) > (x+1); y--)
            {
            System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 0; x < 5; x++)
        {
            for (int y = 0; y < 5; y++)
            {
            System.out.print("*");
            }
            System.out.println();
        }

            boolean done = false;
        double startTemp = 0;
        Scanner in = new Scanner(System.in);
        do
        {
        System.out.println("Input temperature in Celsius: ");
        if(in.hasNextDouble())
        {
            startTemp = in.nextDouble();
            done = true;
        }
        in.nextLine();
        }while(!done);
        startTemp = (startTemp * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + startTemp);
    }

}