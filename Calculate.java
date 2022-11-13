import java.util.Locale;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение:");
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws Exception {
        String[] splitText = input.split(" ");
        Boolean rome = false;
        int a, b;

        int countLetters = 0;

        for (int i = 0; i < 3; i+=2) {
                try {
                Integer.parseInt(splitText[i]);
            } catch (NumberFormatException e) {
                rome = true;
                countLetters++;
            }
        }

        if (countLetters == 1) {
            throw new Exception("т.к. используются одновременно раззные системы счисления");
        }

        a = getLetter(splitText[0]);
        if  (a < 1 || a > 10) {
            throw new Exception("Цифра должна быть от 1 до 10 включительно");
        }
        b = getLetter(splitText[2]);
        if  (b < 1 || b > 10) {
            throw new Exception("Цифра должна быть от 1 до 10 включительно");
        }
        int result = getResult(a, b, splitText[1]);
        String output;

        if (rome) {
            if (result > 10 || result < 0) {
                throw new Exception("т.к. в римской системе нет отрицательных чисел");
            } else output = getRomeNumber(result);
        } else {

            if (result >= 0 && result <= 0) {
                throw new Exception("Arab letter should be > 0");
            } else output = String.valueOf(result);

        }
        return output;
    }

    public static Integer getLetter(String letter) throws Exception {
        int integer = 0;

        try {
            integer = Integer.parseInt(letter);
        } catch (Exception e) {
            switch (letter.toLowerCase(Locale.ROOT)) {
                case "i":
                    integer = 1;
                    break;
                case "ii":
                    integer = 2;
                    break;
                case "iii":
                    integer = 3;
                    break;
                case "iv":
                    integer = 4;
                    break;
                case "v":
                    integer = 5;
                    break;
                case "vi":
                    integer = 6;
                    break;
                case "vii":
                    integer = 7;
                    break;
                case "viii":
                    integer = 8;
                    break;
                case "ix":
                    integer = 9;
                    break;
                case "x":
                    integer = 10;
                    break;
                default:
                    throw new Exception("Цифра должна быть от 1 до 10 включительно!");
            }
        }
        return integer;
    }

    public static String getRomeNumber(int num) throws Exception {
        String romeNum = null;
        switch (num) {
            case 1:
                romeNum = "I";
                break;
            case 2:
                romeNum = "II";
                break;
            case 3:
                romeNum = "III";
                break;
            case 4:
                romeNum = "IV";
                break;
            case 5:
                romeNum = "V";
                break;
            case 6:
                romeNum = "VI";
                break;
            case 7:
                romeNum = "VII";
                break;
            case 8:
                romeNum = "VIII";
                break;
            case 9:
                romeNum = "IX";
                break;
            case 10:
                romeNum = "X";
                break;
            default:
                throw new Exception("Результат не найден");
        }
        return romeNum;
    }

    public static Integer getResult(int a, int b, String s) throws Exception {
        int result = 0;
        switch (s) {
            case "/":
                result = a / b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                throw new Exception("Неверный формат операции");
        }

        return result;
    }
}
