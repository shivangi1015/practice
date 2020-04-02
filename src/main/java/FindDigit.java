public class FindDigit {
    static int findDigits(int n) {
        int count = 0;
        int origin = n ;
        while(n > 0) {
            int digit = n % 10;
            if(digit != 0 && origin % digit == 0){
                count += 1;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findDigits(123456));
    }
}
