// In threads
// Uncomment the lines you want to test, and comment out the ones you don't.




class parent{
    private static parent uniqueInstance;

    private parent(){
        System.out.println("parent constructor");
    }

    public static parent getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new parent();
        }
        return uniqueInstance;
    }
}



// Problem with threads
class singleton {
    private static singleton uniqueInstance ;
    private singleton(){
        System.out.println("singleton constructor");
    }

    public static singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new singleton();
        }
        return uniqueInstance;
    }
}


// first solution
class singleton1 {
    private static singleton1 uniqueInstance = new singleton1();
    private singleton1(){
        System.out.println("singleton constructor");
    }

    public static singleton1 getInstance(){
        return uniqueInstance;
    }
}

// second solution

class singleton2 {
    private static singleton2 uniqueInstance;
    private singleton2(){
        System.out.println("singleton constructor");
    }

    public static synchronized singleton2 getInstance(){
       if(uniqueInstance == null){
           uniqueInstance = new singleton2();
       }
       return uniqueInstance;
    }
}

// third solution -> double check

class singleton3 {
    private static volatile singleton3 uniqueInstance;
    private singleton3(){
        System.out.println("singleton constructor");
    }

    public static singleton3 getInstance(){
        if(uniqueInstance == null){
            synchronized (singleton3.class){
                if(uniqueInstance == null){
                    uniqueInstance = new singleton3();
                }
            }
        }
        return uniqueInstance;
    }
}



public class Main {

    public static void main(String[] args) {


        System.out.println("Main idea: ");
        System.out.println("---------");
        parent p1 =  parent.getInstance();
        parent p2 = parent.getInstance();
        System.out.println("-----------------");

        System.out.println("Problem with threads: ");
        System.out.println("---------------------");
        Thread t1 = new Thread(() -> singleton.getInstance());
        Thread t2 = new Thread(() -> singleton.getInstance());
        t1.start();
        t2.start();

//        System.out.println("solution 1 : ");
//        System.out.println("-------------");
//         t1 = new Thread(() -> singleton1.getInstance());
//         t2 = new Thread(() -> singleton1.getInstance());
//        t1.start();
//        t2.start();
//        System.out.println("----------------------------");
//
//
//        System.out.println("solution 2 : ");
//        System.out.println("-------------");
//        t1 = new Thread(() -> singleton2.getInstance());
//        t2 = new Thread(() -> singleton2.getInstance());
//        t1.start();
//        t2.start();
//        System.out.println("----------------------------");
//
//
//        System.out.println("solution 3 : ");
//        System.out.println("-------------");
//        t1 = new Thread(() -> singleton3.getInstance());
//        t2 = new Thread(() -> singleton3.getInstance());
//        t1.start();
//        t2.start();
//        System.out.println("----------------------------");
    }
}