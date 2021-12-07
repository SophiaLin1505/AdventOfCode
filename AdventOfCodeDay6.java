package LatternFish;
import java.util.ArrayList;
import java.math.BigInteger; 

public class Advent6 {
public static void main(String[] args) {
ArrayList<Integer> latternFishy = new ArrayList<>();
 int [] latternFish = {1,3,3,4,5,1,1,1,1,1,1,2,1,4,1,1,1,5,2,2,4,3,1,1,2,5,4,2,2,3,1,2,3,2,1,1,4,4,2,4,4,1,2,4,3,3,3,1,1,3,4,5,2,5,1,2,5,1,1,1,3,2,3,3,1,4,1,1,4,1,4,1,1,1,1,5,4,2,1,2,2,5,5,1,1,1,1,2,1,1,1,1,3,2,3,1,4,3,1,1,3,1,1,1,1,3,3,4,5,1,1,5,4,4,4,4,2,5,1,1,2,5,1,3,4,4,1,4,1,5,5,2,4,5,1,1,3,1,3,1,4,1,3,1,2,2,1,5,1,5,1,3,1,3,1,4,1,4,5,1,4,5,1,1,5,2,2,4,5,1,3,2,4,2,1,1,1,2,1,2,1,3,4,4,2,2,4,2,1,4,1,3,1,3,5,3,1,1,2,2,1,5,2,1,1,1,1,1,5,4,3,5,3,3,1,5,5,4,4,2,1,1,1,2,5,3,3,2,1,1,1,5,5,3,1,4,4,2,4,2,1,1,1,5,1,2,4,1,3,4,4,2,1,4,2,1,3,4,3,3,2,3,1,5,3,1,1,5,1,2,2,4,4,1,2,3,1,2,1,1,2,1,1,1,2,3,5,5,1,2,3,1,3,5,4,2,1,3,3,4};
 latternFishy = Fill(latternFish);
 ArrayList<Integer> finalfishy = new ArrayList<>();
int count = spawn(latternFishy, 80);
 System.out.println(count);
 

 	
}public static ArrayList<Integer> Fill(int[] latternFish){
	ArrayList<Integer> latternFishy = new ArrayList<>();
	for(int i = 0; i<latternFish.length; i++) {
		latternFishy.add(latternFish[i]);
	}
	return latternFishy;
	
} public static int spawn (ArrayList<Integer> nums, int days){
	for(int x = 0; x<days; x++ ) {
	for(int i = 0; i<nums.size(); i++) {
		if(nums.get(i) != 0) {
			nums.set(i,  nums.get(i)-1);
		} else {
			nums.set(i,  6); 
			nums.add(9);
		}
		
	}
	}return nums.size();
	
	
} public static int length(ArrayList<Integer> nums) {
	int count = 0;
	for(int i = 0; i<nums.size(); i++) {
		count ++;
	}
	return count;
}
	}
