// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        task1(1);
        task1(0);
        task1(-3);
        System.out.println("______________");

        System.out.println("Завдання 2");
        task2(1);
        task2(0);
        task2(-3);
        System.out.println("______________");

        System.out.println("Завдання 3");
        task3(1);
        task3(0);
        task3(-3);
        System.out.println("______________");

        System.out.println("Завдання 4");
        task4(1);
        task4(0);
        task4(-3);
        System.out.println("______________");

        System.out.println("Завдання 5");
        task5(1);
        task5(0);
        task5(-3);
        System.out.println("______________");

        System.out.println("Завдання 6");
        task6(1);
        task6(0);
        task6(-3);
        System.out.println("______________");

        System.out.println("Завдання 7");
        task7("test");
        task7("тест");
        task7("тести");
        System.out.println("______________");

        System.out.println("Завдання 8");
        task8("1");
        task8("1");
        task8("3");
        System.out.println("______________");

        System.out.println("Завдання 9");
        task9(true);
        task9(false);
        task9_short(true);
        task9_short(false);
        System.out.println("______________");

        System.out.println("Завдання 10");
        task10(true);
        task10(false);
        task10_short(true);
        task10_short(false);
        System.out.println("______________");

        System.out.println("Завдання 11");
        task11(5);
        task11(0);
        task11(-3);
        task11(2);
        System.out.println("______________");

        System.out.println("Завдання 12");
        task12(5);
        task12(0);
        task12(-3);
        task12(2);
        System.out.println("______________");

        System.out.println("Завдання 13");
        task13(1, 3);
        task13(0, 6);
        task13(3, 5);
        System.out.println("______________");

        System.out.println("Завдання 14");
        task14(7, 15);
        task14(1, 4);
        task14(-5, 20);
        System.out.println("______________");

        System.out.println("Завдання 15");
        task15(1);
        task15(2);
        task15(3);
        task15(4);
        task15(5);
        System.out.println("______________");

        System.out.println("Завдання 16");
        task16(5);
        task16(13);
        task16(28);
        System.out.println("______________");

        System.out.println("Завдання 17");
        task17(1);
        task17(4);
        task17(8);
        task17(11);
    }

    public static void task1(int a) {
        if (a == 0){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task2(int a) {
        if (a > 0){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task3(int a) {
        if (a < 0){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task4(int a) {
        if (a >= 0){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task5(int a) {
        if (a <= 0){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task6(int a) {
        if (a != 0){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task7(String a) {
        if (a == "test"){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task8(String a) {
        if (a == "1"){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task9(boolean test) {
        if (test){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task9_short(boolean test){
        System.out.println(test ? "Вірно": "Не вірно" );
    }
    public static void task10(boolean test) {
        if (!test){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task10_short(boolean test){
        System.out.println(!test ? "Вірно": "Не вірно" );
    }
    public static void task11(int a) {
        if (a > 0 && a < 5){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task12(float a) {
        if (a == 0 || a == 2){
            System.out.println(a + 7);
        } else {
            System.out.println(a / 10);
        }
    }
    public static void task13(int a, int b) {
        if (a <= 1 && b >= 3){
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }
    }
    public static void task14(int a, int b) {
        if (a > 2 && a < 11 || b >= 6 && b < 14){
            System.out.println("Вірно");
        } else {
            System.out.println("Не вірно");
        }
    }
    public static void task15(int num){
        switch (num){
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("весна");
                break;
            case 3:
                System.out.println("літо");
                break;
            case 4:
                System.out.println("осінь");
                break;
            default:
                System.out.println("error");
        }
    }
    public static void task16(int day) {
        if (day >= 1 && day <= 10){
            System.out.println("Перша декада");
        } else if (day >= 11 && day <= 20){
            System.out.println("Друга декада");
        } else if (day >= 21 && day <= 30){
            System.out.println("Третя декада");
        }

    }
    public static void task17(int month) {
        if (month >= 1 && month <= 3){
            System.out.println("зима");
        } else if (month >= 3 && month <= 6){
            System.out.println("весна");
        } else if (month >= 3 && month <= 9){
            System.out.println("літо");
        } else if (month >= 9 && month <= 12){
            System.out.println("осінь");
        }

    }

}