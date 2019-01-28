package raiseUp;
import java.util.ArrayList;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> correctNumbers = new ArrayList<>();
        int number = 0, sum = 0, digitSum = 0;
        for (int i = 0; i < 5; i++)
        {number = scanner.nextInt();numbers.add(number);}

        for (int i = 0; i < numbers.size(); i++)
        {if (numbers.get(i)%3 == 0 && numbers.get(i)%7 == 0)
            {correctNumbers.add(numbers.get(i));}
        }
        for (int i = 0; i < correctNumbers.size(); i++)
        {
           sum+=correctNumbers.get(i);

        }
        while (sum > 0)
        {
            digitSum = digitSum + sum%10;
            sum = sum/10;
        }
        System.out.println(digitSum);











    }



        }










