import java.util.Scanner; //导入java.util.Scanner
public class XX{
	public static void main(String[] args) {
        Scanner jvin=new Scanner(System.in); //创建Scanner并传入System.in
        System.out.printf("Imput you name:");
        String name=jvin.nextLine();//jvin.nextLine()读取字符串;
        System.out.printf("Imput you age:");
        int age=jvin.nextInt();     //jvin.nextInt()读取整数;
        System.out.println("Hello "+name+",you are "+age);
        String s="hello,world";
        System.out.println(s.indexOf('o',6));
	}
}