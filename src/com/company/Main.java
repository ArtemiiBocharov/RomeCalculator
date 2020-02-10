package com.company;
import java.util.*;

import static com.company.Ver.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static int romeToArab(String num) {
        switch (num){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
               return -1;
        }
    }
    public static int calc(int num1, int num2, String oper) {
        int res = 0;
        switch (oper){
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
            default:
                System.out.println("Ошибка: Повторите ввод.");
                return -1;
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение: ");
        String line = scanner.nextLine();
        String expr = Ver.getNumber(line);

        int sol = 0;
        if (Ver.arabicOrRoman(numbers)) {
            int firstNum = romeToArab(numbers[0]);
            int secondNum = romeToArab(numbers[1]);

            sol = calc(firstNum, secondNum, par);
            System.out.println(Convertor.ArabicToRome(sol));
        } else {
            int firstNum = Integer.parseInt(numbers[0]);
            int secondNum = Integer.parseInt(numbers[1]);
            sol = calc(firstNum, secondNum, par);
            System.out.println(sol);
        }
    }
}
