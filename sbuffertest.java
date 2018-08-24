public class sbuffertest{
	public static void main(String[] args) {
		StringBuffer sBuffer=new StringBuffer("南昌大学：");
		sBuffer.append("www");
		sBuffer.append(".ncu");
		sBuffer.append(".com");
		System.out.println(sBuffer);
		sBuffer.delete(5,8);
		System.out.println(sBuffer);
		sBuffer.insert(5,"www");
		System.out.println(sBuffer);
		sBuffer.replace(9,12,"pku");
		System.out.println(sBuffer);
	}
}