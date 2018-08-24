import java.io.UnsupportedEncodingException;
public class Main{
	static void test(String m){
		System.out.println("Test encoding"+m+"...");
			try{
				"".getBytes(m);
				System.out.println("ok.");
			}catch (UnsupportedEncodingException e){
				System.out.println("failed.");
				System.out.println(e);
				e.printStackTrace();
			}
	}
	public static void main(String[] args) {
		test("UTF-8");
		test("GBK");
		test("abc");
	}
}//