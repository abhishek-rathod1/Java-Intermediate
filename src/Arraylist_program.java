import java.util.ArrayList; //importing ArrayList library

import java.util.Collections; //haves sort() method

public class Arraylist_program {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Orange");

        System.out.println(fruits);

        //get();
        System.out.println(fruits.get(03));

        System.out.println(fruits);

        //Array list size
        System.out.println("ArrayList length: "+fruits.size());

        //change items inside an ArrayList --- set();
        fruits.set(3,"Kiwi");
        System.out.println(fruits);
//
//        fruits.remove(2); //removes 2 index item
//        System.out.println(fruits);
//
//        fruits.removeFirst(); //removes first
//        System.out.println(fruits);
//
//        fruits.clear(); //removes all
//        System.out.println(fruits);

        //Loop through ArrayList
        for(int i =0; i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }

        //Using For Each
        for(String fruit:fruits){
            System.out.println("For each "+fruit);
        }

        //Sorting in ArrayList
        Collections.sort(fruits);
        System.out.println(fruits);


        //Creating Number ArrayList

        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(95);
        marks.add(68);
        marks.add(78);
        marks.add(89);marks.add(77);
        marks.add(55);marks.add(68);marks.add(56);

        System.out.println("Before sorting: "+marks);
        Collections.sort(marks);
        System.out.println("After sorting: "+marks);





    }
}
