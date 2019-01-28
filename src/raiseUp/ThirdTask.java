package raiseUp;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] letters = input.toCharArray();

        int len = letters.length;
        int count = 0;

        char res = letters[0];
        for (int i=0; i<len; i++)
        {
            int cur_count = 1;
            for (int j=i+1; j<len; j++)
            {
                if (letters[i] != letters[j])
                    break;
                cur_count++;
                if (cur_count > count)
                {
                    count = cur_count;
                    res = letters[i];
                }


            }


        }

    }}















