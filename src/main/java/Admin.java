import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Admin {
	Customer list = new Customer();
	double interestRate=0;
public void create_account()                      //Create a new Account
{
	System.out.println("Enter Name of Customer");
	
	Scanner obj= new Scanner(System.in);
	String name="";
	 
		 name= obj.nextLine();
	 
	
	
	System.out.println("Enter Address");
	String addr= obj.nextLine();
	
	System.out.println("Enter Account Type");
	String type= obj.nextLine();
	
	System.out.println("Enter Phone number");
	int con= obj.nextInt();
	
	System.out.println("Enter Account ID");
	int id= obj.nextInt();
	
	System.out.println("Enter Intial Balance");
	double bal= obj.nextDouble();
	while(bal<0)
	{
		System.out.println("Amount cannot be negative:");
		System.out.println("Enter Intial Balance Again");
		bal= obj.nextDouble();
	}
	
	DateTimeFormatter d= DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
	ZonedDateTime dat = ZonedDateTime.now();
	String date = d.format(dat);
	 String t="Deposited " + bal;
   list=list.insert(list,name,addr,con,id,type,bal,date,date,t,0.0,0.0);
//obj.close();
}
public void deposit()
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	System.out.println("\nEnter Amount: \n");
	int b= obj.nextInt();
	while(b<0)
	{
		System.out.println("Amount cannot be negative:");
		System.out.println("Enter Again");
		b= obj.nextInt();
	}
	list=list.makeDeposit(list,b,id);
}

public void withdraw()
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	System.out.println("\nEnter Amount: \n");
	int b= obj.nextInt();
	while(b<0)
	{
		System.out.println("Amount cannot be negative:");
		System.out.println("Enter Again");
		b= obj.nextInt();
	}
	list=list.makeWithDraw(list,b,id);
}

public void close_account()                      //Close or Delete a Sepecific Account
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	
   list=list.deleteAccount(list,id);

}

public void LoginAccount()            //login to specific Account
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	
   list.Login(list,id);
obj.close();
}

public void DisplayAll()          //Display All Accounts
{
	list.ShowAllAccount();


}

public void InterestRate()          //Interest Rate sepecifer function
{
	System.out.println("Previous Interest Rate is:" + interestRate );
	System.out.println("\nEnter new value of Interest Rate:");
	Scanner obj= new Scanner(System.in);
	interestRate= obj.nextInt();
	while(interestRate<0)
	{
		System.out.println("Amount cannot be negative:");
		System.out.println("Enter Again");
		interestRate= obj.nextInt();
	}
	System.out.println("\nInterest Rate Updated\n");
}
/*
public void DisplayAllDeductions()          //Display All Accounts
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	list.interest(interestRate, id);
	


}
*/
public void transferAmount()           //transferAmount function
{
	System.out.println("\nEnter Sender Account ID:\n");
	Scanner obj= new Scanner(System.in);
	int id1= obj.nextInt();
	System.out.println("\nEnter Reciver Account ID:\n");
	int id2= obj.nextInt();
	System.out.println("\nEnter Amount: \n");
	int b= obj.nextInt();
	while(b<0)
	{
		System.out.println("Amount cannot be negative:");
		System.out.println("Enter Again");
		b= obj.nextInt();
	}
	list.makeWithDraw(list,b,id1);
	list.makeDeposit(list,b,id2);
}
	
public void DisplayAllDeductions()       //displaying all deduction
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	list.deduction(id);
}
public void calculatelnterest()     //calculating all interest
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	list.interest(interestRate,id);
}
public void balance()
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	list.CheckBalance(id);
}

public void pstatement()
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	list.CheckBalance(id);
list.printStatement(id);
}
public void ZakatFun()
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	list.CheckBalance(id);
list.calculateZakat(id);
}

}

