/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DropTheLowestLab;

import java.util.ArrayList;

/**
 *
 * @author ianut
 */
public class Main {

    /**
     * @param list     
     * @param args the command line arguments
     */
    
    public static void searchSmallest(ArrayList<Double> list) {
        double smallest = 0;
        int counter = 1;
        int idx = 0;
        for (int i = 1 ; i < list.size()  ; i++ ) {
            smallest = list.get(i-1);
            if (smallest > list.get(i)) {
                smallest = list.get(i);
                idx = i;
            }
            counter = counter + 1;
        }
        
        System.out.println("The index of where the smallest number is located is at index " + idx);
        System.out.println("The smallest number in the list is " + smallest);
        System.out.println("The amount of times we had to go through the loop is " + counter + " times");
        String printList = list.toString();
        System.out.println("The original list is " + printList);
        
                
    }
    
    public static int searchSmallestIndex(ArrayList<Double> list) {
        double smallest = 0;
        int counter = 1;
        int idx = 0;
        for (int i = 1 ; i < list.size()  ; i++ ) {
            smallest = list.get(i-1);
            if (smallest > list.get(i)) {
                smallest = list.get(i);
                idx = i;
            }
            counter = counter + 1;
        }
        
        return idx;        
    }
    
    public static ArrayList<Double> updatedList(ArrayList<Double> list) {
        double idx = searchSmallestIndex(list);
        list.remove((int) idx);
        return list;
    }
    
    public static ArrayList<Double> buildArrayList(int size){
        ArrayList<Double> arrayListTemplate = new ArrayList<Double>();
        for(int i = 0 ; i < size ; i++) {
            arrayListTemplate.add(Math.random());
        }
        return arrayListTemplate;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> listSize5 = new ArrayList<Double>();
        ArrayList<Double> listSize10 = new ArrayList<Double>();
        ArrayList<Double> listSize15 = new ArrayList<Double>();
        ArrayList<Double> listSize20 = new ArrayList<Double>();
        
        listSize5 = buildArrayList(5);
        searchSmallest(listSize5);
        System.out.println("The new list is " + updatedList(listSize5));
        System.out.println();
        
        listSize10 = buildArrayList(10);
        searchSmallest(listSize10);
        System.out.println("The new list is " + updatedList(listSize10));
        System.out.println();
        
        listSize15 = buildArrayList(15);
        searchSmallest(listSize15);
        System.out.println("The new list is " + updatedList(listSize15));
        System.out.println();
        
        listSize20 = buildArrayList(20);
        searchSmallest(listSize20);
        System.out.println("The new list is " + updatedList(listSize20));
        System.out.println();
    }
    
}
