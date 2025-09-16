package assignment3;
import java.util.Scanner;
public class SymmetricalImage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many rows?");
        int rows = scan.nextInt();
        System.out.println("how many collums?");
        int collums = scan.nextInt();
        int a;
        int b;
        String[][] image = new String[rows][collums];
        for (int col = 0; col < image[0].length; col++) {
			for (int row = 0; row < image.length; row++) {
				image[row][col] = " ";
			}
        }
        for (int i = 0; i<rows*collums/4; i++){
            a = (int)(Math.random()*rows);
            b = (int)(Math.random()*(collums/2));
            image [a][b] = "*";
            image [a][collums-b-1] = "*";
        }
        for (int col = 0; col < image[0].length; col++) {
			for (int row = 0; row < image.length; row++) {
				System.out.print( image[row][col] );
			}
            System.out.println();
		}
        scan.close();
    }
    
}
