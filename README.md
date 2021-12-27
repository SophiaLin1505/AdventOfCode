# AdventOfCode
Advent of Code 2021 
* **Day 1 2021: Sonar Sweep**
  * Part one: In part one the objective was to determine the number of times the depth increased from the submarine sweep. To do this I imported the text file given and then converted that text file into an Array List of integers. This is shown in the first method in my code for Day one called *importFile*. The next method called *Increasing* returns the number of times the depth increases. First, I initialize an integer called count, which will count the number of increases. The method goes through each number in the ArrayList and determines whether or not the next number is greater. If it is, than count is increased by one. Finally, the method returns count after it has gone through every number in the list. 
  * Part two: In part two instead of going through every number in the list and determining the number of times the depth increases, it counts the number of times the sum of measurements with three numbers increases. The method called *Every3* goes through the values in the list and takes the sum of three. That value is saved to *first*. The next set of three is saved to *second*. The two are compared and if second is greater than first than count is increased by one. The method returns count after it has gone through the entire list. 
  * *In Day 1, I learned how to import a text file and convert it to an ArrayList of integers*




* **Day 1 2015: Not Quite Lisp**
  * Part one: In part one of Not Quite List, the objective was to determine the floor Santa needs to get on to deliver presents. The directions are in parenthesis. And open parenthesis "(" means to go up one floor, and the closed parenthesis ")" means to go down one floor. To start, I imported my direction into an ArrayList of Strings. Because the directions is formatted into one line, the first value of the ArrayList is the entire directions Santa needs. I set a variable called *flooring* to equal this string. Next, I created a method that takes in the String of directions called *floor*. I intialized a floor coun equal to 0. The method goes through every character in the string. If the character is equal to "(" then one is added to floor. If the character is equal to ")" then one is subtracted from floor. The method then returns floor.
  * *In this day, I refreshed my memory of how to use String methods like the ".equals" method*



 
* **Day 2 2021: Dive!**
  * Part one: In part one of Dive! the goal is to find the horizontal position and depth you would have after following the planned course, to answer the question you multiply the horizontal and depth position. First, I imported the data file into an ArrayList of strings. In the first method called *Horizontal* it goes through the ArrayList of Strings. If the string in the ArrayList equals forward, then the number following it is added to the count, which was initialized at the beginning of the method. To convert the string into an integer of the number following the direction I used *Integer.parseInt*. In the next method called *Vertical* does basically the same thing as *Horizontal* except instead of looking for the String equal to *forward* it looks for *up* and *down*. If *up* is found, the vertical count is subtracted by the number following up. If *down* is found, the vertical cound is added by the number following down.
  * Part Two: In part two, I combined the vertical and horizontal method made previously in part one in a method called *aim*. The integer aim is initialized to 0. If forward is fownd in the string then the Horizontal count increased by the number following forward (x) and Vertical count is increased by the number followinf forward(x) times the aim. If up is found then aim is subtracted by the number following up(x) and if down is found then aim is increased by the number following down. 
  * *I learned how to use Integer.parseInt to convert a string into an integer* 





* **Day 3 2021: Binary Diagnostic**
  * Part one: The objective was to calculate the power consumption of the submarine. To do this I imported the data set into an ArrayList of Integers. I found the number of rows in the data set and then found the columns. These are all found in the methods labeled *Importing Files, Rows, and Col* with these three methods I was able to create a 2d array of integers. This is found in the method *making2d*. In the method called *gamma* I created a String called gamma and epislon that stores the the bits in the 2d array. Next in the *binary* method I convert the String gamma and epislon into decimal numbers from a binary number. 
  * *In this day, I learned how to convert an ArrayList of integers into a 2d array. 






* **Day 6 2021: Lanternfish**
  * Part one: In part one, we wanted to find how many lanternfish would there be after 80 days? First, I intialized an integer array and pasted the data set into the array. The first method called *Fill* converts this integer array to a integer array list. The second method called *spawn* takes in an ArrayList as well as the number of days you want to evaluate. It goes through every value in the ArrayList. If the value does not equal 0, than the value is deacreased by one. Otherwise, the value is set to 6 and 9 is added to the end of the ArrayList. This repeats the number of days times. Finally, the size of the ArrayList is returned. 







* **Day 7 2021: The Treachery of Whales**
  * Part One: The goal is to find using the least amount of fuel, how much fuel must they spend to align to that position. The first method called *max* finds the max in the array, and the next method called *min* finds the min in the array. The *difference* method finds the difference for each of the periods. Using this method in the method called *differenceFile* I made a new arrayList of Integers, and going through all of the values in the original array, the difference is found and added to the arrayList. Then the minimum is found in the ArrayList and that is returned. 
  * *I refreshed my memory about using methods in other methods in day 7*  






* **Day 9 2021: Smoke Basin**
  * Part One: The plan is to create a 2d Array and from there find the minimum value from the surrounding values in the 2d Array. The same method is used as Day 3 of advent of code to create the 2d Array. The method *findingLow* first checks all the the corners of the 2d array. Because the corners in the 2d array, only have two surrounding numbers to be checked. Then the method checks the edges because those have three surrounding numbers and finally it checks the internal numbers. 
  * *I learned how to create a bunch of if else statements without getting confused* 
  




  


