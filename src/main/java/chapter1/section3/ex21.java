package chapter1.section3;


import java.util.LinkedList;

public class ex21{
    /* 1.3.21 Write a method find() that takes a linked list and a string key as arguments
    * and returns true if some node in the list has key as its item field, false otherwise. */

    public boolean find(LinkedList<String> linkedList, String key){
        for (String item : linkedList){
            if(item.equals(key)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){

    }
}
