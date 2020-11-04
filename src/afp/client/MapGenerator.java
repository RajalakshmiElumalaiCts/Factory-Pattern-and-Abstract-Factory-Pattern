package afp.client;

import java.util.HashMap;
import java.util.Map;

import afp.client.Client.Apple_Accessorie_Model;
import afp.client.Client.Apple_Computer_Model;
import afp.client.Client.Apple_Watch_Model;
import afp.client.Client.Samsung_Computer_Model;
import afp.client.Client.iPad_Model;
import afp.client.Client.samsung_Accessorie_Model;
import afp.client.Client.samsung_Tablet_Model;
import afp.client.Client.samsung_Watch_Model;

public class MapGenerator {
	
public static Map<String, iPad_Model> generateIpadMap(iPad_Model[] enumValues ) {
		
	 Map<String, iPad_Model> ipadMap = new HashMap<String, iPad_Model>();
		
		int count = 1;
		for (iPad_Model value : enumValues) {
			ipadMap.put(String.valueOf(count), value); 
			count ++; 
			}
		return ipadMap;
	}

public static Map<String, Apple_Watch_Model> generateIWatchMap(Apple_Watch_Model[] values) {
	
	Map<String, Apple_Watch_Model> map = new HashMap<String, Apple_Watch_Model>();
	
	int count = 1;
	for (Apple_Watch_Model value : values) {
		map.put(String.valueOf(count), value); 
		count ++; 
		}
	return map;
}

public static Map<String, Apple_Computer_Model> generateMacMap(Apple_Computer_Model[] values) {

	Map<String, Apple_Computer_Model> map = new HashMap<String, Apple_Computer_Model>();
	
	int count = 1;
	for (Apple_Computer_Model value : values) {
		map.put(String.valueOf(count), value); 
		count ++; 
		}
	return map;
}

public static Map<String, Apple_Accessorie_Model> generateIAccessorieMap(Apple_Accessorie_Model[] values) {

	Map<String, Apple_Accessorie_Model> map = new HashMap<String, Apple_Accessorie_Model>();
	
	int count = 1;
	for (Apple_Accessorie_Model value : values) {
		map.put( String.valueOf(count), value); 
		count ++; 
		}
	return map;
}

public static Map<String, samsung_Tablet_Model> generateSamsungTabMap(samsung_Tablet_Model[] values) {

	Map<String, samsung_Tablet_Model>map = new HashMap<String, samsung_Tablet_Model>();
	
	int count = 1;
	for (samsung_Tablet_Model value : values) {
		map.put( String.valueOf(count), value); 
		count ++; 
		}
	return map;
}

public static Map<String, samsung_Watch_Model> generateSamsungTabMap(samsung_Watch_Model[] values) {
	
Map<String, samsung_Watch_Model> map = new HashMap<String, samsung_Watch_Model>();
	
	int count = 1;
	for (samsung_Watch_Model value : values) {
		map.put( String.valueOf(count), value); 
		count ++; 
		}
	return map;
}

public static Map< String, samsung_Accessorie_Model> generateSamsungTabMap(samsung_Accessorie_Model[] values) {
	
Map<String, samsung_Accessorie_Model> map = new HashMap<String, samsung_Accessorie_Model>();
	
	int count = 1;
	for (samsung_Accessorie_Model value : values) {
		map.put( String.valueOf(count), value); 
		count ++; 
		}
	return map;
}

public static Map<String, Samsung_Computer_Model> generateSamsungTabMap(Samsung_Computer_Model[] values) {
	
	Map<String, Samsung_Computer_Model> map = new HashMap<String, Samsung_Computer_Model>();
	
	int count = 1;
	for (Samsung_Computer_Model value : values) {
		map.put( String.valueOf(count), value); 
		count ++; 
		}
	return map;
}

}
