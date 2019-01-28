package raiseUp;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int target = Integer.parseInt(scanner.nextLine());
        String[] strings = input.split(", ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < strings.length; i++)
        {numbers.add(Integer.parseInt(strings[i]));}
        for (int i = 0; i < numbers.size(); i++)
        {
            for (int j = 1; j <= numbers.size() - i; j++)
            {
                if (numbers.get(j) < numbers.get(j+1))
                {
                    int variable = numbers.get(j);
                    variable = numbers.get(j+1);

                }

            }

        }

        System.out.println(numbers);



                }


            }









