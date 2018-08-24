import java.util.*;
public class RandomTest{
	public static void main(String[] args) {
		Random r=new Random();
        r.nextInt();   //生成下一个随机数int；
        r.nextLong();  //生成下一个随机数Long；
        r.nextFloat(); //生成下一个随机数Float，介于0~1
        r.nextDouble();//生成下一个随机数Double，介于0~1
        for (int i=0;i<5 ;i++ ) {
        	System.out.println(r.nextFloat());
        }
        for (int i=0;i<5 ;i++ ) {
        	System.out.println(r.nextDouble());
        }
        for (int i=0;i<5 ;i++ ) {
        	System.out.println(r.nextInt());
        }
	}
}