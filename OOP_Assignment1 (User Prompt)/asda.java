import java.lang.Math;
public class asda
{
    public static void main(String args[])
    {
        /*System.out.println(Math.abs(8));
        System.out.println(Math.abs(-3.5));
        System.out.println(String.format("%.2f", Math.abs(8.6 + -9.4)));
        System.out.println("Double Number: " + String.format("%.2f", 8.8797219461));*/
        int[][][] array = new int[5][3][10];
        int[] temp = new int[10];
        
        for(int i = 0;i < array[2][2].length;i++)
        {
            array[2][2][i] = (int)(Math.random()*10);
            System.out.println(array[2][2][i]);
        }
        
        temp = array[2][2];
        for(int i = 0;i < temp.length;i++)
        {
            System.out.println(temp);
        }
        
        /*System.out.format("Double Number: %.2f", -6.657612);
        
        System.out.printf("--------------------------------%n");
        System.out.printf(" Java's Primitive Types         %n");
        System.out.printf(" (printf table example)         %n");
        
        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
        System.out.printf("--------------------------------%n");
        
        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "double",  64);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float",   32);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "long",    64);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "int",     32);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "char",    16);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "short",   16);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "byte",    8);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Boolean",  "boolean", 1);
        
        System.out.printf("--------------------------------%n");*/
    }
}
