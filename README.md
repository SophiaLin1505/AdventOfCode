# AdventOfCode
Advent of Code 2021 
* **Day 1 2021: Sonar Sweep**
  * Part one: In part one the objective was to determine the number of times the depth increased from the submarine sweep. To do this I imported the text file given and then converted that text file into an Array List of integers. This is shown in the first method in my code for Day one called *importFile*. The next method called *Increasing* returns the number of times the depth increases. First, I initialize an integer called count, which will count the number of increases. The method goes through each number in the ArrayList and determines whether or not the next number is greater. If it is, than count is increased by one. Finally, the method returns count after it has gone through every number in the list. 
  * Part two: In part two instead of going through every number in the list and determining the number of times the depth increases, it counts the number of times the sum of measurements with three numbers increases. The method called *Every3* goes through the values in the list and takes the sum of three. That value is saved to *first*. The next set of three is saved to *second*. The two are compared and if second is greater than first than count is increased by one. The method returns count after it has gone through the entire list. 
  * *In Day 1, I learned how to import a text file and convert it to an ArrayList of integers*


* **Day 1 2015: Not Quite Lisp**
  * Part one: In part one of Not Quite List, the objective was to determine the floor Santa needs to get on to deliver presents. The directions are in parenthesis. And open parenthesis "(" means to go up one floor, and the closed parenthesis ")" means to go down one floor. To start, I imported my direction into an ArrayList of Strings. Because the directions is formatted into one line, the first value of the ArrayList is the entire directions Santa needs. I set a variable called *flooring* to equal this string. Next, I created a method that takes in the String of directions called *floor*. I intialized a floor coun equal to 0. The method goes through every character in the string. If the character is equal to "(" then one is added to floor. If the character is equal to ")" then one is subtracted from floor. The method then returns floor.
  * *In this day, I refreshed my memory of how to use String methods like the ".equals" method*


* **Day 3 2021: Binary Diagnostic**
  * Part one: The objective was to calculate the power consumption of the submarine. To do this I imported the data set into an ArrayList of Integers. I found the number of rows in the data set and then found the columns. These are all found in the methods labeled *Importing Files, Rows, and Col* with these three methods I was able to create a 2d array of integers. This is found in the method *making2d*. In the method called *gamma* I created a String called gamma and epislon that stores the the bits in the 2d array. Next in the *binary* method I convert the String gamma and epislon into decimal numbers from a binary number. 
  * *In this day, I learned how to convert an ArrayList of integers into a 2d array. 

* **Day 
  
* **Day 6: Lanternfish**
  * Part one: In part one, we wanted to find how many lanternfish would there be after 80 days? First, I intialized an integer array and pasted the data set into the array. The first method called *Fill* converts this integer array to a integer array list. The second method called *spawn* takes in an ArrayList as well as the number of days you want to evaluate. It goes through every value in the ArrayList. If the value does not equal 0, than the value is deacreased by one. Otherwise, the value is set to 6 and 9 is added to the end of the ArrayList. This repeats the number of days times. Finally, the size of the ArrayList is returned. 




  


