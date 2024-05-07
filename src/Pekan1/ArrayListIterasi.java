package Pekan1;
import java.util.ArrayList;
public class ArrayListIterasi {

	public static void main(String[] args) {
		//Cheating an ArrayList of string type
		ArrayList<String> al = new ArrayList<String>();
		//adding elements to array 
		//using standard add() method
		al.add("saya");
		al.add("informatika");
		al.add(1, "mahasiswa");
		//using the get method and the 
		//for loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i) + " ");
		}
		System.out.println();
		//using the for each loop 
		for (String str : al)
		System.out.print(str + " ");
		System.out.println();
		//printing all elements of ArrayList
		System.out.println("Initial ArrayList " + al);
		//Removing element from above ArrayList
		al.remove(1);
		//printing the updated ArrayList Elements
		System.out.println("After the index removal " + al);
		//removing this word element in ArrayList
		al.remove("saya");
		//now printing updated ArrayList 
		System.out.println("After the Object Removal " + al);
		
	}

}
