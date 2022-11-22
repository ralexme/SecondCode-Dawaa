package Bank;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        boolean reload = false;
        while (!reload) {
            //database data = new database();  //Импортнули датабазы(все коды)
            captcha cap = new captcha();
            checker check = new checker();
            APanel apanel = new APanel();

            Scanner sc = new Scanner(System.in); //Сканеры
            System.out.println("\n[{!}] MatCod: \n Для входа введите 1, \n Для регистрации введите 2, \n Для просмотра содержимого введиите 3.");
            int vibor = sc.nextInt(); //Выбор с помощью сканера, с выше выбранного текста.
            switch (vibor) {
                case 1: //Вход в банк систему, Должны отсылаться в базу данных и проверяться.
                    System.out.println("\n<Авторизация> Вход в Аккаунт Банковской Системы");
                    cap.capt();
                    check.checker_2();
                    break;
                case 2: //Рег в банк систему, Должно отсылать в базу данных и записываться. Открываться Счет
                    //Денег, Дата регистрации, Есть ли карта банка, Пароль, Имя, фамилия, Так-же Пароль не больше 7 символов, и
                    //только символы + Буквы, не больше 7-9.
                    System.out.println("\n<Регистрация> Регистрация в Аккаунт Банковской Системе");
                    cap.capt();
                    check.checker_1();
                    break;
                case 3: // Должно проверять, зарегистрирован ли человек в банк системе, если нет, отсылать на банк систему.
                    System.out.println("\n<Вклад> Вклад Денег в Банковскую Систему");
                    break;
                case 444:
                    apanel.panel();
                default:
                    System.out.println("\n Такого выбора не существует! \n");
            }
            reload = false;
            System.out.println("Приятного использования 'БАНК АСС'");
        }
    }
}