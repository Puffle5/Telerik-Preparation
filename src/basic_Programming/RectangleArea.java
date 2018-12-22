package basic_Programming;
import java.util.Scanner;

public class RectangleArea
{
public static void main(String[] args)
{//Calculating rectangle area:
Scanner scanner = new Scanner(System.in);
int width = Integer.parseInt(scanner.nextLine());
int height = Integer.parseInt(scanner.nextLine());
int area = width*height;
System.out.println(area);
}}
