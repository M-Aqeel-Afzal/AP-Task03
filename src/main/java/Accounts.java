import java.io.InputStream;
import java.util.*;

import java.util.Scanner;



public class Accounts {
	public Accounts(InputStream in) {
		// TODO Auto-generated constructor stub
	}
	public Admin addmin(Admin admin,MainMenu menu)
	{
		 int  temp1=0;
		 Scanner obj2= new Scanner(System.in);
		 while(true)
		 {  menu.menuAdmin(); 
		 in:
		 System.out.println("lab in");

		 if(obj2.hasNextInt())
		 {
		   temp1= obj2.nextInt();
		 
		    	 switch(temp1)
		     {
		     
		     case 1:
		    	 admin.create_account();
		    	 
		    	 break;
		     case 2:
		    	 admin.close_account();
		    	 break;
		     case 3:
		    	 admin.LoginAccount();
		    	 break;
		     case 4:
		    	 admin.InterestRate();
		    	 break;
		     case 5:
		    	admin.DisplayAll();
		    	break;
		     case 6:
		    	admin.calculatelnterest();
		    	break;
		     case 7: 
		    	 admin.DisplayAllDeductions();
		    	 break;
		     case 9:
		    	System.exit(0);
		     case 0:
		    	return admin;
		    	default:
		    		System.out.println("Wrong input! Try Again");
		    		
		     }
		 }
		    	 //obj2.close();	
		   // obj2.nextLine();
		 }
		// obj2.close();
		 
	}
	
	public Admin Custom(Admin admin,MainMenu menu)
	{
		int  temp=0;
		 Scanner obj1= new Scanner(System.in);
		menu.menu2(); 
		 temp= obj1.nextInt();
			 switch(temp)
		     {
			     case 1:
			    	 int  temp1=0;
			    	 Scanner obj2= new Scanner(System.in);
			    	 while(true)
			    	 { menu.menuCustomerSaving(); 
			    	

			    	 if(obj2.hasNextInt())
			    	 {
			    	   temp1= obj2.nextInt();
			    	 
			    	    	 switch(temp1)
			    	     {
			    	     
			    	     case 1:
			    	    	 admin.deposit();
			    	    	 break;
			    	     case 2:
			    	    	 admin.withdraw();
			    	    	 break;
			    	     case 3:
			    	    	 admin.balance();
			    	    	 break;
			    	     case 4:
			    	    	 admin.pstatement();
			    	    	 break;
			    	     case 5:
			    	    	admin.transferAmount();
			    	    	break;
			    	     case 6:
			    	    	admin.ZakatFun();
			    	    	break;
			    	     case 7:
				    	    	admin.DisplayAllDeductions();
				    	    	break;
			    	     case 8:
				    	    	admin.calculatelnterest();
				    	    	break;
			    	     case 9:
			    		    	System.exit(0);
			    	     case 0:
			    	    	 return admin;
			    	    	default:
			    	    		System.out.println("Wrong input! Try Again");
			    	    		
			    	     }
			    	 }
			    	    	 //obj2.close();	
			    	   // obj2.nextLine();	 
			    	 }
			    	 
			    	 
			    	 
			    	 
			    	 
			    	 
			    	 
			    	 
			     case 2:
			    	 
			    	 int  temp2=0;
			    	 Scanner obj3= new Scanner(System.in);
			    	 while(true)
			    	 { menu.menuCustomerChecking(); 
			    	

			    	 if(obj3.hasNextInt())
			    	 {
			    	   temp2= obj3.nextInt();
			    	 
			    	    	 switch(temp2)
			    	     {
			    	     
			    	     case 1:
			    	    	 admin.deposit();
			    	    	 break;
			    	     case 2:
			    	    	 admin.withdraw();
			    	    	 break;
			    	     case 3:
			    	    	 admin.balance();
			    	    	 break;
			    	     case 4:
			    	    	 admin.pstatement();
			    	    	 break;
			    	     case 5:
			    	    	admin.transferAmount();
			    	    	break;
			    	     case 7:
				    	    	admin.DisplayAllDeductions();
				    	    	break;
			    	     case 9:
			    		    	System.exit(0);
			    	     case 0:
			    	    	 return admin;
			    	    	default:
			    	    		System.out.println("Wrong input! Try Again");
			    	    		
			    	     }
			    	 }
			    	    	 //obj2.close();	
			    	   // obj2.nextLine();	 
			    	 }
			    	 
			     case 9:
				    	System.exit(0);
			     case 0:
	    	    	 return admin;
			    	 
		     }
			 return admin;
		 
	     
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
//MainMenu m1= new MainMenu();

MainMenu.menu1();    //static function call
MainMenu menu= new MainMenu();
Admin admin= new Admin();
Accounts Acc= new Accounts(System.in);
System.out.println("Press The Button");
Scanner obj1= new Scanner(System.in);
int temp= obj1.nextInt();
while(true)
{if(temp==1)
	{ 
	admin=Acc.addmin(admin,menu);
	MainMenu.menu1();    //static function call
	System.out.println("Press The Button");
	
	obj1= new Scanner(System.in);
	 temp= obj1.nextInt();
	}
if(temp==2)
	{
	admin=Acc.Custom(admin,menu);
	MainMenu.menu1();    //static function call
	System.out.println("Press The Button");
	
	obj1= new Scanner(System.in);
	 temp= obj1.nextInt();
	}
if(temp==9)
    	System.exit(0);
}
	}

}









