import java.util.Objects;
import java.util.Scanner;
public class Calculate {
    public static int calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ADD, SUBTRACT, MULTIPLY, DIVIDE");
        System.out.println("Введіть оператор: ");
        String operation = sc.nextLine();
        boolean valid = false;
        while(!valid) {
            if (operation.equalsIgnoreCase("ADD") || operation.equalsIgnoreCase("SUBTRACT") || operation.equalsIgnoreCase("MULTIPLY") || operation.equalsIgnoreCase("DIVIDE")) {
                valid = true;
            } else {
                System.out.println("ПОМИЛКА!");
                System.out.println("Введіть коректний оператор (ADD, SUBTRACT, MULTIPLY, DIVIDE)");
                operation = sc.nextLine();
            }
        }
        System.out.println("Введіть число 1 ");
        int x = sc.nextInt();
        System.out.println("Введіть число 2 ");
        int y = sc.nextInt();

        if(operation.equalsIgnoreCase("ADD")){
            return x+y;
        } else if (operation.equalsIgnoreCase("SUBTRACT")) {
            return x-y;
        } else if (operation.equalsIgnoreCase("MULTIPLY")) {
            return x*y;
        }else{
            return x/y;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calculate());
//        System.out.println(add(a,b));
//        System.out.println(multiply(a,b));
//        System.out.println(minus(a,b));
//        System.out.println(divide(a,b));
    }
}
