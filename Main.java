//package com.james;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myIntList = new ArrayList<>();
    myIntList.add(1);
    myIntList.add(2);
    myIntList.add(3);
    myIntList.add(4);
    ReverseLists reversedIntList = new ReverseLists();
    myIntList = reversedIntList.reverseIntList(myIntList);
    System.out.println(myIntList);
    
    ArrayList<String> myStrList = new ArrayList<>();
    myStrList.add("Tim");
    myStrList.add("Tom");
    myStrList.add("Tammy");
    ReverseLists reversedStrList = new ReverseLists();
    myStrList = reversedStrList.reverseStrList(myStrList);
    System.out.println(myStrList);
  }
  
  } 
