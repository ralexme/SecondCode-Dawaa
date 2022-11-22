package Bank;

import java.util.Objects;
import java.util.Scanner;

public class APanel {
    public static void panel(){
        Scanner sc = new Scanner(System.in); //Сканеры
        System.out.println("\n<АПанель> АПанель: ");
        int apass = 234810567;
        System.out.print("Введите свой пароль\n");
        int power_apass = sc.nextInt();
        if (Objects.equals(apass, power_apass)) {
            System.out.println("Выберите Варианты АПанеле: \n 1. Все аккаунты \n 2. Все пароли \n 3. Добавить деньги \n");
            int variant = sc.nextInt();
            switch (variant) {
                case 1:
                    System.out.println("Все аккаунты + Имя, Пароли, Деньги: ");
                case 2:
                    //Сюда Все пароли от базы данных
                case 3:
                    // Сюда все деньги отдельно
                default:
                    System.out.println("Такого выбора нету!");
            }
        } else {
            System.out.println("Пароль для входа не верен.");
        }
    }

}
