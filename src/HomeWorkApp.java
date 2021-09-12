/**
 * Java 1. Home work 2
 *
 * @author Toryanik Vladimir
 * @version 10 Sep 2021
 */
public class HomeWorkApp {
    public static void main(String[] args) {
       System.out.println(FirstApp(5, 5));
       SecondApp(0);
       System.out.println(ThirdApp(-3));
       FourthApp(args);
    }

    static boolean FirstApp(int a, int b) {
       return (a + b <= 20 && a + b >= 10); // { мой первый(удачный) и более громоздкий вариант решения
    //		if (a + b <= 20 && a + b >=10)
    //         return true;
    //     }else {
    //		    return false;
    //     }
    }

    static void SecondApp(int a) {
        System.out.println(a >= 0 ? "Положительное" : "отрицательное");
    }

    static boolean ThirdApp(int a) {
        return (a <= 0);
    }

    static void FourthApp(String[] ar) {
        for (int a = 0; a < 5; a++) {
            System.out.println("Строка");
        }
    }
}
