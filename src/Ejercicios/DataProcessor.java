package Ejercicios;

import java.util.List;

public class DataProcessor {

    public int sumNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args){
        DataProcessor processor = new DataProcessor();
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int result = processor.sumNumbers(numbers);
        System.out.println("Sum of numbers: " + result);
    }
}
