import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        System.out.print("Введите количество раз: ");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        System.out.print("Введите количество литров: ");
        int l = scan.nextInt();
        int sum = 0;
        if (r < 1 || l < 1)
            System.out.println("Введены некорректные данные");
        else {
            for (int i = 1; i <= 16; i++) {
                sum += r * l;
                System.out.println("К " + i + " неделе будет выпито " + sum + " литров жидкости");
            }
            if (sum >= 120)
                System.out.println("Студент принят в IT-клуб");
            else
                System.out.println("К сожалению, студент не принят в клуб");
        }
    }

}
