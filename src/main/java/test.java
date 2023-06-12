import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class test {
    private static final Logger LOGGER = Logger.getLogger(test.class.getName());

    static {
        LOGGER.setLevel(Level.INFO);
        FileHandler fh;
        try {
            fh = new FileHandler("log.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        LOGGER.addHandler(fh);
        XMLFormatter sf = new XMLFormatter();
        fh.setFormatter(sf);
    }
    public static double requestEnterNumber(String massage) {
        Scanner scanner = new Scanner(System.in);
        double number;
        while (true) {
            try {
                System.out.println(massage);
                number = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода! Попробуйте еще раз.");
            }
        }
        return number;
    }
    public static char requestEnterOperation(String massage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(massage);
        return scanner.next().charAt(0);
    }
    public static double getCalculate() {
        double numberOne = requestEnterNumber("Введите число:");
        LOGGER.info("Пользователем введено первое значение");
        char operation = requestEnterOperation("Выберете действие:");
        LOGGER.info("Пользователем выбрано действие");
        double numberTwo = requestEnterNumber("Введите число:");
        LOGGER.info("Пользователем введено второе значение");
        double result;

        switch (operation) {
            case '+' -> {
                result = numberOne + numberTwo;
                LOGGER.info("Выполнено сложение");
                return result;
            }
            case '-' -> {
                result = numberOne - numberTwo;
                LOGGER.info("Выполнено вычитание");
                return result;
            }
            case '*' -> {
                result = numberOne * numberTwo;
                LOGGER.info("Выполнено умножение");
                return result;
            }
            case '/' -> {
                if (numberTwo != 0) {
                    result = numberOne / numberTwo;
                    LOGGER.info("Выполнено деление");
                    return result;
                } else {
                    LOGGER.warning("Деление на ноль");
                    return getCalculate();
                }
            }
            case '%' -> {
                result = numberOne % numberTwo;
                return result;
            }
            default -> {
                LOGGER.warning("Неверный операнд");
                return getCalculate();
            }
        }
    }


    public static void main(String[] args) {

        System.out.println(getCalculate());

    }
}

