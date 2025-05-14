
package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        int[] numbersToCheck = {153, 370, 371, 407, 123, 999};
        
        for (int number : numbersToCheck) {
            boolean isArmstrong = Exercise.Calculate(number);
            System.out.println(number + " is" + (isArmstrong ? "" : " not") + " an Armstrong number");
        }
    }
}
