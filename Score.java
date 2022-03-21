import java.util.ArrayList;

public class Score {

	public static void main(String[] args, int i) {
		
		//Arraylist of integers
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		//Returns the number of elements in the array list
		System.out.println(scores.size());//Arrays we used .length attribute, String.length()
		
		//Add elements to list
		scores.add(2);//Autoboxing
		
		scores.add(3);
		
		scores.add(2);
		
		scores.add(3);
		scores.add(0, 56); //Insert element 56 at index 0
		
		System.out.println(scores.size());//ArrayLists are dynamic
		
		int[] scoresArray = new int[5];
		System.out.print(scoresArray.length); // This will print 5 since size is fixed
		
		
		//scores.remove(2);//Remove element from that index
		//score.remove(Object) // remove that object from the arrayList
		
		System.out.println(scores.size());
		
		//For-each loop
		//for(TypeThatArrayListHolds variableName : arrayListName)
		for(Integer a : scores) {
			
			System.out.println(a);
		}
		
		//for(start; condition; update)
		//do-while, while, for range, for-each each element in array or arraylist
		for(int i = 0; i <= scores.size()-1; i++);
		
		System.out.println(scores.get(i));
	
	
	System.out.println(scores.isEmpty()); //false //condition
	
	//scores.size() == 0;

	ArrayList<String> students = new ArrayList<String>();
	
	students.add("Chelsea");
	students.add("Jon");
	students.add("Sudha");
	
	System.out.println(students.size());//3
	
	System.out.println(students.isEmpty());//false
	
	students.set(1, "Rehna");//Replaces Jon with Rehna
	
	students.remove("Sudha");//Removes the element Sudha
	
	System.out.println(students.size());
	
	System.out.println(students.get(2));
}

}
