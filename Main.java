import java.util.Scanner;
class Main {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    // Class name object name = new Class name
    Dice d6 = new Dice();

    for (int i = 0; i < 10; i++) {
      System.out.println(d6.roll());// d6 is object roll is the method
    }

    System.out.println(d6);// implicitly calls the toString method
    System.out.println(d6.getType());// calls the getType method

    d6.setType("Default Dice"); //changes the variable type to Default Dice
    System.out.println(d6.getType());// calls the getType method

   

    System.out.println("===============D20==============");
    Dice d20 = new Dice(20);

    for (int i = 0; i < 10; i++) {
      System.out.println(d20.roll());// d20 is object roll is the method
    }

    System.out.println(d20.toString());// explicitly calls the toString method

    System.out.println("===============D250==============");
    Dice d250 = new Dice(250);

    for (int i = 0; i < 10; i++) {
      System.out.println(d250.roll());// d250 is object roll is the method
    }
   
    System.out.println("Please enter the number of sides for your dice");
    int number = input.nextInt();
    
    Dice dUser = new Dice(number);
    
    System.out.println(dUser);

     System.out.println(d6.sameType(d20));
     //System.out.println(d6.equals(d20));

  }
}