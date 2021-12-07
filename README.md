# AdventOfCode
Advent of Code 2021 
* **Day 1: Sonar Sweep**
  * Part one: In part one the objective was to determine the number of times the depth increased from the submarine sweep. To do this I imported the text file given and then converted that text file into an Array List of integers. This is shown in the first method in my code for Day one called *importFile*. The next method called *Increasing* returns the number of times the depth increases. First, I initialize an integer called count, which will count the number of increases. The method goes through each number in the ArrayList and determines whether or not the next number is greater. If it is, than count is increased by one. Finally, the method returns count after it has gone through every number in the list.   
  * Part two: In part two instead of going through every number in the list and determining the number of times the depth increases, it counts the number of times the sum of measurements with three numbers increases. The method called *Every3* goes through the values in the list and takes the sum of three. That value is saved to *first*. The next set of three is saved to *second*. The two are compared and if second is greater than first than count is increased by one. The method returns count after it has gone through the entire list. 
  
* **Day 6: Lanternfish**
  * Part one: In part one, we wanted to find how many lanternfish would there be after 80 days? First, I intialized an integer array and pasted the data set into the array. The first method called *Fill* converts this integer array to a integer array list. The second method callse *spawn* takes in an ArrayList as well as the number of days you want to evaluate. It goes through every value in the ArrayList. If the value does not equal 0, than the value is deacreased by one. Otherwise, the value is set to 6 and 9 is added to the end of the ArrayList. This repeats the number of days times. Finally, the size of the ArrayList is returned. 


  


