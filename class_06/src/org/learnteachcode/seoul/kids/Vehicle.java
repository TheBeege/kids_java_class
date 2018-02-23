package org.learnteachcode.seoul.kids;

class Vehicle {

  private int countWheels;
  public String name = "";

  public Vehicle(int countWheels) {
    this.countWheels = countWheels;
  }

  public void printWheels() {
      System.out.println("I'm running on " + this.countWheels + " wheels");
  }
}
