public class Calculator {
    public static void main(String[] args) {
    }
    public static int Add(String text) {
        if(text.isEmpty()){
            return 0;
        } else if(text.contains(",")){
            String [] input = text.split(",");
            return Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
        }
        else {
            return Integer.parseInt(text);
        }
    }
}
