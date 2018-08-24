import java.util.*;
import java.text.*;

public class Data{
	public static void main(String args[]){
		Date date=new Date();
		SimpleDateFormat ft=new SimpleDateFormat("YYYY.MM.dd HH:MM:ss E zzz ");
		System.out.println(ft.format(date));yi
	}

}