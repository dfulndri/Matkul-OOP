package com.pbo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
 
public class SetExample { 
public static void main(String[] args) { 
    Set set=new HashSet(); 
    set.add("Bernadine"); 
    set.add("Elizabeth"); 
    set.add("Gene"); 
    set.add("Elizabeth"); 
    set.add("Clara"); 
    System.out.print("Elemen pada HashSet : "); 
    System.out.println(set); 
    Set sortSet=new TreeSet(set); 
    System.out.print("Elemen pada TreeSet : "); 
    System.out.println(sortSet); 
    }
}