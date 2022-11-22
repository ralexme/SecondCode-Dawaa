package Bank;

import java.util.Objects;
import java.util.Scanner;
public class captcha extends Main {
    public static void capt() {
        Scanner cap = new Scanner(System.in); //Сканеры

        int a = 0;
        int b = 100;
        int random_number1 = a + (int) (Math.random() * b);
        System.out.println("\n<Капча>  Введите Капчу - " + random_number1);
        int captcha = cap.nextInt();
        if (Objects.equals(captcha, random_number1)){
            System.out.println("\n<Капча>  Капча УСПЕШНА");
        } else {
            for (int x = 3; x > 0; x--){
            if (x == 1){
                System.out.println("\n<Капча | Ошибка> Капча не верна, повторите!\n" + "<Капча | Ошибка> У вас осталось: " + x + " попытка!");
            } else {
                System.out.println("\n<Капча | Ошибка> Капча не верна, повторите!\n" + "<Капча | Ошибка> У вас осталось: " + x + " попыток!");
            }
            int captcha_p = cap.nextInt();
                if (Objects.equals(captcha_p, random_number1)){
                    System.out.println("\n<Капча> Капча УСПЕШНА");
                    break;
                }
                if (x == 1){
                    System.exit(0);
                }
            }
        }
    }
}
