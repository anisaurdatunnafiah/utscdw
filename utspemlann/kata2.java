package utspemlann;

public class kata2 {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int num : n) {
            sum += num * num;
    }
        return sum;
}
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        int result = squareSum(arr);
        System.out.println("Sum of square : " + result);
    }
}
