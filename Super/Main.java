public class Main{
	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.setName("Mike");
		stu1.setScore(96);
		System.out.printf("Name:%s\n",stu1.getName());
		System.out.println("Score:"+stu1.getScore());
		System.out.println(stu1);
	}

}