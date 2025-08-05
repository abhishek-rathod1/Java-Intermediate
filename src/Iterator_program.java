import java.util.ArrayList;
import java.util.Iterator;
public class Iterator_program {

    public static void main(String[] args) {

    //Iterator is an object that can be used to loop through collection of data
    //Make a collection
    ArrayList<String> fruits = new ArrayList<String>();
    fruits.add("Mango");
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Chikoo");
    fruits.add("Kiwi");

    Iterator<String> it = fruits.iterator();

        //print the first item from the list of items
//        System.out.println(it.next());
//        System.out.println(it.next());




        //Loop through of iterator
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(202);
        numbers.add(400);
        numbers.add(145);
        numbers.add(658);
        numbers.add(454);

        Iterator<Integer> num = numbers.iterator();
        while (num.hasNext()){
            Integer i = num.next();
            if(i<200){
                num.remove();
            }

        }
        System.out.println(numbers);

    }

}
