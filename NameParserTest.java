package com.company.module6.task29;

class NameParser {
  public String parse(String[] names) {
    StringBuilder builder = new StringBuilder();

    for(int i = 0; i < names.length; i++) {
      String firstName = names[i].split(" ")[0];

      builder.append(firstName);
      if (i != names.length - 1) {
        builder.append(", ");
      }
    }

    return builder.toString();
  }
}

public class NameParserTest {
  public static void main(String[] args) {
    String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

    //John, Bill, Nigua
    System.out.println(new NameParser().parse(names));
  }
}
