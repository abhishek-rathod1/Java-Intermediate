public class Methods_program {

    static void greetings(){
        System.out.println("Welcome to Java Development");
    }

    static void wish(){
        System.out.println("Good Morning!");
    }

    //method with parameter
    static void intro(String name){
        System.out.println("I am "+name);
    }

    //method with multiple paramter
    static void add(int a,int b){
        System.out.println("Addition of "+a+" + "+b +" = "+(a+b));
    }

    static void intro2(String name, int age){
        System.out.println("Hello, my name is "+name+" my age is "+age);
    }

    public static void main(String[] args){
        greetings();
        greetings();
        greetings();

        wish();
        intro("Abhishek");
        intro("Bunty");
        intro("ANSH");
//        intro(123);
        add(5,6);
        add(9915649,58888);

        intro2("Abhishek",23);

    }
}
