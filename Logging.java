import java.util.logging.*;
public class Logging{
	public static void main(String[] args){
		Logger logger=Logger.getGlobal();
		Person p=new Person();
		p.setName("Mike");
		logger.setLevel(Level.WARNING);
		logger.info("Hi "+p.getName()+"!");
		logger.info("start...");
		logger.log(Level.WARNING,"warning...");
		logger.warning("start...");
	}
}