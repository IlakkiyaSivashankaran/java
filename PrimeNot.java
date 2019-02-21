import java.util.Scanner;
class PrimeNot{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int flag=0;

for(int i=2;i<n;i++){

if(n%i==0){
flag=1;
break;
}
else
continue;
}
if(flag==1)
System.out.println("not prime");
else
System.out.println("prime");
}
}
