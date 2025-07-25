import java.util.Random;
//import java.util.random.RandomGenerator;

public class Generate_random_num {
    public static void main(String[] args){
        Random obj = new Random();
        long min = 1000000000L;
        long max  = 9999999999L;

        long random10digit = (long)(obj.nextDouble()*(max-min+1));
        System.out.println(random10digit);
    }
}
