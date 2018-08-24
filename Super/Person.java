public class Person{
	protected String name="noname";
	private int age; 
    public void setName(String name){
    	//System.out.printf("this.name:%s/n",this.name);
    	//System.out.printf("name:%s",name);
    	//return this.name;
    	this.name=name;
    }
    public String getName(){
    	return this.name;
    }

}