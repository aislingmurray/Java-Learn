import java.util.Scanner;

public class MathsTri
{
    public static void main(String[] args)
    {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("The hypothenuse is: " + z);

        scanner.close();
    }
}


        /*double x =3.14;
        double y = 10;

        double a = Math.max(x, y);
        double b = Math.min(x, y);
        double c = Math.sqrt(y);
        double d = Math.abs(x);
        double e = Math.round(x);
        double f = Math.ceil(x);
        double g = Math.floor(x);

        System.out.println(a + " " +  b  + " " + c + " " + d + " "
        + e + " " + f + " " + g);
         */