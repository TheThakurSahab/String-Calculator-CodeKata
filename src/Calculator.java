import java.util.*;
import java.util.stream.Stream;

public class Calculator {
    public static int Add(String text){
        if(text.isEmpty()){
            return 0;
        } else{
            Stream<String> numbers = Arrays.stream(text.split(","));
            return numbers.mapToInt(Integer::parseInt).sum();
        }
    }
    public static int toInt(String input){
        return Integer.parseInt(input);
    }
}
