package basic_Programming;
import java.util.Scanner;

public class Time
{
public static void main(String[] arguments)
{//Time is relevant:
Scanner scanner = new Scanner(System.in);
int days = Integer.parseInt(scanner.nextLine());
int hours = Integer.parseInt(scanner.nextLine());
int minutes = Integer.parseInt(scanner.nextLine());
int seconds = Integer.parseInt(scanner.nextLine());
if (days >= 0 && days <= 1000 && hours >= 0 && hours <= 1000 && minutes >= 0 && minutes <= 1000 && seconds >= 0 && seconds <= 1000)
{System.out.println(days*86400 + hours*3600 + minutes*60 + seconds);}
}}
