package in.mkpits.abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Registration extends FirstStep {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

	@Override
	public void BankName() throws IOException 
	{
		System.out.print("Enter Bank Name :- ");
		
		while(true) 
		{
			String name = br.readLine();
			if (name.isEmpty()) 
			{
				System.err.println("Please Enter Details!! ");
				continue;
			}break;
			
		}
		
	}

	@Override
	public void CreateAccount() throws IOException 
	{
		System.out.println("Create an Account :- ");
		while (true)
		{
			String n = br.readLine();
			if(n.isEmpty());
			{
				System.err.println("Please Enter Details!! ");
				continue;
			}
		}
		

	}

	@Override
	public void Deposit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Withdrawl() {
		// TODO Auto-generated method stub

	}

	@Override
	public void CheckBalance() {
		// TODO Auto-generated method stub

	}

}
