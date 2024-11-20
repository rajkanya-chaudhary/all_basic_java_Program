public class Palindrome_number {
    public static void main(String[] args) {
        int n = 121;
        int sum = 0, c, rem;
           c = n;
        while (n>0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;

        }
        if(c==sum)
        {
            System.out.println("palindrome number");
        }
        else
        {
            System.out.println("Not Palindrome number");
        }
    }
}
