package utspemlann;

public class kata3 {
    public static Integer basicMath(String operation, int value1, int value2) {
        int result = 0;
        switch(operation) {
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "/":
                if (value2 != 0) {
                    result = value1 / value2;
                } else {
                    System.out.println("Cannot divide by zero");
                }          
                break;
            default:
                System.out.println("Invalid operation");
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(basicMath("+", 4, 7));
        System.out.println(basicMath("-", 15, 18));
        System.out.println(basicMath("*", 5, 5));
        System.out.println(basicMath("/", 49, 7));
    }
}