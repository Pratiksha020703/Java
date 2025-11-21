package Car_Management_system;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        CarShop  c = new CarShop();
		Scanner sc = new Scanner(System.in);
		int ch=0;
		System.out.println("=================Car Management System=================");
		
		do {
			System.out.println("1.Add Car \n2.Display Car \n3.Search car \n4.Book Car \n5.Return Car \n0.Exit");
			System.out.println("Enter the choice");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					c.addCar();
					break;
					
				case 2:
					c.displayCar();
					break;
					
				case 3:
					c.searchById();
					break;
					
				case 4:
					c.bookCar();
					break;
					
				case 5:
					c.returnCar();
					break;
					
				case 0:
					System.out.println("Thank you for Visiting...");
					break;
					
				default:
					System.out.println("Invalid Choice");
					break;
			}
			
		} while (ch!=0);
    }
}
