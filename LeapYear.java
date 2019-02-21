import java.util.Scanner;
class LeapYear{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int year=scan.nextInt();
if(year%4==0)
if(year%100==0)
if(year%400==0)
System.out.println(year+"is leap year");
else
System.out.println(year+"is not a leap year");
else
System.out.println(year+"leap");
else
System.out.println(year+"not leap");
}
}
