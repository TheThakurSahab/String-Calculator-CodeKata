public class Calculator {
    public static void main(String[] args) {
    }
    public static int Add(String text) {
        if(text.isEmpty()){
            return 0;
        } else {
            return Integer.parseInt(text);
        }
    }
}
