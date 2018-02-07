public class Loops {
  public static void main(String[] args) {
    for(int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }

    int[] myArray = {5, 10, 4, 72, 21};
    for(int i = 0; i < myArray.length; i++) {
      System.out.println("i: " + i + " -- value: " + myArray[i]);
    }

    // System.out.println(myArray[20]);

    System.out.println("each loop");
    for(int myNumber : myArray) {
      System.out.println(myNumber);
    }
  }
}
