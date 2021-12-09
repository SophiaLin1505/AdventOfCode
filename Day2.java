import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> words =importFile("thing.txt");
    System.out.println(Aim(words));  
  }

  public static ArrayList<String> importFile(String fileName){
    ArrayList<String> words = new ArrayList<>();
    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        words.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return words;
  }
    
    //Part one
   public static int  Horizontal(ArrayList<String> words){
      int HorizontalCount = 0;
      for(int i = 0; i<words.size(); i++){
        if(words.get(i).length()>7){
          if(words.get(i).substring(0,7).equals("forward")){
            int x = Integer.parseInt(words.get(i).substring(8,9));
            HorizontalCount = HorizontalCount + x;
          } 
        } 
      }
        return HorizontalCount;
    } 
 


    public static int vertical (ArrayList<String> words){
      int VerticalCount = 0;
      for(int i = 0; i<words.size(); i++){
        if(words.get(i).length()>2){
          if(words.get(i).substring(0,2).equals("up")){
            int x = Integer.parseInt(words.get(i).substring(3,4));
            VerticalCount = VerticalCount - x;
          } 
        } 
      } for(int j = 0; j<words.size(); j++){
          if(words.get(j).length()>4){
            if(words.get(j).substring(0,4).equals("down")){
              int y = Integer.parseInt(words.get(j).substring(5,6));
              VerticalCount = VerticalCount + y;
            }
          }
      }
      return VerticalCount;
}

//part 2
public static int  Aim(ArrayList<String> words){
      int HorizontalCount = 0;
       int VerticalCount = 0;
      int aim = 0;
      //horizontal 
      for(int i = 0; i<words.size(); i++){
        if(words.get(i).length()>7){
          if(words.get(i).substring(0,7).equals("forward")){
            int x = Integer.parseInt(words.get(i).substring(8,9));
            HorizontalCount = HorizontalCount + x;
            System.out.println(HorizontalCount);
            System.out.println(aim);
            
            VerticalCount = VerticalCount + (x * aim);
            System.out.println(VerticalCount);

            
          } 
        } 
        if(words.get(i).length()>2){
          if(words.get(i).substring(0,2).equals("up")){
            int x = Integer.parseInt(words.get(i).substring(3,4));
            
            aim = aim-x;
          } 
        } if(words.get(i).length()>4){
            if(words.get(i).substring(0,4).equals("down")){
              int y = Integer.parseInt(words.get(i).substring(5,6));
            
              aim = aim + y;
            }
          } 
          
      } 
      return VerticalCount * HorizontalCount;
     
     
     
        
    } 
