class Conditions {
  public static void main(String[] args) {
    boolean isColdOutside = false;
    boolean iWillWearAJacket = false;
    if(isColdOutside) {
      iWillWearAJacket = true;
    }
    System.out.println("isColdOutside: " + isColdOutside);
    System.out.println("iWillWearAJacket: " + iWillWearAJacket);

    // 20 is greater than 5
    // and
    // 10 is less than or equal to 100
    if(20 > 5 && 10 <= 100) {
      System.out.println("20 is greater than 5");
    }

    // 100 is equivalent to 0
    // or -- || -- shift-backslash
    // 1 is not equal to -1
    if(100 == 0 || 1 != -1) {
      System.out.println("conditions can be complex");
    }

    if(1 > 5) {
      System.out.println("1 is greater than 5");
    } else if(5 == 5) {
      System.out.println("5 is equivalent to 5");
    } else {
      System.out.println("1 is not greater than 5 and " +
        "5 is not equivalent to 5");
    }

    int magicNumber = 20;
    switch(magicNumber) {
      case 50:
      System.out.println("Magic number is 50");
      break;
      case 30:
      System.out.println("Magic number is 30");
      break;
      case 20:
      System.out.println("Magic number is 20");
      case 10:
      System.out.println("Magic number is 20 or 10");
      break;
      default:
      System.out.println("Magic number is not 50, 30, 20, or 10");
    }
  }
}
