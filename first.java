import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.print("Введите натуральное число: ");
        int n = scan.nextInt();
        int i = 1;
        do{
            System.out.println(s);
            i++;
        } while (i <= n);
    }

}