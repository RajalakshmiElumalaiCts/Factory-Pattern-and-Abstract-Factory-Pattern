package fmp.store.concrete;

import fmp.product.SmartPhone;
import fmp.product.apple.AppleSmartPhone;
import fmp.product.apple.concrete.IPhone11;
import fmp.product.apple.concrete.IPhone11Pro;
import fmp.product.apple.concrete.IPhone11ProMax;
import fmp.store.SmartPhoneStore;

public class AppleStore extends SmartPhoneStore {
	
	public enum iPhone_Model {
		IPhone11ProMax, IPhone11Pro, IPhone11		
	}

	@Override
	public SmartPhone getSmartPhone(String model) {
		
		iPhone_Model modelName = iPhone_Model.valueOf(model);
		AppleSmartPhone phoneToReturn = null;
		
		System.out.println("Received order for the mobile "+ model);
		switch(modelName) {
		
		case IPhone11ProMax:
			phoneToReturn = new IPhone11ProMax();
			break;
			
		case IPhone11Pro:
			phoneToReturn = new IPhone11Pro();
			break;
			
		case IPhone11:
			phoneToReturn = new IPhone11();
			break;
		
		}
		return phoneToReturn;
	}
}
