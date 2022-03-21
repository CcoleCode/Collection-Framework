import java.util.HashMap;
import java.util.Map;

public class Weather {
	
	static HashMap<String, Float> weather = new HashMap<String,Float>();

	public static void main(String[] args) {
		
		weather.put("wind", 55f);
		weather.put("minTemperature", 20.5f);
		weather.put("maxTemperature", 50.8f);
		weather.put("humidity", 50.0f);
		weather.put("airPressure", 12f);
		
		System.out.println("First get all keys in the Map using the keySet method and then iterate through the map by each key: ");
		iterateUsingKeySetAndForeach(weather);
		System.out.println("----------");
		System.out.println("Extract the SET of entries from the Map and then iterate through them with a for-each approach: ");
		iterateUsingEntrySet(weather);
		
		System.out.println("----------");
		System.out.println("Modify the wind element: ");
		modifyTheValue(weather);
		System.out.println("Remove the Air Pressure: ");
		removeAirPressure(weather);
		
		System.out.println("---------");
		System.out.println("Clear the Hash: ");
		clearTheHash(weather);	
	}
	
	
	
		//keySet()
		public static void iterateUsingKeySetAndForeach(Map<String, Float> weather) {
		for(@SuppressWarnings("unused") String key : weather.keySet()) {
		System.out.println(weather + ":" + weather.get("wind"));
		}
	}
		//EntrySet()
		public static void iterateUsingEntrySet(Map<String, Float> weather) {
		
		for(Map.Entry<String, Float> entry : weather.entrySet()) {
			System.out.println("Today's " + entry.getKey() + ": is " + entry.getValue());
		}

	}
		
		public static void modifyTheValue(Map<String, Float> weather) {
			
			weather.replace("wind", 55f, 35f);
			System.out.println(weather);
		}
		
		public static void removeAirPressure(Map<String, Float> weather) {
			
			Weather.weather.remove("airPressure", 12f);
			System.out.println(weather);
			
		}
		
		public static void clearTheHash(Map<String, Float> weather) {
			
			weather.clear();
			System.out.println(weather);
		}

}
