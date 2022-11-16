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
        if (splitText.length > 3){
            throw new Exception("много цифр");
        }
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
            throw new Exception("т.к. используются одновременно разные системы счисления");
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
            if ( result < 0) {
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
                case "xi":
                    integer = 11;
                    break;
                case "xii":
                    integer = 12;
                    break;
                case "xiii":
                    integer = 13;
                    break;
                case "xiv":
                    integer = 14;
                    break;
                case "xv":
                    integer = 15;
                    break;
                case "xvi":
                    integer = 16;
                    break;
                case "xvii":
                    integer = 17;
                    break;
                case "xviii":
                    integer = 18;
                    break;
                case "xix":
                    integer = 19;
                    break;
                case "xx":
                    integer = 20;
                    break;
                case "xxi":
                    integer = 21;
                    break;
                case "xxiv":
                    integer = 24;
                    break;
                case "xxv":
                    integer = 25;
                    break;
                case "xxvii":
                    integer = 27;
                    break;
                case "xxviii":
                    integer = 28;
                    break;
                case "xxx":
                    integer = 30;
                    break;
                case "xxxii":
                    integer = 32;
                    break;
                case "xxxv":
                    integer = 35;
                    break;
                case "xxxvi":
                    integer = 36;
                    break;
                case "xlii":
                    integer = 42;
                    break;
                case "xlv":
                    integer = 45;
                    break;
                case "xlviii":
                    integer = 48;
                    break;
                case "il":
                    integer = 49;
                    break;
                case "l":
                    integer = 50;
                    break;
                case "li":
                    integer = 51;
                    break;
                case "liv":
                    integer = 54;
                    break;
                case "lvi":
                    integer = 56;
                    break;
                case "lx":
                    integer = 60;
                    break;
                case "lxiii":
                    integer = 63;
                    break;
                case "lxiv":
                    integer = 64;
                    break;
                case "lxx":
                    integer = 70;
                    break;
                case "lxxii":
                    integer = 72;
                    break;
                case "lxxx":
                    integer = 80;
                    break;
                case "lxxxi":
                    integer = 81;
                    break;
                case "c":
                    integer = 100;
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
            case 11:
                romeNum = "XI";
                break;
            case 12:
                romeNum = "XII";
                break;
            case 13:
                romeNum = "XIII";
                break;
            case 14:
                romeNum = "XIV";
                break;
            case 15:
                romeNum = "XV";
                break;
            case 16:
                romeNum = "XVI";
                break;
            case 17:
                romeNum = "XVII";
                break;
            case 18:
                romeNum = "XVIII";
                break;
            case 19:
                romeNum = "XIX";
                break;
            case 20:
                romeNum = "XX";
                break;
            case 21:
                romeNum = "XXI";
                break;
            case 24:
                romeNum = "XXIV";
                break;
            case 25:
                romeNum = "XXV";
                break;
            case 27:
                romeNum = "XXVII";
                break;
            case 28:
                romeNum = "XXVIII";
                break;
            case 30:
                romeNum = "XXX";
                break;
            case 32:
                romeNum = "XXXII";
                break;
            case 35:
                romeNum = "XXXV";
                break;
            case 36:
                romeNum = "XXXVI";
                break;
            case 42:
                romeNum = "XLII";
                break;
            case 45:
                romeNum = "XLV";
                break;
            case 48:
                romeNum = "XLVIII";
                break;
            case 49:
                romeNum = "IL";
                break;
            case 50:
                romeNum = "L";
                break;
            case 51:
                romeNum = "LI";
                break;
            case 54:
                romeNum = "LIV";
                break;
            case 56:
                romeNum = "LVI";
                break;
            case 60:
                romeNum = "LX";
                break;
            case 63:
                romeNum = "LXIII";
                break;
            case 64:
                romeNum = "LXIV";
                break;
            case 70:
                romeNum = "LXX";
                break;
            case 72:
                romeNum = "LXXII";
                break;
            case 80:
                romeNum = "LXXX";
                break;
            case 81:
                romeNum = "LXXXI";
                break;
            case 100:
                romeNum = "C";
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