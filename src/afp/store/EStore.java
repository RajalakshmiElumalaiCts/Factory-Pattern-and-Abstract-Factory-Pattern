package afp.store;

import afp.product.Accessorie;
import afp.product.Computer;
import afp.product.SmartWatch;
import afp.product.Tablet;

public abstract class EStore {
	public abstract Accessorie getAccessorie(String model);
	public abstract Tablet getTablet(String model);
	public abstract SmartWatch getSmartWatch(String model);
	public abstract Computer getComputer(String model);

}
