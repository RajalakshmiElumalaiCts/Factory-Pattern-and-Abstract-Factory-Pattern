package fmp.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import fmp.product.SmartPhone;
import fmp.store.concrete.AppleStore;
import fmp.store.concrete.SamsungStore;

public class Client {
		
	private static Map<String, String> iphoneModel = new HashMap<String, String>();
	private static Map<String, String> samsungModel = new HashMap<String, String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone shoppedPhone = null;
		List<String> shoppedItems = new ArrayList<String>();
		
		iphoneModel.put("1", "IPhone11ProMax");
		iphoneModel.put("2", "IPhone11Pro");
		iphoneModel.put("3", "IPhone11");
		
		samsungModel.put("1", "GalaxyNote10");
		samsungModel.put("2", "GalaxyS10");
		
		System.out.println("Welcome to Mobile Store..");
		System.out.println("Select one of the models by inputting the number 1 or 2");
		System.out.println(" 1. iPhone \n 2. Samsung \n 3. None");
		
		Scanner readObj = new Scanner(System.in);
		String mobileOption  = readObj.nextLine();
		
		String model = null;
		
		while(! "3".equals(mobileOption)) {
			
			if("1".equals(mobileOption)) {
				System.out.println(" Choose one of the available iPhone models");
				System.out.println(" 1. IPhone11ProMax \n 2. IPhone11Pro \n 3. IPhone11");
				model  = readObj.nextLine();
				AppleStore aStore = new AppleStore();
				shoppedPhone = aStore.getSmartPhone(iphoneModel.get(model)); 
				System.out.println(iphoneModel.get(model) +" is ready for the purchase..");
				model = iphoneModel.get(model);
				shoppedItems.add(model);
				
			}
			else if("2".equals(mobileOption) ){
				System.out.println(" Choose one of the available Samsung models");
				System.out.println(" 1. GalaxyNote10 \n 2. GalaxyS10 ");
				model = readObj.nextLine();
				SamsungStore sStore = new SamsungStore();
				shoppedPhone = sStore.getSmartPhone(samsungModel.get(model)); 
				System.out.println(samsungModel.get(model) +" is ready for the purchase..");
				model = samsungModel.get(model);
				shoppedItems.add(model);
			}
			
			System.out.println("Would you like to order anything more ..? ");
			System.out.println("Please input appropriate option : ");
			System.out.println(" 1. iPhone \n 2. Samsung \n 3. None");
			mobileOption  = readObj.nextLine();
			
		}
		System.out.println("Mobile purchased : "+ shoppedItems);
		
		System.out.println("Enter Mailing Address : ");	
		String mailAddress = readObj.nextLine();
		
		System.out.println("Provide paymnet details..");
		System.out.println("Enter Card Number : ");	
		String cardNumber = readObj.nextLine();
		
		System.out.println("Enter expire date in mm/yyyy format: ");
		String expireDate = readObj.nextLine();
		
		System.out.println("We received all the information..");
		System.out.println("Ordered items "+ shoppedItems +" will be delivered to the given address "+mailAddress+" in 2 business days..");
		System.out.println("Card with number "+ cardNumber +" is charged for the purchase..");
		System.out.println("Thanks for shopping..");
		
		readObj.close();
	}

}
