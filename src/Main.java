//Напишите программу, которая выводит количество дней в месяце по его номеру,
//определенному в переменной month, используя switch-case.
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Введите номер месяца!");
        Scanner keyboard = new Scanner(System.in);
        if (keyboard.hasNextInt())
        {
            int number = keyboard.nextInt();
            switch (number)
            {
                case 1:
                    System.out.println ("Январь");
                    break;
                case 2:
                    System.out.println ("Февраль");
                    break;
                case 3:
                    System.out.println ("Март");
                    break;
                case 4:
                    System.out.println ("Апрель");
                    break;
                case 5:
                    System.out.println ("Май");
                    break;
                case 6:
                    System.out.println ("Июнь");
                    break;
                case 7:
                    System.out.println ("Июль");
                    break;
                case 8:
                    System.out.println ("Август");
                    break;
                case 9:
                    System.out.println ("Сентябрь");
                    break;
                case 10:
                    System.out.println ("Октябрь");
                    break;
                case 11:
                    System.out.println ("Ноябрь");
                    break;
                case 12:
                    System.out.println ("Декабрь");
                    break;
                default:
                    System.out.println ("Нет такого номера месяца!");
            }
        }
        else
        {
            System.out.println ("Вы ввели не число!");
        }
    }
}