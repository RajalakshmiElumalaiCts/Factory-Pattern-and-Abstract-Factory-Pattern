package afp.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import afp.store.concrete.AppleStore;
import afp.store.concrete.SamsungStore;

public class Client {
	
	public static enum iPad_Model {
		IPadPro, IPadAir, IPadMini
	}
	public static enum Apple_Watch_Model {
		AppleWatchSeries6, AppleWatchHermes
	}

	public static enum Apple_Accessorie_Model {
		AirPod, ApplePencil
	}

	public static enum Apple_Computer_Model {
		MacBook
	}

	public static enum samsung_Tablet_Model {
		GalaxyTabS, GalaxyBook
	}

	public static enum samsung_Watch_Model {
		GalaxyWatch3, GalaxyFit2
	}

	public static enum samsung_Accessorie_Model {
		KeyboardCover, WirelessCharger
	}

	public static enum Samsung_Computer_Model {
		NoteBook
	}

	public static void main(String[] args) {
		
		 Map<String, iPad_Model> ipadMap = MapGenerator.generateIpadMap(iPad_Model.values());
		 Map<String, Apple_Watch_Model> iWatchMap = MapGenerator.generateIWatchMap(Apple_Watch_Model.values());
		 Map<String, Apple_Computer_Model> macMap = MapGenerator.generateMacMap(Apple_Computer_Model.values());
		 Map<String, Apple_Accessorie_Model> iAccessMap = MapGenerator.generateIAccessorieMap(Apple_Accessorie_Model.values());
		 
		 Map<String, samsung_Tablet_Model> sTabMap = MapGenerator.generateSamsungTabMap(samsung_Tablet_Model.values());
		 Map<String, samsung_Watch_Model> sWatchMap = MapGenerator.generateSamsungTabMap(samsung_Watch_Model.values());
		 Map<String, Samsung_Computer_Model> noteBookMap = MapGenerator.generateSamsungTabMap(Samsung_Computer_Model.values());
		 Map<String, samsung_Accessorie_Model> sAccessMap = MapGenerator.generateSamsungTabMap(samsung_Accessorie_Model.values());
		 

		// holds all the shopped items
		List<Object> shoppedItems = new ArrayList<Object>();

		System.out.println("Welcome to the Store..");
		System.out.println("Select one of the items from the list : ");
		System.out.println(" 1. Tablet \n 2. Smart Watch \n 3. Computer \n 4.Accessories \n 5.None");

		Scanner readObj = new Scanner(System.in);
		String deviceOption = readObj.nextLine();

		String model = null;

		while (!"5".equals(deviceOption)) {

			if ("1".equals(deviceOption)) {// purchasing tablets
				System.out.println(" Choose one of the available Tablet models");
				System.out.println("Available iPad:");
				System.out.println(" 1. IPadPro \n 2. IPadAir \n 3. IPadMini");
				System.out.println("Available Samsung Tablet:");
				System.out.println(" 4. GalaxyTabS \n 5. GalaxyBook");

				model = readObj.nextLine();
				if ("1".equals(model) || "2".equals(model) || "3".equals(model)) { //getting ipads
					AppleStore aStore = new AppleStore();
					shoppedItems.add(aStore.getTablet(ipadMap.get(model).toString()));

				} else {// getting samsung tablets
					if ("4".equals(model)) {
						model = "1";
					} else if("5".equals(model)){
						model = "2";
					}
					SamsungStore sStore = new SamsungStore();
					shoppedItems.add(sStore.getTablet(sTabMap.get(model).toString()));
				}

			} else if ("2".equals(deviceOption)) {//purchasing smart watches
				System.out.println(" Choose one of the available Smart watch models");
				System.out.println("Available Apple watches:");
				System.out.println(" 1. AppleWatchSeries6 \n 2. AppleWatchHermes \n");
				System.out.println("Available Samsung watches:");
				System.out.println(" 3. GalaxyWatch3 \n 4. GalaxyFit2");

				model = readObj.nextLine();
				if ("1".equals(model) || "2".equals(model)) { //getting apple watches
					AppleStore aStore = new AppleStore();
					shoppedItems.add(aStore.getSmartWatch((iWatchMap.get(model).toString())));

				} else {// getting samsung watches
					if ("3".equals(model)) {
						model = "1";
					} else if("4".equals(model)){
						model = "2";
					}
					SamsungStore sStore = new SamsungStore();
					shoppedItems.add(sStore.getSmartWatch(sWatchMap.get(model).toString()));
				}
			} else if ("3".equals(deviceOption)) {//purchasing Computer
				System.out.println(" Choose one of the available Computer models");
				System.out.println("Available Mac Books:");
				System.out.println(" 1. MacBook \n ");
				System.out.println("Available Note Books:");
				System.out.println(" 2. NoteBook \n ");

				model = readObj.nextLine();
				if ("1".equals(model) ) { //getting Macbook
					AppleStore aStore = new AppleStore();
					shoppedItems.add(aStore.getComputer(macMap.get(model).toString()));

				} else {// getting Note Book
					if ("2".equals(model)) {
						model = "1";
					} 
					SamsungStore sStore = new SamsungStore();
					shoppedItems.add(sStore.getComputer(noteBookMap.get(model).toString()));
				}			

			} else if ("4".equals(deviceOption)) {//purchasing Accessories
				System.out.println(" Choose one of the available Accessorie models");
				System.out.println("Available Apple Accessories:");
				System.out.println(" 1.AirPod \n 2. ApplePencil \n");
				System.out.println("Available Samsung Accessories:");
				System.out.println(" 3. KeyboardCover \n 4. WirelessCharger \n ");

				model = readObj.nextLine();
				if ("1".equals(model) || "2".equals(model)) { //getting Apple Accessories
					AppleStore aStore = new AppleStore();
					shoppedItems.add(aStore.getAccessorie(iAccessMap.get(model).toString()));

				} else {// getting Samsung Accessories
					if ("3".equals(model)) {
						model = "1";
					} else if("4".equals(model)) {
						model = "2";
					}
					SamsungStore sStore = new SamsungStore();
					shoppedItems.add(sStore.getAccessorie(sAccessMap.get(model).toString()));
				}			

			}

			System.out.println("Would you like to order anything more ..? ");
			System.out.println("Please input appropriate option : ");
			System.out.println(" 1. Tablet \n 2. Smart Watch \n 3. Computer \n 4.Accessories \n 5.None");
			deviceOption = readObj.nextLine();

		}
		
		System.out.println("All the shopped Items --->"+ shoppedItems);

		System.out.println("Enter Mailing Address : ");
		String mailAddress = readObj.nextLine();
		System.out.println("Mailing Address --->" + mailAddress);

		System.out.println("Provide paymnet details..");
		System.out.println("Enter Card Number : ");
		String cardNumber = readObj.nextLine();
		System.out.println("Card number --->" + cardNumber);

		System.out.println("Enter expire date in mm/yyyy format: ");
		String expireDate = readObj.nextLine();
		System.out.println("Expire date --->" + expireDate);

		System.out.println("We received all the information for the purchase..");
		System.out.println("Ordered items " + shoppedItems + " will be delivered to the given address " + mailAddress
				+ " in 2-5 business days..");
		System.out.println("Thanks for shopping..");

		readObj.close();
	}

	

}
