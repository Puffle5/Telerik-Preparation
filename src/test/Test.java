package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 5, 6 ));
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> evenNumbersLambda = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++)
        {
            if (numbers.get(i)%2 == 0)
            {
                evenNumbers.add(numbers.get(i));

            }

        }
        System.out.println(evenNumbers);

        evenNumbersLambda = numbers.stream().filter(
                element->element%2 == 0
        ).collect(Collectors.toList());

        System.out.println(evenNumbersLambda);

    }
}
