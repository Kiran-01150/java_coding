class Bill
	{
		public static void main(String args [])
{




System.out.println("\t\t\t\t\t\t\tPista House\n"+"\t\t\t\t\t\t\t= = = = = = ");
    System.out.println( "\t\tAddress:Jntuh,hyderabad,5000722  "+"Phone:9848222556 \t \n"+"\t\t\t     e_mail:"+"pistahouse_jntu@gmail.com");
    System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n");
    System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
    System.out.println("\tItem Name"+"\t\t\tQuantity"+"\t\t Price"+"\t\t\tTotal ");
    String item1 = "Mutton Biryani";
    String item2 = "Chicken Haleem";
    String item3 = "Chicken Mejestic";
    String item4 = "Water Bottle";
   
     
    double discount1=0,discount2=0;


    String disc = "coupon";
    
    double price1 = 399.0;
    double price2 = 180.0;
    double price3 = 250.0;
    double price4 = 50.0;
    
    int qty1 = 1; 
    int qty2 = 2; 
    int qty3 = 1; 
    int qty4 = 3;

    double total1 = price1 * qty1;
    double total2 = price2 * qty2;
    double total3 = price3 * qty3;
    double total4 = price4 * qty4;
	

    	
    
    
    double total_Amt = total1+total2 +total3 +total4;
    
    

   // double final_Amt1 = total_Amt -cupon_disc-card_off;
    
   // double Amt_after_disc = final_Amt1 + tax;

    
    System.out.println( "\t"+item1 + "\t\t\t" + qty1 + "\t\t\t" + price1 + "\t\t\t " + total1);
    System.out.println("\t"+item2 + "\t\t\t" + qty2 + "\t\t\t" + price2 + " \t\t\t" + total2);
    System.out.println("\t"+item3 + "\t\t" + qty3 + "\t\t\t" + price3 + " \t\t\t" + total3);
    System.out.println("\t"+item4 + "\t\t\t" + qty4 + "\t\t\t" + price4 + " \t\t\t" + total4);
   
           if (disc=="coupon")
    {
        discount1= ((10.0/100)*total_Amt);
	
    }

        else if (disc == "restaurent")
	{
	     discount2= ((7.5/100)*total_Amt);
           
	}	

   // double cupon_disc = discount;
    //double resturent = (7.5/100*total_Amt);
    double final_Amt1 = total_Amt - discount1-discount2;
    double cgst = (7.0/100 * final_Amt1);
    double sgst = (7.5/100 * final_Amt1);
    double final_Amt2 = (int)(final_Amt1 + cgst + sgst);
    


   
    
    System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
    System.out.println("\n\t\t\t\t\t\t\t\t  Total Amount: Rs. " + total_Amt);
    
    System.out.println("\t\t\t\t\t \t\t\t  Total Amount after dicounts: Rs. " + final_Amt1);
    System.out.println("\t\t\t\t\t \t\t\t  Total Amount Payable : Rs. " + final_Amt2);

    System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \n");

      
    System.out.println("\t Restarent offer (7.5%) is Rs."+discount1);
     System.out.println("\tCupon Discount(10%) is Rs."+discount2);
   System.out.println("\t CGST Tax (7.0%): Rs. " + cgst);
    System.out.println("\t SGST Tax (7.5%): Rs. " + sgst);
    System.out.println("\tFinal Amount (including tax): Rs. " +final_Amt2);
}
}

