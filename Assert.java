import java.util.Scanner;
public class Assert{
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.printf("Imput a positive integer:");
		a=sc.nextInt();
		//断言并输出错误信息
		assert a>0:"The number must be Positve!";
	}
}