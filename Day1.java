import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums = importFile("nums.txt");
    
    System.out.println(Every3(nums));
    
  }
  public static ArrayList<Integer> importFile(String fileName){
    ArrayList<Integer> nums = new ArrayList<>();
    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        int data = myReader.nextInt();
        nums.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return nums;
  }
  public static int Increasing(ArrayList<Integer> nums){
    int count = 0;
    for(int i = 0; i<nums.size()-1; i++){
      if(nums.get(i) < nums.get(i+1)){
        count++;
      }
    }return count;
  }
  public static int Every3(ArrayList<Integer>nums){
    int count = 0;
    for(int i = 2; i<nums.size()-1;i++){
      int first = nums.get(i-2) + nums.get(i-1) + nums.get(i); 
      int second = nums.get(i-1) + nums.get(i) + nums.get(i+1);
      if(first<second){
        count++;
      }
    }return count;
  }




}
