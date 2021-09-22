public class Calculator {
    public static void main(String[] args) {
    }
    public static int Add(String text) {
        if(text.isEmpty()){
            return 0;
        } else if(text.contains(",")){
            String [] input = text.split(",");
            return toInt(input[0]) + toInt(input[1]);
        }
        else {
            return toInt(text);
        }
    }
    public static int toInt(String input){
        return Integer.parseInt(input);
    }
}
