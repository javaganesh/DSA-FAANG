package com.dsa.designpaatern.startge.problem.Solution;

public class Vechicle {
   private DriveInterface driveInterface;

      public Vechicle(DriveInterface driveInterface){
          this.driveInterface=driveInterface;
      }

      public void drive(){
          driveInterface.drive();
      }

}
