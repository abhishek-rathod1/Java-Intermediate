import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda_Expression {
    //Lambda
    public static void main(String[] args) {
//        (parameter1,parameter2)->{block of code}
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(69);
        numbers.add(546);
        numbers.add(56);
        numbers.add(12);

//        numbers.forEach((n)->{System.out.println(n);});
        Consumer<Integer> myMethod = (n)->System.out.println(n);
        numbers.forEach(myMethod);



    }
}
