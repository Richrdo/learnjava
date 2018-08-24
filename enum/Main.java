public class Main{
	public static void main(String[] args){
		for(Weekday day:Weekday.values()) {
			System.out.println(day.name());
	}
	Weekday fri=Weekday.FRI;
	System.out.println("FRI.name="+fri.name());
	System.out.println("FRI.ordinal()="+fri.ordinal());
	System.out.println(Weekday.valueOf("FRI"));
	System.out.println(fri.toChinese());
}
}