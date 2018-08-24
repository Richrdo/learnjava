public class Main{
	public static void main(String[] args){
		Shape s1=new Rect(200,300);
		Shape s2=new Circle(100);
		System.out.printf("Rect's area:%.2f\n",s1.area());
		System.out.printf("Circle's area:%.2f",s2.area());
	}
}