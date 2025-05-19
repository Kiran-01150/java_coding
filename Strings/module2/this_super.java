
class Book extends Product{
	
	String author,name;
	int Price ;
	double discount,total;
	Book(String author,String name,int Price ,double discount,double total)
	{
		this.name=name ;
		this.author=author;
		this.price = price;
		this.discount = discount;
		this.total = total;
		System.out.println("Book Section");
	}
	void calM2()
	{
		System.out.printn("Book name is " + name + "\nauthor of "+name +" is "+author+"\n At low price of "+price +"\nProviding discount of "+ discount +"%"+"\nTotal price after discount is "+ total +"/-");
	}

}
class Software extends Product {
	
	String software_Name,version;
	int price;
	double discount,total;
	
	Software (String software_Name,String version,int price,double discount,double total)
	{
		this.software_Name = software_Name;
		this.version = version;
		this.price = price;
		this.discount = discount;	
		this.total = total;
	
	}
	void calM1()
	{
		System.out.printn("Software name is " + software_Name + "\nVersion of "+software_Name +" is "+version+"\n At low price of "+price +" per month with unlimited benefits "+"\nProviding discount of "+ discount +"%"+"\nTotal price after discount is "+ total +"/-");
	}
}


class Product {	
		public static void main (String args[])
		{
			
			Software s = new Software("Linkedin Premium"," Kernal V2.23.09",699,10,(699/10)*100);
			Product p = new Product ("Power Of Money","James Williams",259,15,(259/15)*100);
			s.calM1();
			s.calM2();
			
		}
}
	

		