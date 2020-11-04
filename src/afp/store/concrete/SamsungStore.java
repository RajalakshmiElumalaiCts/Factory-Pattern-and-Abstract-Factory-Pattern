package afp.store.concrete;

import afp.client.Client;
import afp.product.Accessorie;
import afp.product.Computer;
import afp.product.SmartWatch;
import afp.product.Tablet;
import afp.product.samsung.accessorie.KeyboardCover;
import afp.product.samsung.accessorie.WirelessCharger;
import afp.product.samsung.computer.NoteBook;
import afp.product.samsung.smartwatch.GalaxyFit2;
import afp.product.samsung.smartwatch.GalaxyWatch3;
import afp.product.samsung.tablet.GalaxyBook;
import afp.product.samsung.tablet.GalaxyTabS;
import afp.store.EStore;

public class SamsungStore extends EStore {

	@Override
	public Accessorie getAccessorie(String model) {
		
		Client.samsung_Accessorie_Model modelName = Client.samsung_Accessorie_Model.valueOf(model);
		Accessorie itemRequested = null;
		
		System.out.println("Received order for the Accessorie "+ modelName);
		
		switch(modelName) {
		
		case KeyboardCover:
			itemRequested = new KeyboardCover();
			break;
			
		case WirelessCharger:
			itemRequested = new WirelessCharger();
			break;
		}
		
		return itemRequested;
	}

	@Override
	public Tablet getTablet(String model) {
		
		Client.samsung_Tablet_Model modelName = Client.samsung_Tablet_Model.valueOf(model);
		Tablet itemRequested = null;
		
		System.out.println("Received order for the Samsung Tablet "+ modelName);
		
		switch(modelName) {
		
		case GalaxyTabS :
			itemRequested = new GalaxyTabS();
			break;
			
		case GalaxyBook :
			itemRequested = new GalaxyBook();
			break;
					
		}
		
		return itemRequested;
	}

	@Override
	public SmartWatch getSmartWatch(String model) {
		
		Client.samsung_Watch_Model modelName = Client.samsung_Watch_Model.valueOf(model);
		SmartWatch itemRequested = null;
		
		System.out.println("Received order for the Samsung Smart Watch "+ modelName);
		
		switch(modelName) {
		
		case GalaxyWatch3:
			itemRequested = new GalaxyWatch3();
			break;
			
		case GalaxyFit2:
			itemRequested = new GalaxyFit2();
			break;
		}
		
		return itemRequested;
	}

	@Override
	public Computer getComputer(String model) {
		
		Client.Samsung_Computer_Model modelName = Client.Samsung_Computer_Model.valueOf(model);
		Computer itemRequested = null;
		
		System.out.println("Received order for the Computer "+ modelName);
		
		switch(modelName) {
		
		case NoteBook:
			itemRequested = new NoteBook();
			break;			
		
		}
		
		return itemRequested;
	}

}
