public class Methods_decision {
    static void checkAge(int age){
        if(age>=18){
            System.out.println("You are allowed");
        }else{
            System.out.println("You are Not Allowed");
        }
    }

    public static void main(String[] args){

        checkAge(20);
        checkAge(17);
        checkAge(18);

    }
}
