package test;
import java.util.ArrayList;
import java.util.Scanner;

public class CharSum
{
public static int convert(char ch)
{return ch - 96;}

static int allCharSum(String word)
{
int sum = 0;
for (int i = 0; i < word.length(); i++)
{
char currentChar = word.charAt(i);
int number = convert(currentChar);
sum+=number;
}
return sum;
}

public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
int n = Integer.parseInt(scanner.nextLine());
ArrayList<String> words = new ArrayList<>();
for (int i = 0; i < n; i++)
{
String word = scanner.nextLine();
words.add(word);
}
int maxSum = 0; String highestSumStr = "";
for (int i = 0; i < words.size(); i++)
{
int currentWordSum = allCharSum(words.get(i));
if (allCharSum(words.get(i)) > maxSum ) {maxSum = currentWordSum; highestSumStr = words.get(i);}
}
System.out.println(maxSum+" "+highestSumStr);
}}