import java.util.ArrayList;

public class ExceptionMethod {
    public void convertString(ArrayList<Object> array){
        for(int i=0; i<array.size(); i++) {
            try {
                Integer castedValue = (Integer) array.get(i);
                System.out.println(array.get(i));
            } catch (ClassCastException e) {
                System.out.println(array.get(i) + " needs to be an integer");
            }
        }
    }
}