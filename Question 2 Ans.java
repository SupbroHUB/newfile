package shubha;


public class EvenNumbers {


	//Create a Java program that prints all even numbers from 1 to 20 using a while loop.	
	 public static void main(String[] args) {
	        int n = 1;

	        while (n <= 20) {
	            if (n % 2 == 0) {
	                System.out.println("Even numbers from 1 to 20:   " + n);
	            }
	            n++;
	        }
	    }
	}