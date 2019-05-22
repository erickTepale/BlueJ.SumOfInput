/**
 * Created by iyasuwatts on 10/17/17.
 * Edited by Erick Tepale
 * 
 * Takes any integer from user and finds the summation from 1 to n
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("How high do we go ?");

      int max = input.nextInt();
      
      System.out.println("The summation from 1 to " + max + " is: " + ((max >= 0) ? sumPositive(max) : sumNegative(max)) );
    }
    
    public static int sumPositive(int max){
        int sum = 0;
        for(int i=1; i<=max; i++){
            sum += i; 
        }
        return sum;
    }
    
    public static int sumNegative(int min){
        int sum = 0; 
        for(int i = 1; i>=min; i--){
            sum += i; 
        }
        return sum;
    }
}
