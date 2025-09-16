package assignment3;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers do you want to sort?");
        int[]array = new int[scan.nextInt()];
        System.out.println("Enter integers to sort:");
        int num1;
        int num2;
        int sorted = 1;
        for(int i = 0; i< array.length; i++){
            array[i]=scan.nextInt();
        }
        System.out.println("All values inputed. Sorting...");
        System.out.print("Given Values: ");
        for (int status:array)  {
                System.out.print(status+", ");
            }
        System.out.println();
        while (sorted != 0){
            sorted = 0;
            for(int i = 0; i< array.length-1; i++){
                num1 = array[i];
                num2 = array[i+1];
                if (num2<num1){
                    array[i] = num2;
                    array[i+1] = num1;
                    sorted ++;
                }
        }
        }
        System.out.print("Sorted Values: ");
        for (int status:array)  {
                System.out.print(status+", ");
            }
            scan.close();
    }
}
