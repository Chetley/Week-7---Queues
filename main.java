import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
	
	static int GCD;
	int number1;
	int number2;
	
	public static void main(String[] args) 
	{
		
		
		System.out.println("Part 1: Greatest Common Divisor"); 
		System.out.println("\n--------------------------------");
		
		//users enter numbers for GCD
		{
			Scanner scanner = new Scanner(System.in);
			
		//if user enters invalid data like a letter, try-catch exception	
		try
		{
		System.out.println("\nEnter first number = ");
//		 int number1 = scanner.nextInt();
		}
		catch (InputMismatchException exception) 
		{
            System.out.println("Error - You have entered invalid data");
		} 
		int number1 = scanner.nextInt();
		try
		{
			System.out.println("\nEnter second number = ");
//			 int number1 = scanner.nextInt();
		}
		catch (InputMismatchException exception) 
		{
	        System.out.println("Error - You have entered invalid data");
		} 
		int number2 = scanner.nextInt(); 

		//find factors of both numbers by incrementing over f until highest factor both are divisible by
        for(int factor = 1; factor <= number1 && factor <= number2; ++factor)
        	{
            if(number1 % factor==0 && number2 % factor==0)
                GCD = factor;
        	}
       
        System.out.println("Greatest Common Divisor of " + number1 + " and " + number2 + " = " + GCD);
		}//if no remainder, set GCD
        
		
		System.out.println("\n--------------------------------");
		System.out.println("\nPart 2: Queues"); 
		System.out.println("\n-------------");
		
        //setting up queue
        Queue AlphaQ = new Queue(10);
        
        //enqueue to add a character to end of queue
        AlphaQ.enqueue("a");
        AlphaQ.displayAlphabet_Queue();

        AlphaQ.enqueue("b");
        AlphaQ.displayAlphabet_Queue();

        AlphaQ.enqueue("c");
        AlphaQ.displayAlphabet_Queue();

        AlphaQ.enqueue("d");
        AlphaQ.displayAlphabet_Queue();

        AlphaQ.enqueue("e");
        AlphaQ.displayAlphabet_Queue();

        AlphaQ.enqueue("f");
        AlphaQ.displayAlphabet_Queue();

        AlphaQ.enqueue("g");
        AlphaQ.displayAlphabet_Queue();

        AlphaQ.enqueue("h");
        AlphaQ.displayAlphabet_Queue();

        AlphaQ.enqueue("i");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("j");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("k");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("l");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("m");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("n");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("o");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("p");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("q");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("r");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("s");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("t");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("u");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("v");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("w");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("x");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("y");
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.enqueue("z");
        
      //for aesthetic only
        AlphaQ.enqueue(" ");
        AlphaQ.enqueue(" ");
        AlphaQ.enqueue(" ");
        AlphaQ.enqueue(" ");
        
    
        AlphaQ.displayAlphabet_Queue();
        AlphaQ.isEmpty();
        
       
        
        
        
	}//public static void

	}//class

		
		
		
		
		
		
		
		
		
		
		
		
