import java.util.Scanner;
public class BankAccount
{
	public String name;
	public double amount;
	public int acc_no;
	public double init_bal = 5000;
	Scanner input = new Scanner(System.in);

	public void CannotBeInDebt()
	{
		System.out.println( " YOU CAN NOT BE IN DEBT! " );
	}
	public void deposit()
	{
      System.out.println( " ENTER FIGURES: " );
      amount = input.nextDouble();
      if ( amount > 0)
      {
      	System.out.print( "\n\t DEPOSIT DONE: " +amount);
      	init_bal+= amount;
      	System.out.println( "\n\t ACCOUNT BALANCE: " +init_bal);
      }
  }

        public void withdraw()
        {
        	System.out.print( " ENTER FIGURES: " );
        	amount = input.nextDouble();
        	if ( amount > init_bal)
        	{
        		System.out.println( " YOUR ACCOUNT IS LOW!! ");
        	}   
        	else
        	{
        		init_bal += init_bal - amount;
        		System.out.println( " BALANCE: USD" +init_bal+ " .00 ");
        	}
        }


          public void transfer()
          	{
	          	System.out.print( " ENTER ACCOUNT NAME: " );
	          	String name = input.nextLine();

	          	System.out.print( " ENTER ACCOUNT NUMBER: ");
	          	double accNo = input.nextDouble();

	          	if(amount > init_bal)
	          	{
	          		System.out.println( " NOT ALLOW!!! \n INSUFFICIENT FUNDS. " );
	          	}
	          	else
	          	{
	          		System.out.print(  amount+ "USD\n\t WAS TRANSFERRED TO: " +name+ "\n\t ACCOUNT NUMBER: " +accNo);
	          		init_bal+=init_bal - amount;
	          		System.out.println( "\n\t BALANCE USD" +init_bal+ " .00 ");
	          	}
	        }
    	}




	
