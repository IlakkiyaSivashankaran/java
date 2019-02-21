import java.util.Scanner;
class Odd{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int k=scan.nextInt();
for(int i=(n+1);i<=(k-1);i++)
if(i%2!=0)
System.out.println(" "+i);
}
}
