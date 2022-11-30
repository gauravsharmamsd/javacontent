package avc.aa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Copylist {


  public static void main(String[] args) {

    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("1");
    arrayList1.add("2");
    arrayList1.add("3");

    ArrayList<String> arrayList2 = new ArrayList<String>();

    arrayList2.add("One");
    arrayList2.add("Two");
    arrayList2.add("Three");
    arrayList2.add("Four");
    arrayList2.add("Five");

    System.out.println(arrayList2);

    Collections.copy(arrayList2, arrayList1);
    System.out.println(arrayList2);
  }
}
