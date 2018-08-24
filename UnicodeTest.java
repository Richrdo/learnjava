public class UnicodeTest{
	public static void main(String[] args) throws Exception{
		String str="中文字符";
		System.out.println("Original String:"+str);
		String new_str=new String(str.getBytes("UTF-8"),"GBK");
		System.out.println("New String:"+new_str);
		String final_str=new String(new_str.getBytes("GBK"),"UTF-8");
		System.out.println("Final String:"+final_str);
	}
}