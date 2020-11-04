package afp.store.concrete;

import afp.client.Client;
import afp.product.Accessorie;
import afp.product.Computer;
import afp.product.SmartWatch;
import afp.product.Tablet;
import afp.product.apple.accessorie.AirPod;
import afp.product.apple.accessorie.ApplePencil;
import afp.product.apple.computer.MacBook;
import afp.product.apple.ipad.IPadAir;
import afp.product.apple.ipad.IPadMini;
import afp.product.apple.ipad.IPadPro;
import afp.product.apple.smartwatch.AppleWatchHermes;
import afp.product.apple.smartwatch.AppleWatchSeries6;
import afp.store.EStore;

public class AppleStore extends EStore {

	@Override
	public Accessorie getAccessorie(String model) {
		
		Client.Apple_Accessorie_Model modelName = Client.Apple_Accessorie_Model.valueOf(model);
		Accessorie itemRequested = null;
		
		System.out.println("Received order for the Accessorie "+ modelName);
		
		switch(modelName) {
		
		case AirPod:
			itemRequested = new AirPod();
			break;
			
		case ApplePencil:
			itemRequested = new ApplePencil();
			break;
		}
		
		return itemRequested;
	}

	@Override
	public Tablet getTablet(String model) {
		
		Client.iPad_Model modelName = Client.iPad_Model.valueOf(model);
		Tablet itemRequested = null;
		
		System.out.println("Received order for the iPad "+ modelName);
		
		switch(modelName) {
		
		case IPadPro :
			itemRequested = new IPadPro();
			break;
			
		case IPadAir:
			itemRequested = new IPadAir();
			break;
			
		case IPadMini:
			itemRequested = new IPadMini();
			break;
			
		}
		
		return itemRequested;
	}

	@Override
	public SmartWatch getSmartWatch(String model) {
		
		Client.Apple_Watch_Model modelName = Client.Apple_Watch_Model.valueOf(model);
		SmartWatch itemRequested = null;
		
		System.out.println("Received order for the Smart watch "+ modelName);
		
		switch(modelName) {
		
		case AppleWatchSeries6:
			itemRequested = new AppleWatchSeries6();
			break;
			
		case AppleWatchHermes:
			itemRequested = new AppleWatchHermes();
			break;
		}
		
		return itemRequested;
	}

	@Override
	public Computer getComputer(String model) {
		
		Client.Apple_Computer_Model modelName = Client.Apple_Computer_Model.valueOf(model);
		Computer itemRequested = null;
		
		System.out.println("Received order for the Computer "+ modelName);
		
		switch(modelName) {
		
		case MacBook:
			itemRequested = new MacBook();
			break;			
		
		}
		
		return itemRequested;
	}

}
