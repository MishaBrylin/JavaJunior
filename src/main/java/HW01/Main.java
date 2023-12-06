package HW01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Напишите программу, которая использует Stream API для обработки списка чисел. Программа должна вывести на экран среднее значение всех четных чисел в списке.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 12, 3);
        System.out.println(list.stream().filter(n -> n%2==0).mapToInt(n -> n).average().getAsDouble());
    }
}
