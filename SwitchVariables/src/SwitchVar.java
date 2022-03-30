public class SwitchVar
{
    public static void main(String[] args)
    {
        String x = "Water";
        String y = "Mi Wadi";
        String temp;

        //temp takes over whats was in x
        temp = x;
        //now x is empty we fill it with y
        x = y;
        //fill y with whats in temp which was originally in x
        y = temp;

        //x and y have been swapped with the help of temp
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}
