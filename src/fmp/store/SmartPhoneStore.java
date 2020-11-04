package fmp.store;

import fmp.product.SmartPhone;

public abstract class SmartPhoneStore {
	
	public abstract SmartPhone getSmartPhone(String model);
	
	public SmartPhone orderSmartPhone(String model) {
		
		return getSmartPhone(model);
		
	}

}
