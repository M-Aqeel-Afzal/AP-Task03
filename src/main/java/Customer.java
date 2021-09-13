import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//import java.io.*;
public class Customer {
	node head;
	 class node {
 String Name;
 String Address;
 int Contact;
 int AccountID;
 String  type;
 double balance=0;
 String date_created;
 String last_transection;
 String last_T;
 double fee_t=0;
 double interest=0.0;
	node next;
node(String n,String addr,int con,int id,String flg,double bal,String dat,String tran,String t,double ft,double intr)
{
	Name=n;
	Address=addr;
	Contact=con;
	AccountID=id;
	type=flg;
	balance=bal;
	date_created=dat;
	last_transection=tran;
	last_T=t;
	fee_t=ft;
	interest=intr;
}
	}
	
	public Customer insert(Customer C_list,String n,String addr,int con,int id,String flg,double bal,String dat,String tran,String t,double ft,double intr)
    {
       
        node temp_node = new node(n,addr,con,id,flg,bal,dat,tran,t,ft,intr);
        temp_node.next = null;
   
       
        if (C_list.head == null) {
        	C_list.head = temp_node;
        }
        else {
            
            node last = C_list.head;
            while (last.next != null) {
                last = last.next;
            }
   
           
            last.next = temp_node;
        }
   
       
        return C_list;
    }
	
	public Customer deleteAccount(Customer C_list, int id)
{
node temp = C_list.head, prev = null;

if (temp != null && temp.AccountID == id) {
C_list.head = temp.next; // Changed head


System.out.println(id + " Account founded and deleted");
return C_list;
}


while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
    prev.next = temp.next;
    System.out.println(id + " Account founded and deleted");
}

if (temp == null) {
    System.out.println(id + " Account not found");
}


return C_list;
}
	
	
	public void Login(Customer C_list, int id)
	{
	node temp = C_list.head, prev = null;

	if (temp != null && temp.AccountID == id) {
	
		 System.out.println();
	        System.out.println("Holder Name: " + temp.Name + "\nAccount ID: " + temp.AccountID + "\nAddress: " + temp.Address
	        		+ "\nContact: " + temp.Contact + "\nAccount Type: " + temp.type + "\n\nBalance: " + temp.balance +"\n\nLast Transection: : " + temp.date_created + "\n\n\n");

	
	}


	while (temp != null && temp.AccountID != id) {
	    prev = temp;
	    temp = temp.next;
	}


	if (temp != null) {
		 System.out.println();
	        System.out.println("Holder Name: " + temp.Name + "\nAccount ID: " + temp.AccountID + "\nAddress: " + temp.Address
	        		+ "\nContact: " + temp.Contact + "\nAccount Type: " + temp.type + "\n\nBalance: " + temp.balance +"\n\nLast Transection: : " + temp.date_created + "\n\n\n");

	}

	if (temp == null) {
	    System.out.println(id + " Account not found");
	}


	
	}
	
	
	
	public void ShowAllAccount()
	{
	    node temp = this.head;

	    System.out.print(" All Bank Accounts Are: ");

	    while (temp != null) {
	    	 System.out.println();
	        System.out.println("Holder Name: " + temp.Name + "\nAccount ID: " + temp.AccountID + "\nAddress: " + temp.Address
	        		+ "\nContact: " + temp.Contact + "\nAccount Type: " + temp.type + "\n\nBalance: " + temp.balance +"\n\nLast Transection: "
	        		+ temp.date_created + "\n\n\n");

	       
	        temp = temp.next;
	    }

	    System.out.println();
	}
	
	
	
	public Customer makeDeposit(Customer C_list,double b,int id)  //deposit function
	{

node temp = C_list.head, prev = null;

if (temp != null && temp.AccountID == id) {
	temp.balance+=b;
	if(temp.type.equals("Checking")||temp.type.equals("checking"))
	temp.fee_t +=10;

	DateTimeFormatter d= DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
	ZonedDateTime dat = ZonedDateTime.now();
	String date = d.format(dat);
	temp.last_T="Deposied " + b;
    temp.last_transection=date;
    
System.out.println(id + "Deposit Successful---!");
return C_list;
}


while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
	temp.balance+=b;
	if(temp.type.equals("Checking")||temp.type.equals("checking"))
		temp.fee_t +=10;

	DateTimeFormatter d= DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
	ZonedDateTime dat = ZonedDateTime.now();
	String date = d.format(dat);
    temp.last_transection=date;
    temp.last_T="Deposied " + b;
	System.out.println(id + "Deposit Successful---!");
}

if (temp == null) {
    System.out.println( " Account not found");
}


return C_list;
		
		
	}
	public Customer makeWithDraw(Customer C_list,double b,int id)  //Withdraw function
	{

node temp = C_list.head, prev = null;

if (temp != null && temp.AccountID == id) {
	temp.balance-=b;
	temp.last_T="WithDrawn " + b;
	if(temp.type.equals("Checking")||temp.type.equals("checking"))
		temp.fee_t +=10;
	DateTimeFormatter d= DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
	ZonedDateTime dat = ZonedDateTime.now();
	String date = d.format(dat);
    temp.last_transection=date;
    
System.out.println(id + "Withdraw Successful---!");
return C_list;
}


while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
	temp.balance-=b;
	temp.last_T="WithDrawn " + b;
	
	if(temp.type.equals("Checking")||temp.type.equals("checking"))
		temp.fee_t +=10;
	DateTimeFormatter d= DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
	ZonedDateTime dat = ZonedDateTime.now();
	String date = d.format(dat);
    temp.last_transection=date;
    
	System.out.println(id + "Withdraw Successful---!");
}

