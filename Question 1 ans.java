package shubha;


public class SumOfNumbers {


	//Create a Java program that uses a while loop to find the sum of all numbers from 1 to 100.
	 public static void main(String[] args) {
	        int n = 100;
	        int sum = 0;
	        int i = 1;

	        while (i <= n) {
	            sum += i;
	            i++;
	        }

	        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
	    }
	}