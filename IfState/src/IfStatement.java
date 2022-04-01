public class IfStatement
{
    public static void main(String[] args)
    {
        // if statement = performs a block of code if it's condition evaluates to be true

        int age = 50;

        if (age >= 75)
        {
            System.out.println("Okay Boomer!");
        }
        else if (age == 50)
        {
            System.out.println("Halfway there!");
        }
        else if (age >=18)
        {
            System.out.println("You are an adult!");
        }
        else if (age >= 13)
        {
            System.out.println("You are a teenager!");
        }
        else
        {
            System.out.println("You are a child!");
        }
    }
}
