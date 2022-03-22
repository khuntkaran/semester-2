import java.util.Scanner;
class Bank_Account
{
	int accountno;
	String username;
	String email;
	String accounttype;
	int accountbalance;

	void getaccountdetails()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter account_no : ");
		accountno = input.nextInt();

        System.out.print("enter user_name : ");
        input.nextLine();
        username = input.nextLine();

        System.out.print("enter emain : ");
        email = input.nextLine();

        System.out.print("enter account_type : ");
        accounttype = input.nextLine();

        System.out.print("enter account_balance : ");
		accountbalance = input.nextInt();
	}
	void displayaccountdetails()
	{
		System.out.println("===========================================");
		System.out.println("your account_no = "+accountno);
		System.out.println("user_name = "+username);
		System.out.println("your email = "+email);
		System.out.println("your account_type = "+accounttype);
		System.out.println("your account_balance = "+accountbalance);
	}
}

public class Bank_Account_Demo
{
	public static void main(String[] args)
	{
		// Bank_Account c1 = new Bank_Account();
		// Bank_Account c2 = new Bank_Account();
		// Bank_Account c3 = new Bank_Account();

		// c1.getaccountdetails();
		// c1.displayaccountdetails();

		// c2.getaccountdetails();
		// c2.displayaccountdetails();

		// c3.getaccountdetails();
		// c3.displayaccountdetails();

		Bank_Account[] c=new Bank_Account[3];
		
		for (int i=0;i<3;i++) {
			c[i]= new Bank_Account();
			c[i].getaccountdetails();
		}

		for (int i=0;i<3;i++) {
			c[i].displayaccountdetails();
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter accountno to get information :");
		int a = input.nextInt();

		for(int i=0;i<3;i++)
		{

			if(c[i].accountno==a){
				c[i].displayaccountdetails();
			}
		}
	}
}
