package seminars.third.hw;

public class MainHW {
//    Задание 1.
//
//    Напишите тесты, покрывающие на 100% метод evenOddNumber,
//    который проверяет, является ли переданное число четным или нечетным.
//
    public static void evenOddNumber(number){
        if (number%2=0){
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");
        }
    }

//    Задание 2.
//
//    Разработайте и протестируйте метод numberInInterval,
//    который проверяет, попадает ли переданное число в интервал (25;100).

    public static void numberInInterval(number){
        if (number>=25 && number=<100){
            System.out.println("Число попадает в интервал (25;100)");
        }
        else {
            System.out.println("Число попадает в интервал (25;100)");
        }
    }
}
