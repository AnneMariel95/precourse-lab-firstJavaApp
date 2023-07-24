package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeter {
  private static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn;
  }

  private static String whichDate(String when) {
    return "2023-09-04";
  }

  private static String courseStart() {
    return "Today, it is over a month left until the course starts.";
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    String greeting = greet(name);

    System.out.print("When does that course start? ");
    String when = reader.readLine();
    String date = whichDate(when);

    System.out.println(greeting);
    System.out.println(courseStart());
  }
}
