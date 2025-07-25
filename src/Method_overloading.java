public class Method_overloading {
    //method overloading
    //Methods having same name with different parameter is known as Method overloading
    static int add(int a, int b){
        return  a+b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static String add(String a, String b){
        return  a+b;
    }

    public static void main(String[] args){
        System.out.println(add(5,9));
        System.out.println(add("Abhsihek ","Rathod"));
        System.out.println(add(9,6,7));

    }
}
