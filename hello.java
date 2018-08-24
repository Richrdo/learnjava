public class hello{
	public static void main(String[] args) {
		String s="\t \n   Hello \t";
		System.out.println(s);
		System.out.println(s.indexOf("ll"));
		s=s.trim();
		System.out.println(s);
		System.out.println(s.indexOf("ll"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}
}