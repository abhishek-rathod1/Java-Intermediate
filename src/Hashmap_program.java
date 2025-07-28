import java.util.HashMap;

public class Hashmap_program {
    //key-value pair
    public static void main(String[] args) {
        //create HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        //add items to hashmap
        //Adding keys and values (Countries, City)
        capitalCities.put("England","London");
        capitalCities.put("India","New Delhi");
        capitalCities.put("China","Bejing");
        capitalCities.put("Pakistan","Istanbul");
        capitalCities.put("USA","Washington DC");
        capitalCities.put("Germany","Berlin");

        System.out.println(capitalCities);

        //Access an Item from Hashmap
        //key values we can get an items using get();
        System.out.println(capitalCities.get("India"));

        //keySet()   returs array all the keys
        System.out.println(capitalCities.keySet());

        //values()  -- get only values array
        System.out.println(capitalCities.values());

        for (String i:capitalCities.keySet()){
            System.out.println("Key: "+i+" Value "+capitalCities.get(i));
        }

        //remove an item  remove()
        capitalCities.remove("Pakistan");
        System.out.println(capitalCities);

        //to clear  clear()
//        capitalCities.clear();
//        System.out.println(capitalCities);

        //to find size of hashmap we use size()
        System.out.println(capitalCities.size());


        //Loop through Hashmap



    }


}
