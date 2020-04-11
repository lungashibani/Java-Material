import java.util.Arrays; 
import java.util.Comparator; 
import java.util.LinkedList; 
import java.util.List; 

/** * Java Program to show how to sort a list in Java 8. 
* 
* @author WINDOWS 8 
*/ 

public class Java8Demo { 
    public static void main(String args[]) { 
        // foods which helps in weight loss 
        List<String> listOfWeightLossFood = new LinkedList<>( Arrays.asList("beans", "oats", "avocados", "broccoli")); 
        System.out.println("before sorting: " + listOfWeightLossFood); 
        listOfWeightLossFood.sort(Comparator.reverseOrder()); 
        System.out.println("after sorting: " + listOfWeightLossFood); 
        } 
    }

import java.util.Collections; 
import java.util.Comparator; 
import java.util.LinkedList; 
public class LinkedListSorting{ 
    public static void main(String args[]) { 
        // Creating and initializing an LinkedList for sorting 
        LinkedList<String> singlyLinkedList = new LinkedList<>(); 
        singlyLinkedList.add("Eclipse"); 
        singlyLinkedList.add("NetBeans"); 
        singlyLinkedList.add("IntelliJ"); 
        singlyLinkedList.add("Resharper"); 
        singlyLinkedList.add("Visual Studio"); 
        singlyLinkedList.add("notepad"); 
        
        System.out.println("LinkedList (before sorting): " + singlyLinkedList); 
        
        // Example 1 - Sorting LinkedList with Collecitons.sort() method in natural order Collections.sort(singlyLinkedList); 
        System.out.println("LinkedList (after sorting in natural): " + singlyLinkedList); 
        
        // Example 2 - Sorting LinkedList using Collection.sort() and Comparator in Java 
        Collections.sort(singlyLinkedList, new Comparator<String>() { 
            @Override 
            public int compare(String s1, String s2) { 
                return s1.length() - s2.length(); 
            } } ); 
            
            System.out.println("LinkedList (after sorting using Comparator): " + singlyLinkedList); 
            } 
        }
