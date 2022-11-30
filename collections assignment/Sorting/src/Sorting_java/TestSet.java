package Sorting_java;
import  java.util.*;
 public class TestSet{
  enum Example {Two, one , Three}
public static void main(String[] args)
{
 Collection coll= new ArrayList();
  coll.add(Example.Three);
 coll.add(Example.Three);
 coll.add(Example.Three);
 coll.add(Example.Two);
 coll.add(Example.Two);
 coll.add(Example.one);
 Set set=new HashSet(coll);
 System.out.println(set);
}}
