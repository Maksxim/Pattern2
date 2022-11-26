package by.tms.project.work2;

public class Singleton {

    private static Singleton instance = null;

    private int number;

    protected Singleton(){
        number = 0;
    }

    public static Singleton Instance(){
        if (instance == null){
            instance = new Singleton();
            return instance;
        }
        else
            return null;
    }

    public void set(int count){
        number = count;
    }

    public int get(){
        return number;
    }

    public void print(){
        System.out.println("number =" + number);
    }
}
