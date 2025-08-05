import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Stringpattern {
    public static void main(String[] args) {
        String[] string = {"abdjsbn",
            "dfd45","sdfd45","skon","adhio","9jwivdi"
        };
        //regular expression for string to validate as input data
        String pattern = "^[a-zA-Z_][a-zA-Z0-9]*$";

        Pattern regex = Pattern.compile(pattern);

        for(String i:string){
            Matcher matcher = regex.matcher(i);
            if(matcher.matches()){
                System.out.println(i+" is a valid string");

            }else {
                System.out.println(i+" is a invalid string ");
            }
        }

    }
}
