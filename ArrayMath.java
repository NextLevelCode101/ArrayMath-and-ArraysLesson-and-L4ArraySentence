import java.util.Scanner;
import java.util.Arrays;
public class ArrayMath
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] array = new int[10];
      for(int i=0; i<array.length; i++)
      {
        System.out.println("Enter integer: ");
        array[i] = scan.nextInt();
      }
      System.out.println("The elements in the array are: ");
      for (int i=0; i<array.length; i++)
      {
        System.out.println(array[i]);
      }
     int sum = 0;
     int difference = 0;
     int product = 1;
     for (int i=0; i<array.length; i++)
     {
         sum = array[i]+sum;
         difference = array[i]-difference;
         product = array[i]*product;

    }    
    System.out.println("Sum; " + sum);
    System.out.println("Difference: " +difference);
    System.out.println("product: " + product);

    Arrays.sort(array);
    System.out.println("Elements of array sorted from smallest to largest: ");
    for (int i = 0; i < array.length; i++)
    {
        System.out.println(array[i]);
    }
    int sortsum = 0;
    int sortdifference = 0;
    int sortproduct = 1;
    for (int i=0; i<array.length; i++)
    {
        sortsum = array[i]+sortsum;
        sortdifference = array[i]-sortdifference;
        sortproduct = array[i]*sortproduct;

   }
   System.out.println("sortSum " + sortsum);
   System.out.println("sortDiffeerence " + sortdifference);
   System.out.println("sortProduct " + sortproduct);

   System.out.println("The sum and product were the same because the order of the number does not matter (1+2 is the same as 2+1). But order matters in difference because 2-1 is 1 while 1-2 is -1.");

   }
}




