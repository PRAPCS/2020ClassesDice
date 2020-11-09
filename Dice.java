public class Dice{

//Declare instance(global) variables - Must be private, can be see by any method in this class
private int sides;
private String type;

//Default constructor that accepts no parameters and intializes the variables
public Dice(){
   sides = 6;
   type ="Six Sided";
}

//Second constructor that accepts an integer as a parameter to set number of sides
//s is a local variable
public Dice(int s){
   sides = s;
   type = s + "sided";
}

//Method called roll that accepts no parameters and returns a random number from the sides
public int roll(){
  return (int)(Math.random()*sides)+1;
}

public String getType(){
  return type;
}



//Default to String method to return a string 
public String toString(){
  return "The number of sides of your dice is: "+sides;
}










}