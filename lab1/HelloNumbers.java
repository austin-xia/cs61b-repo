public class HelloNumbers {
    public static int sum (int x) {
	    int i = 0;
	    int sum = 0;
        while (i <= x) {
            sum += i;
            i += 1;
        }
        return sum;
    }
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.println(sum (x));
            x = x + 1;
        }
    }
}