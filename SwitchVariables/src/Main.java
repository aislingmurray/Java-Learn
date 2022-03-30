public class Main
{
    public static void main(String[] args)
    {
        String x = "Water";
        String y = "Kool-Aid";
        String temp;

        //Temp temporarily stores x so x will be empty
        temp = x;
        //y is put into x as replacement
        x = y;
        //Now y is empty so we put in temp which is still x
        y = temp;

        //x and y have been swapped thanks to the temp string
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}
