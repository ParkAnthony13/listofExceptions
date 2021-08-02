import java.util.ArrayList;

public class ListOfExceptions {
    public static void main(String[] args) {
        ExceptionMethod exceptTry = new ExceptionMethod();
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        exceptTry.convertString(myList);
    }
}