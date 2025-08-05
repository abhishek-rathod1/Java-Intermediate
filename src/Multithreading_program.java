//Thread
//public class Multithreading_program extends Thread{
//    public static void main(String[] args) {
//        Multithreading_program thread = new Multithreading_program();
//        thread.start();
//        System.out.println("Outside of thread");
//    }
//    public void run(){
//        System.out.println("This code runnning in a thread");
//    }
//}

//--------------------------------------------------------
//Runnbale
public class Multithreading_program implements Runnable{
    public static void main(String[] args) {
        Multithreading_program obj = new Multithreading_program();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("Outside of thread");
    }
    public void run(){
        System.out.println("This code runnning in a thread");
    }
}
