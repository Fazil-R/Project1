import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HammingDist {
		
	private final String FILE = "Mesonet.txt"; //filename
	private final String NRMN = "NRMN"; //norman STID
	private String city1; //parameter 1
	private String city2; //parameter 2
	private int count1 = 0; //hamming distance of city1 to norman
	private int count2 = 0; //hamming distance of city2 to norman
	private int stid1 = 0; //STID with hamming distance count1 with city1
	private int stid2 = 0; //STID with hamming distance count2 with city2

	
	public HammingDist(String city1, String city2) throws FileNotFoundException, IOException {
		ArrayList<String> stid = readFile(FILE); //reads file of STID into array
		
		this.city1 = city1; //assign privates
		this.city2 = city2;
		
		count1 = NormanDist(city1); //get hamming distance with norman
		
		count2 = NormanDist(city2);
		
		stid1 = Distance(city1, stid, count1); //get STID with hamming distance of count
		
		stid2 = Distance(city2, stid, count2);
		
		}
		
	public int NormanDist(String city) { //get hamming distance with norman
		int count = 0;
		for(int i = 0; i < city.length(); ++i) {
			if(city.charAt(i) != NRMN.charAt(i)) { //comparing chars at the same position
				++count;						//increase count if chars are not the same
			}
		}
		return count;							//returns the hamming distance
	}
	
	public int Distance(String city, ArrayList<String> stid, int dist) { //get the STIDs with hamming distance of a certain count , which is dist
		int count = 0; //the hamming distance
		int cities = 0; //the STID with the hamming distance appropiate hamming distance
		
		for(int i = 0; i < stid.size(); ++i) { //create nested loop, outside is of the Arraylist, inside is the chars at position j
			for(int j = 0; j < city.length(); ++j) {
				if(city.charAt(j) != stid.get(i).charAt(j)) { 
					++count;
				}
			}
			if(count == dist) { //if the count is the same as dist, increment the cities
				++cities;
			}
			count = 0; //reset count
		}
		
		return cities;
		
	}
	
	public static ArrayList<String> readFile(String filename) throws FileNotFoundException, IOException { //reads the file for STID
			
		Scanner file = new Scanner(new FileReader(filename)); //create scanner
			
		ArrayList<String> list = new ArrayList<String>(); //create arrayList
			
		for(int i = 0; i < 5; ++i) { //skip the first 5 lines of to get to the STID
			file.nextLine();
		}
			
		while(file.hasNextLine()) 
		{
			list.add(String.format("%.4s", file.next())); //add formatted String to insure that the STID are all 4 characters
			file.nextLine(); //go to next line
		}
		file.close(); //close file
			
		return list; //return ArrayList
			
		}

	@Override //override the toString of String type so if an object of HammingDist is printed it will be printed in this format
	public String toString() { //return the string  
		String string1 = ("The Hamming distance between Norman and " + city1 + " is " + count1 + "; "); //create different strings to make codes look better
		
		String string2 = ("between Norman and " + city2 + " is " + count2 + ".\n");
		
		String string3 = ("For " + city1 + ": Number of stations with Hamming Distance " + count1 + ": " + stid1 + ".\n");
	
		String string4 = ("For " + city2 + ": Number of stations with Hamming Distance " + count2 + ": " + stid2 + ".\n");
		
		String string = (string1 + string2 + string3 + string4); //add all strings into one
		
		return string; //return the final string
	}
}

