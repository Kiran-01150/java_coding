import java.util.Scanner;
class Application
{

	public static void main ( String args[])
	{
	
		System.out.println("Welcome to Zen Electronics ");
		
		int m_price = 256000,s_price = 123999, d_price = 98999, ps_price = 56999, quantity=0,total=0;
		//boolean cond=true;


		while(true)
		{
			System.out.println("1. MacBook Air \n" + "2. Samsung S24 Ultra \n"+"3. Dell Gaming pc\n"+"4. PS5(Play Station)");	
			System.out.println("Select 1 to 4 to add your product in the Cart ");
			Scanner sc = new Scanner(System.in);
			int selection = sc.nextInt();


			switch(selection)
			{
				case 1:
					System.out.println("You have choosed MackBook Air and the price is "+m_price);
					System.out.println("Select the quantity You want to purchase");
					quantity = sc.nextInt();
					total= total+(m_price*quantity);
					//System.out.println("Total Amount is ");
					break; 
				case 2:
					System.out.println("You have choosed Samsung S24 ultra  and the price is "+s_price);
					System.out.println("Select the quantity You want to purchase");
					quantity = sc.nextInt();
					total= total+(s_price*quantity);
					//System.out.println("Total Amount  is ");
					break;

				case 3:
					System.out.println("You have choosed Dell gaming pc and the price is "+d_price);
					System.out.println("Select the quantity You want to purchase");
					quantity = sc.nextInt();
					total= total+(d_price*quantity);
					//System.out.println("Total Amount is ");
					break;
				case 4:
					System.out.println("You have choosed PS5 (playstation 5) and the price is "+ps_price);
					System.out.println("Select the quantity You want to purchase");
					quantity = sc.nextInt();
					total= total+(ps_price*quantity);
					//System.out.println("Total Amount is ");
					break;
				default:
					System.out.println("Please Provide the proper intput /n"+"Thank You!");
					break;
				}

					System.out.println("Would you like to continue shopping and get additional benifits of discounts");
					String opinion = sc.next();
				if (opinion.equals("no"))
				{

					//final_amt= total0+total1+total2+total3;
					System.out.println("Your final amount is "+total);
					break;
				}
					
			}

				
			
		










	}
}