package conditional_Statements;
import java.util.Scanner;

public class CalculateChange
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
double price = Double.parseDouble(scanner.nextLine());
int paidAmount = Integer.parseInt(scanner.nextLine());
double change = paidAmount - price;
double counter = 0;
change = change*100;
if (change >= 100)
{
change = change/100; counter = (int)change;
System.out.println((int)counter+" x 1 lev");
change = (change*100)%100;
}
if (change >= 50)
{
change = change/50; counter = (int) change;
System.out.println((int) counter + " x 50 stotinki");
change = (change * 50) % 50;
}
if (change >= 20)
{
change = change/20; counter = (int)change;
System.out.println((int)counter+" x 20 stotinki");
change = (change*20)%20;
}
if (change >= 10)
{
change = change/10; counter = (int)change;
System.out.println((int)counter+" x 10 stotinki");
change = (change*10)%10;
}
if (change*10 >= 5)
{
change = change/5; counter = (int)change;
if (counter != 0) {System.out.println((int)counter+" x 5 stotinki");}
change = (change*5)%5;}
if (change*10 >= 2)
{
change = change/2; counter = (int)change;
if (counter != 0) {System.out.println((int)counter+" x 2 stotinki");}
change = (change*2)%2;
}
if (change*10 >= 1)
{
change = change/1; counter = (int)change;
if (counter != 0) {System.out.println((int)counter+" x 1 stotinka");}
change = (change*1)%1;
}}}


