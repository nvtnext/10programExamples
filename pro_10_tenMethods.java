import java.util.Scanner;
public class pro_10_tenMethods {
    public static void main(String[] args) {
        System.out.println("1. Perfect Number          2. Prime Number");
        System.out.println("3. Factorial of Number     4. Strong Number");
        System.out.println("5. Armstrong Number        6. Disarium Number");
        System.out.println("7. Happy Number            8. Palindrome Number");
        System.out.println("9. Xylem or Phloem        10. Fibonacci Series");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10 to executes methods : ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter a Integer to check Perfect number");
                int num1 = sc.nextInt();
                System.out.println(perfectNumber(num1));
                break;
            case 2:
                System.out.println("Enter a number to check Prime Number");
                int num2 = sc.nextInt();
                System.out.println(primeNumber(num2));
                break;
            case 3:
                System.out.println("Enter a number to find Factorial of Number");
                int num3 = sc.nextInt();
                System.out.println(fact(num3));
                break;
            case 4:
                System.out.println("Enter a number to check Strong Number");
                int num4 = sc.nextInt();
                System.out.println(strongNumber(num4));
                break;
            case 5:
                System.out.println("Enter a number to check Arm Strong Number");
                int num5 = sc.nextInt();
                System.out.println(armStrong(num5));
                break;
            case 6:
                System.out.println("Enter a number to check Disarium Number ");
                int num6 = sc.nextInt();
                System.out.println(disarium(num6));
                break;
            case 7:
                System.out.println("Enter a number to check Happy Number");
                int num7 = sc.nextInt();
                System.out.println(happyNumber(num7));
                break;
            case 8:
                System.out.println("Enter a number to check Palindrome");
                long num8 = sc.nextLong();
                System.out.println(palindromeOrNot(num8));
                break;
            case 9:
                System.out.println("Enter a number to check Xylem or Phloem");
                int num9 = sc.nextInt();
                System.out.println(xylemOrPhloem(num9));
                break;
            case 10:
                System.out.println("Enter a count number to print Fibonacci Series");
                int num10 = sc.nextInt();
                System.out.println(fibonacciSeries(num10));
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
    // method 1
    static String perfectNumber(int n){
        int sum = 0;
        for (int a = 1; a < n; a++){
            if (n % a == 0)
                sum = sum + a;
        }
        String res = (sum == n)? "Perfect Number" : "Not Perfect Number";
        return res;
    }
    //method 2
    static String primeNumber(int n){
        int count = 0;
        if (n == 0 || n == 1)
            return "Integer Should be above 1";
        else
            for (int a = 1; a < n+1; a++){
                if(n % a == 0)
                    count = count + 1;
            }
            if (count > 2)
                return "Non Prime Number";
            else
                return "Prime Number";
    }
    //method 3
    static int fact(int n){
        int fc = 1;
        if (n == 1 || n == 0)
            return 1;
        else
            for (int a = 2; a < n + 1; a++){
                fc = fc * a;
            }
            return fc;
    }
    //method 4
    static boolean strongNumber(int n){
        int sum = 0;
        int nn = n;

        while (n > 0){
            int m = n%10;
            sum = sum + fact(m);
            n = n / 10;
        }
        return (sum == nn);
    }
    //method 5
    static String armStrong(int n ){
        int sum = 0;
        int nn = n;
        while (n > 0){
            int m = n%10;
            sum = sum + (m * m * m);
            n = n / 10;
        }
        String res = (nn == sum)? "ArmStrong Number" : "Not ArmStrong Number";
        return res;
    }
    //method 6
    static String disarium(int n ){
        int nn = n;
        int num = n;
        int length = 0;
        int rem = 0;
        int sum = 0;

        while (n!=0){
            length = length + 1;
            n = n /10;
        }
        int l = length;
        while(nn > 0 ){
            rem = nn % 10;
            sum = sum + (int)Math.pow(rem,l);
            nn = nn / 10;
            l--;
        }
        String res = (sum == num ) ? "Disarium" : "Not a Disarium";
        return res;
    }
    //method 7
    static String happyNumber(int n){
        int num = n;
        int sum = 0;
        int rem = 0;
        while (num > 9){
            while (num > 0){
                rem = num % 10;
                sum = sum + rem * rem;
                num = num /10;
            }
            num = sum ;
            sum = 0;
        }
        String res = (num == 1)?"Happy Number": "Not Happy Number";
        return res;
    }
    //method 8
    static String palindromeOrNot(long n ){
        long reverse = 0;
        long num = n;
        long rem = 0;
        while (n > 0){
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }
        String res = (num == reverse)? "Palindrome" : "Not Palindrome";
        return res;
    }
    //method 9
    static String xylemOrPhloem(int n ){
        int sum = 0;
        int num = n;
        int reverse = 0;
        while(n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
            sum = sum + rem;
        }
        int rem1 = num % 10;
        int rem2 = reverse % 10;
        String res = (sum == 2 * (rem1 + rem2))? "Xylem" : "Phloem";
        return res;
    }
    // method 10
    static String fibonacciSeries(int n){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for (int i = 1; i <= n; ++i){
            System.out.print(n1 + ",");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;x
        }
        return "Fibonacci";
    }
}
