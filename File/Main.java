import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException{ 
		try(OutputStream output=new FileOutputStream("output.txt")){
			byte[] b1="hello".getBytes("utf-8");
			output.write(b1);
			byte[] b2="你好".getBytes("GBK");
			output.write(b2);
		}
	}
}