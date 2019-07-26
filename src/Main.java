
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessTheNum(9);
 }

     public static void guessTheNum (int index){//задание 1
        Random random = new Random();
         Scanner sc = new Scanner(System.in);
         int num, ans;
         do {
             num = random.nextInt(index);//случайное число от 0 до index записано в переменную num

             for (int i = 0; i < 3; i++) {
                 System.out.println("Введите число от 0 до " + index);//пользователь вводит число
                 int numUser = sc.nextInt();//считываем введенное число
                 if (numUser == num) {
                     System.out.println("Вы угадали! Загаданное число " + num);
                 } else if (numUser > num) {
                     System.out.println("Вы не угадали, загаданное число меньше");
                 } else {
                     System.out.println("Вы не угадали, загаданное число больше");
                 }

             }
         System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
         ans = sc.nextInt();}
         while(ans == 1);
         System.out.println("Спасибо за игру!");


     }

}
