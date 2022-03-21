import java.util.ArrayList;
import java.util.HashSet;

public class MoreCollections {

	public static void main(String[] args) {
		
		//Create an arrayList of Strings
		ArrayList<String> tvshows = new ArrayList<String>();
		
		tvshows.add("Prison Break");
		tvshows.add("Veep");
		tvshows.add("Friends");
		tvshows.add("Veep");
		
		System.out.println(tvshows);
		
		//Create HashSet with that ArrayList
		HashSet<String> uniqueTvShows = new HashSet<String>(tvshows);
		
		System.out.println(uniqueTvShows);
		
		//Create a HashMap
		//iterate over it
	}

}
