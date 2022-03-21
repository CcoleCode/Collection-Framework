import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("mSantaFe",  "The Million Program");
		capitalCities.put("alexHi", "freezing");
		
		System.out.println(capitalCities);
		
		capitalCities.put("alexHi", "fre");
		System.out.print(capitalCities);
		
		capitalCities.get("alexHi");
		capitalCities.remove("alexHi");
		
		System.out.println(capitalCities);
	}

}
