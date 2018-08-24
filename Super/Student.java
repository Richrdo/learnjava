public class Student extends Person{
	private int score;
	public void setScore(int score){
		this.score=score;
	}
	public int getScore(){
		return score;
	}
	public void printName(){
		System.out.println(name);
	}
	public String toString(){
		return "Person"+this.name;
	}
}