/**
Основная логика происходит здесь. Проверка на валидность и условия правильного ввода,разбиение на первое и второе число,
а также нахождение операнда. В самом конце проверяется, являетли ли числа арабскими или римскими.
**/

package com.company;

public class Ver<numbers> {
    public static String[] numbers;
    public static String par;

    public static String getNumber(String input) throws Exception {
        input = input.replaceAll("\\s+","");
        try {

            numbers = input.split("[\\+\\-\\*\\/]");
            par = input.substring(numbers[0].length(), numbers[0].length() + 1);

        } catch (Exception e){
            throw new Exception();
        }
        if (numbers.length != 2 || numbers[0].length() < 1 || numbers[1].length() < 1 ||
                numbers[0].length() > 4 || numbers[1].length() > 4){
            throw new Exception();
        }
        return input;
    }
    public static boolean arabicOrRoman(String[] input) throws Exception {
        if (numbers[0].matches("[1-9][0]{0,1}") && numbers[1].matches("[1-9][0]{0,1}")) {
            return false;
        }
        else if (numbers[0].matches("[IVX][IVX]{0,1}[I]{0,2}") &&
        numbers[1].matches("[IVX][IVX]{0,1}[I]{0,2}")) {
            return true;
        }
        else {
            throw new Exception();
        }
    }
}
