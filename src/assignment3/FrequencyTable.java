package assignment3;
import java.util.Scanner;
public class FrequencyTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many dice are being rolled?");
        int numOfDice = scan.nextInt();
        int[] table = new int[6*numOfDice+1];
        int roll;
        for (int i = 0; i<10000; i++){
            roll = 0;
            for (int a = 0; a < numOfDice; a++){
                roll = roll+(int)(Math.random()*6)+1;
            }
            table[roll]++;
        }
        System.out.println("Times each value was rolled with "+ numOfDice+" dice over 10000 rolls");
        for (int i = 1; i<table.length; i++){
            System.out.print(i+": "+ table[i]+", ");
        }
        scan.close();
    }
}
