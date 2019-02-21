import java.util.Scanner;
class VowelConsonant{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter a char:");
String a=scan.next().toLowerCase();
char x=a.charAt(0);
System.out.println(a);
if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
System.out.println("vowel");
}
else{
System.out.println("consonant");
}
}
}
