import java.util.regex.Matcher; //for matching data
import java.util.regex.Pattern; //pattern to compile
public class RegEx_Numberpattern {
    public static void main(String[] args) {
        //sample array data creation
        String[] strings = {
                "264894","4841512","79562","584","3.55","-515","+985","sd595",
                "864548d"
        };

        //regular expression for numbers to validate
        String numberPattern = "[-+]?\\d*\\.?\\d+";

        Pattern regex = Pattern.compile(numberPattern);

        for(String i:strings){
            Matcher matcher = regex.matcher(i);
            if(matcher.matches()){
                System.out.println(i+" is a valid number");

            }else {
                System.out.println(i+" is a invalid number ");
            }
        }
    }
}
