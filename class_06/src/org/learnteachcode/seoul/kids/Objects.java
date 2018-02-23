package org.learnteachcode.seoul.kids;

import org.learnteachcode.seoul.kids.side.ProtectedThings;

class Objects {
  public static void main(String[] args) {
    Vehicle myVehicle = new Vehicle(4);
    // myVehicle.wheels = 2;
    myVehicle.printWheels();

    Vehicle otherVehicle = new Vehicle(3);
    otherVehicle.printWheels();

    myVehicle.name = "bob";
    System.out.println("vehicle name: " + myVehicle.name);

    ProtectedThings thing = new ProtectedThings("name");
    // thing.name = "joe";
  }
}
