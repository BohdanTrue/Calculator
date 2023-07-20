import java.util.Scanner;
public class Calculate {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int minus(int a, int b){
        return a-b;
    }

    public static int divide(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        System.out.println(sum(a,b));
//        System.out.println(multiply(a,b));
//        System.out.println(minus(a,b));
//        System.out.println(divide(a,b));
    }
}
