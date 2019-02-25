	import java.util.Scanner;
	public class Interface 
	{
		public static void main(String[] args)
		{ Scanner input = new Scanner(System.in);
		   BankAccount data = new BankAccount();

		   System.out.println( " PRESS: \n\t1 TO DEPOSIT \n\t 2 TO WITHDRAW \n\t 3 TO TRANSFER ");
		   double meda = input.nextDouble();
		   
		   
			   	if(meda == 1)
			   	{ 
			       data.deposit();   
			   }
			   	if(meda == 3)

			   	{
			       data.transfer();
			   	}
                }
               }
			

		   
		
	

	

	



		

 


		
	
