public class dog{
	int dogAge;
	String name;
	public dog(String name){
		System.out.println("小狗的名字是："+name);
	}
    public void setAge(int age){
		dogAge=age;
	}
	public int getAge(){
		System.out.println("小狗的年龄是："+dogAge);
		return dogAge;
	}
    public static void main(String []args){
		dog mydog=new dog("tommy");
		mydog.setAge(2);
		mydog.getAge();
		System.out.println("变量值："+mydog.dogAge);
	}
}