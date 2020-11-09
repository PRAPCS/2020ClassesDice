class Main {
  public static void main(String[] args) {
    //Class name object name = new Class name
    Dice d6 = new Dice();

    for(int i=0;i<10;i++){
    System.out.println(d6.roll());//d6 is object roll is the method
    }
  }
}