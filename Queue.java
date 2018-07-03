import java.util.NoSuchElementException;


public class Queue {


		
	
	private String [] alphabet_queue = new String [10];
	private int size = 0;
	private int first_element = 0;
	private int last_element = 0;

    public Queue(int size) 
    {
        alphabet_queue = new String[10];
    }
    
    public void enqueue(String letter) 
    {
        alphabet_queue[last_element] = letter;
        last_element = (last_element + 1);
        size++;
        if (last_element == 10)
        {
        	last_element = 0;
        }
    }//enqueue
    
    public boolean isEmpty() 
    {
        return size == 0;
    }

   
    
    public void displayAlphabet_Queue() 
	{
		System.out.println("\nCurrent Queue: ");
	      for (int i = 0; i < alphabet_queue.length; i++) 
	      {
	         if (i > 0) 
	         {
	            System.out.print(" ");
	         }
	         System.out.print(""+ alphabet_queue[i]);
	      }
	}	


}//queueclass
