package sample;

import java.util.*;

public class bitmanupulation {
public static void main(String[] args) {
  int a=10;
  int b=20;
//  a=(a+b)-(b=a);
//  System.out.println(a+" "+ b);
  
  // mostly use this
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println(a+" "+ b);
   }
}
