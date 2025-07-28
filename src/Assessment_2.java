import java.util.HashMap;
public class Assessment_2 {
    public static void main(String[] args) {
        HashMap<String, Number> studScore = new HashMap<String, Number>();

        studScore.put("Abhishek",74);
        studScore.put("Bunty",80);
        studScore.put("Pooja",94);
        studScore.put("Aditi",91);
        studScore.put("Ansh",70);

        for(String i:studScore.keySet()){
            System.out.println("Student name: "+i+" ,Score: "+studScore.get(i));

        }

        System.out.println(studScore);
    }
}
