import java.util.HashSet;
public class HashSet_program {

    public static void main(String[] args) {
        //creating hashset object

        HashSet<String> sports = new HashSet<String>();

        //add()
        sports.add("Cricket");
        sports.add("Hockey");
        sports.add("Football");
        sports.add("Voleyball");
        sports.add("Kabaddi");
        sports.add("Swimming");
        sports.add("Swimming"); //does not add duplicate
        System.out.println(sports);

        //contains()  --returns true/false
        System.out.println(sports.contains("Swimming"));

        //size() returs size of hashset
        System.out.println(sports.size());

        //remove  --returns true/false
        System.out.println(sports.remove("Kabaddi"));

        System.out.println(sports);

        //Loop through hashset

        for(String i: sports){
            System.out.println(i);
        }

        //clear

        sports.clear();
        System.out.println(sports);
    }
}
