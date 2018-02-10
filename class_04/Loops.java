public class Loops {
  public static void main(String[] args) {
    for(int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }

    int[] myArray = {5, 10, 4, 72, 21};
    // i++ is the same as i += 1 is the same as i = i + 1
    for(int i = 0; i < myArray.length; i++) {
      System.out.println("i: " + i + " -- value: " + myArray[i]);
    }

    // System.out.println(myArray[20]);

    System.out.println("each loop");
    for(int myNumber : myArray) {
      System.out.println(myNumber);
    }

    // while(true) {
    //   System.out.println("I WILL PRINT FOREVER!!!");
    // }

    int j = 0;
    while(j < myArray.length) {
      System.out.println("while, j: " + j +
                          " -- value: " + myArray[j]);
      j++;
    }

    j = 0;
    while(true) {
      j++;
      if(j > 10) {
        break;
      }
    }
  }
}
