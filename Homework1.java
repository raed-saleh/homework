
package homework1;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        
        System.out.print("Please enter a number: \n");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(number + "Devisors are");
        for (int i=1; i<=number; i++)
        {
            if (number%i==0)
            {
                System.out.println(i);
            }
        }
    }
}