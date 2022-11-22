package Bank;

import java.util.Objects;
import java.util.Scanner;

public class checker{
    public static void checker_1() {
        Scanner reg = new Scanner(System.in); //Сканеры
        int money = 0;
        System.out.println("\n<Регистрация> Введите своё Имя: ");
        String reg_name = reg.nextLine();
        String reg_sname;
        if (18 > reg_name.length()) {
            System.out.println("\n<Регистрация> Введите свою Фамилию: ");
            reg_sname = reg.nextLine();
            System.out.println("\n<Регистрация> Придумайте пароль: ");
            for (int x = 3; x >= 0; x--) {
                String reg_pass = reg.nextLine();
                if (reg_pass.length() >= 9) {
                    if (x == 1) {
                        System.out.println("\n<Регистрация | Ошибка> Пароль может иметь максимально 9 символов");
                        System.out.println("<Регистрация | Ошибка> У вас осталось " + x + " попыток!");
                    } else {
                        System.out.println("\n<Регистрация | Ошибка> Пароль может иметь максимально 9 символов");
                        System.out.println("<Регистрация | Ошибка> У вас осталось " + x + " попытка!");
                    }
                } else {
                    if (x == 3) {
                        System.out.println("\nВаше имя: " + reg_name + "\nВаша фамилия: " + reg_sname + "\nВаш пароль: "
                                + reg_pass + "\nВаш баланс: " + money);
                        break;
                    }
                }
            }
        } else {
            System.out.println("\n<Регистрация | Ошибка> Ваше имя содержит больше 18 СИМВОЛОВ!");

        }
    }
    public static void checker_2(){
        Scanner log = new Scanner(System.in); //Сканеры
        System.out.println("\n<Авторизация> Введите своё Имя: ");
        String log_name = log.next();
        if (Objects.equals(log_name, log_name)) {  //Пока-что не получилось сделать авторизацию! Нету подключения к дб))
            System.out.println("\n<Авторизация> Верно");
        } else {
            System.out.println("\n<Авторизация> Не верно");
        }
        System.out.println("\n<Авторизация> Введите свою Фамилию: ");
        String log_sname = log.next();
        if (Objects.equals(log_sname, log_sname)) {//Пока-что не получилось сделать авторизацию! Нету подключения к дб))
            System.out.println("\n<Авторизация> Верно");
        } else {
            System.out.println("\n<Авторизация> Не верно");
        }
        System.out.println("\n<Авторизация> Введите свой Пароль: ");
        String log_pass = log.nextLine();
        if (Objects.equals(log_pass, log_pass)) { //Пока-что не получилось сделать авторизацию! Нету подключения к дб))
            System.out.println("\n<Авторизация> Верно");
        } else {
            System.out.println("\n<Авторизация> Не верно");
        }
    }
}