package fmp.store.concrete;

import fmp.product.SmartPhone;
import fmp.product.samsung.SamsungSmartPhone;
import fmp.product.samsung.concrete.GalaxyNote10;
import fmp.product.samsung.concrete.GalaxyS10;
import fmp.store.SmartPhoneStore;

public class SamsungStore extends SmartPhoneStore {

	
	public enum Samsung_Model {
		GalaxyNote10, GalaxyS10
	}

	@Override
	public SmartPhone getSmartPhone(String model) {
		
		Samsung_Model modelName = Samsung_Model.valueOf(model);
		SamsungSmartPhone phoneToReturn = null;
		
		switch(modelName) {
		
		case GalaxyNote10:
			phoneToReturn = new GalaxyNote10();
			break;
			
		case GalaxyS10:
			phoneToReturn = new GalaxyS10();
			break;			
			
		}
		return phoneToReturn;
	}


}
