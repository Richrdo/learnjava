import java.util.Scanner;
public class ExceptionTest{
	public static void main(String[] args){
		int n,m=3;
	    Scanner sc=new Scanner(System.in);
	    try{
		   n=sc.nextInt();
		   m/=n;     
		   /* 如果m/n出错，则会跳出try，即下面这步不会执行 */
		   System.out.print("3/"+n+"="+m);
	    }catch(ArithmeticException e){
	 	   /* 输出异常信息 */
		   System.out.println("failed:"+e);
	    }
	}
}