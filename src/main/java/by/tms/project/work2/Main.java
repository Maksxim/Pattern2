package by.tms.project.work2;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.Instance();
        if(singleton != null){
            singleton.set(265);
            singleton.print();
        }
        else
            System.out.println("singleton == null");

        Singleton singleton2 = Singleton.Instance();
        if(singleton2 != null){
            singleton2.set(589);
            singleton2.print();
        }
        else
            System.out.println("singleton2 == null");
    }
}
