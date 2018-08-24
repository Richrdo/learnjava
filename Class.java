import java.util.logging.*;

public class Class{
	public static void main(String[] args) {
		Class cls=Person().class;
		Loger log=Logger.getGlobal();
		String fname=cls.getName();
		log.info(cls.getName());
		log.info(cls.getSimpleName());
		log.severe(cls.getPackage());
	}
}