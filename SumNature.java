import java.util.Scanner;
class SumNatural{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter a value for N:");
int N=scan.nextInt();
int sum=0,i=1;
while(i<=N){
sum=sum+i;
i++;
}
System.out.println("result:"+sum);
}
}
