
package domain;

public class Exercise {
    public static boolean Calculate(int number) {
        if (number < 0) return false;
        
        // Конвертуємо число в рядок для підрахунку цифр
        String numStr = String.valueOf(number);
        int len = numStr.length();
        int sum = 0;
        int temp = number;
        
        // Рахуємо суму цифр, піднесених до степеня
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, len);
            temp /= 10;
        }
        
        // Перевіряємо чи є число числом Армстронга
        return sum == number;
    }
}
