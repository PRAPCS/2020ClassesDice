public class Dice{

//Declare instance(global) variables - Must be private, can be see by any method in this class
private int sides;
private String type;

//Default constructor that accepts no parameters and intializes the variables
public Dice(){
   sides = 6;
   type ="Six Sided";
}

//Method called roll that accepts no parameters and returns a random number from the sides
public int roll(){
  return (int)(Math.random()*sides)+1;
}










}