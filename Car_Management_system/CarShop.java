package Car_Management_system;

import java.util.Scanner;

public class CarShop {
    Scanner sc=new Scanner(System.in);
	
	Car car[];
	static int count;
	public
	CarShop()
	{
		car=new Car[100];
		count=0;
	}
	
	void addCar()
	{
		System.out.println("Enter the Car id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter the Car name : ");
		String name = sc.next();
		
		System.out.println("Enter the Available Car : ");
		int availableCount = sc.nextInt();
		
		car[count]=new Car(id, name ,availableCount);
		count++;
	}
	
	void displayCar()
	{
		for(int i = 0;i<count;i++) {
			System.out.println(car[i].toString());
		}
	}
	
	void searchById()
	{
		System.out.println("Enter Car Registration Id : ");
		int id = sc.nextInt();
		for(int i = 0;i<count;i++) {
			if(car[i].getId()==id) {
				System.out.println("Found");
				System.out.println(car[i].toString());
				return;
			}
			
		}
		System.out.println("Not found");
	}
	
	void bookCar()
	{
		System.out.println("Enter Car Registration Id : ");
		int id = sc.nextInt();
		for(int i=0;i<count;i++)
		{
			if(car[i].getId()==id)
			{
                System.out.println("Found");
                System.out.println(car[i].toString());
				if(car[i].getAvailableCount() > 0){
                    System.out.println("Car book Successfully");
                    car[i].setAvailableCount(car[i].getAvailableCount() - 1);
                    return;
                }
			}
			
		}
        System.out.println("Not found");
		
	}
	
	void returnCar()
	{
		System.out.println("Enter Car Registration Id : ");
		int id = sc.nextInt();
		for(int i=0;i<count;i++)
		{
			if(car[i].getId()==id)
			{
                System.out.println("Car Returned Successfully");
                car[i].setAvailableCount(car[i].getAvailableCount() + 1);
                return;
			}
		}
        System.out.println("Not found");
	}

}