/*import java.util.*;

import java.util.Scanner;
public class Accounts {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
//MainMenu m1= new MainMenu();

MainMenu.menu1();    //static function call
MainMenu menu= new MainMenu();
Admin admin= new Admin();

System.out.println("Press The Button");
Scanner obj1= new Scanner(System.in);
int temp= obj1.nextInt();
if(temp==1)
	{ 
	 int  temp1=0;
	 Scanner obj2= new Scanner(System.in);
	 while(true)
	 {  menu.menuAdmin(); 
	 in:
	 System.out.println("lab in");

	 if(obj2.hasNextInt())
	 {
	   temp1= obj2.nextInt();
	 
	    	 switch(temp1)
	     {
	     
	     case 1:
	    	 admin.create_account();
	    	 
	    	 break;
	     case 2:
	    	 admin.close_account();
	    	 break;
	     case 3:
	    	 admin.LoginAccount();
	    	 break;
	     case 4:
	    	 admin.InterestRate();
	    	 break;
	     case 5:
	    	admin.DisplayAll();
	    	break;
	     case 6:
	    	admin.DisplayAllDeductions();
	     case 9:
	    	System.exit(0);
	    	default:
	    		System.out.println("Wrong input! Try Again");
	    		
	     }
	 }
	    	 //obj2.close();	
	   // obj2.nextLine();
	 }
	// obj2.close();
	
	}
if(temp==2)
	{
	menu.menu2(); 
	 temp= obj1.nextInt();
		 switch(temp)
	     {
		     case 1:
		    	 int  temp1=0;
		    	 Scanner obj2= new Scanner(System.in);
		    	 while(true)
		    	 { menu.menuCustomerSaving(); 
		    	

		    	 if(obj2.hasNextInt())
		    	 {
		    	   temp1= obj2.nextInt();
		    	 
		    	    	 switch(temp1)
		    	     {
		    	     
		    	     case 1:
		    	    	 admin.deposit();
		    	    	 break;
		    	     case 2:
		    	    	 admin.withdraw();
		    	    	 break;
		    	     case 3:
		    	    	 admin.balance();
		    	    	 break;
		    	     case 4:
		    	    	 admin.pstatement();
		    	    	 break;
		    	     case 5:
		    	    	admin.transferAmount();
		    	    	break;
		    	     case 6:
		    	    	admin.ZakatFun();
		    	    	break;
		    	     case 7:
			    	    	admin.displayAllDeductions();
			    	    	break;
		    	     case 8:
			    	    	admin.calculatelnterest();
			    	    	break;
		    	     case 9:
		    		    	System.exit(0);
		    	    	default:
		    	    		System.out.println("Wrong input! Try Again");
		    	    		
		    	     }
		    	 }
		    	    	 //obj2.close();	
		    	   // obj2.nextLine();	 
		    	 }
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		     case 2:
		    	 
		    	 int  temp2=0;
		    	 Scanner obj3= new Scanner(System.in);
		    	 while(true)
		    	 { menu.menuCustomerChecking(); 
		    	

		    	 if(obj3.hasNextInt())
		    	 {
		    	   temp2= obj3.nextInt();
		    	 
		    	    	 switch(temp2)
		    	     {
		    	     
		    	     case 1:
		    	    	 admin.deposit();
		    	    	 break;
		    	     case 2:
		    	    	 admin.withdraw();
		    	    	 break;
		    	     case 3:
		    	    	 admin.balance();
		    	    	 break;
		    	     case 4:
		    	    	 admin.pstatement();
		    	    	 break;
		    	     case 5:
		    	    	admin.transferAmount();
		    	    	break;
		    	     case 7:
			    	    	admin.displayAllDeductions();
			    	    	break;
		    	     case 9:
		    		    	System.exit(0);
		    	    	default:
		    	    		System.out.println("Wrong input! Try Again");
		    	    		
		    	     }
		    	 }
		    	    	 //obj2.close();	
		    	   // obj2.nextLine();	 
		    	 }
		    	 
		     case 9:
			    	System.exit(0);
		    	 
		    	 
	     }
	 
     
	}
if(temp==9)
    	System.exit(0);

	}

}
*/