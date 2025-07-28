import java.util.LinkedList; //package importing

public class Linkedlist_program {
    public static void main(String[] args){
        LinkedList<String> countries = new LinkedList<String>();
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Sri Lanka");
        System.out.println(countries);

        //Linkedlist Methods

        //adding an item at first addfirst()

        countries.addFirst("Bangladesh");
        System.out.println(countries);

        //add item at last using addLast()

        countries.addLast("China");
        System.out.println(countries);

        //removeFirst()
        countries.removeFirst();
        System.out.println(countries);

        //removeLast()
        countries.removeLast();
        System.out.println(countries);


        //getFirst()
        System.out.println(countries.getFirst());

//        getLast()
        System.out.println(countries.getLast());
    }

}