if (temp == null) {
    System.out.println(id + " Account not found");
}


return C_list;
		
		
	}
	public void CheckBalance(int id)  //CheckBalance function          
	{

node temp = this.head, prev = null;

if (temp != null && temp.AccountID == id) {
System.out.println( "Your Account Balance is: " + temp.balance);

}


while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
	System.out.println( "Your Account Balance is: " + temp.balance);
}

if (temp == null) {
    System.out.println( " Account not found");
}


		
	}
public void printStatement(int id)              //printing transection statement

	{
		node temp = this.head, prev = null;

		if (temp != null && temp.AccountID == id) {
		
			 System.out.println("\n\nTransection Staement\n\n");
		        System.out.println("Holder Name: " + temp.Name + "\nAccount ID: " + temp.AccountID + "\nAddress: " + temp.Address
		        		+ "\nContact: " + temp.Contact + "\nAccount Type: " + temp.type + "\n\nCurrent Balance: " + temp.balance +"\n\nTransected at:  " 
		        		+ temp.date_created + "Last Transection" + temp.last_T + "\n\n\n");

		
		}


		while (temp != null && temp.AccountID != id) {
		    prev = temp;
		    temp = temp.next;
		}


		if (temp != null) {
			System.out.println();
	        System.out.println("Holder Name: " + temp.Name + "\nAccount ID: " + temp.AccountID + "\nAddress: " + temp.Address
	        		+ "\nContact: " + temp.Contact + "\nAccount Type: " + temp.type + "\n\nCurrent Balance: " + temp.balance +"\n\nTransected at:  " 
	        		+ temp.date_created + "Last Transection" + temp.last_T + "\n\n\n");

		}

		if (temp == null) {
		    System.out.println(id + " Account not found");
		}


		
		
}

public void calculateZakat(int id)            //zakat calution
{

node temp = this.head, prev = null;

if (temp != null && temp.AccountID == id&& temp.type.equals("saving")&&temp.balance>=20000) {
	
	double zak=(temp.balance*2.5)/100;
System.out.println( "Zakat on your Account Balance is: " + zak);
	

}


while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null&& temp.type.equals("saving")&&temp.balance>=20000) {
	double zak=(temp.balance*2.5)/100;
	System.out.println( "Zakat on your Account Balance is: " + zak);
}

if (temp == null) {
    System.out.println( " Account not found or balance is less then 20000/-");
}

}
public void deduction(int id)                                 //deduction function      
{

node temp = this.head, prev = null;

	if (temp != null && temp.AccountID == id) {
		if(temp.type.equals("saving"))
		{
			System.out.println( "Account Owner Name " + temp.Name);
			System.out.println( "Account ID " + temp.AccountID);
			System.out.println( "Current Account Balance " + temp.balance);
			System.out.println( "Account Type is " + temp.type);
				System.out.println( "Tax is: " + temp.fee_t);
		}
		else
		{
			double zak=(temp.balance*2.5)/100;
			System.out.println( "Account Owner Name " + temp.Name);
			System.out.println( "Account ID " + temp.AccountID);
			System.out.println( "Current Account Balance " + temp.balance);
			System.out.println( "Account Type is " + temp.type);
			System.out.println( "Zakat is: " + zak);
		}

}


while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
	if(temp.type.equals("saving"))
	{
		System.out.println( "Account Owner Name " + temp.Name);
		System.out.println( "Account ID " + temp.AccountID);
		System.out.println( "Current Account Balance " + temp.balance);
		System.out.println( "Account Type is " + temp.type);
			System.out.println( "Tax is: " + temp.fee_t);
	}
	else
	{
		double zak=(temp.balance*2.5)/100;
		System.out.println( "Account Owner Name " + temp.Name);
		System.out.println( "Account ID " + temp.AccountID);
		System.out.println( "Current Account Balance " + temp.balance);
		System.out.println( "Account Type is " + temp.type);
		System.out.println( "Zakat is: " + zak);
	}
}

if (temp == null) {
    System.out.println( " Account not found");
}

}




public void interest(double intr,int id)                //interest function
{

node temp = this.head, prev = null;

	if (temp != null && temp.AccountID == id) {
		System.out.println( "entered");
		if(temp.type.equals("saving"))
		{
			System.out.println( "Account Owner Name " + temp.Name);
			System.out.println( "Account ID " + temp.AccountID);
			System.out.println( "Current Account Balance " + temp.balance);
			System.out.println( "Account Type is " + temp.type);
				temp.interest=(temp.balance*intr)/100;
				System.out.println( "total interest is: " + temp.interest);
		}
		else
		{
			
			System.out.println( "Account Owner Name " + temp.Name);
			System.out.println( "Account ID " + temp.AccountID);
			System.out.println( "Current Account Balance " + temp.balance);
			System.out.println( "Account Type is " + temp.type);
			System.out.println( "therefore interest in not applicable. ");
		}

}


while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
	if(temp.type.equals("saving"))
	{
		System.out.println( "Account Owner Name " + temp.Name);
		System.out.println( "Account ID " + temp.AccountID);
		System.out.println( "Current Account Balance " + temp.balance);
		System.out.println( "Account Type is " + temp.type);
			temp.interest=(temp.balance*intr)/100;
			System.out.println( "total interest is: " + temp.interest);
	}
	else 
	{
		
		System.out.println( "Account Owner Name " + temp.Name);
		System.out.println( "Account ID " + temp.AccountID);
		System.out.println( "Current Account Balance " + temp.balance);
		System.out.println( "Account Type is " + temp.type);
		System.out.println( "therefore interest in not applicable. ");
	}
}

if (temp == null) {
    System.out.println( " Account not found");
}
	
}
	
}
