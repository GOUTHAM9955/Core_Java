package com.launch.map;

// Enums are used when we have group of names constants
// It is recommended to give the variables in capital letters

enum Weekday { // Renamed class to Weekday
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Directions {
  EAST, WEST, NORTH, SOUTH
}

public class EnumLauncher { // Renamed class to WeekdayTest

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Weekday day = Weekday.MONDAY;
    System.out.println(day);

    // Ordinal method is used to get the index of enums
    int dayNum = Weekday.THURSDAY.ordinal();
    System.out.println("Day index is: " + dayNum);

    // To print all the index values
    // Values gives list of values
    Weekday[] daysOfWeek = Weekday.values();
    for (Weekday w : daysOfWeek) {
      System.out.println(w.ordinal() + " -> " + w);
    }
  }
}