public enum Weekday{
	SUN("星期天"),MON("星期一"),TUE("星期二"),WED("星期三"),THU("星期四"),FRI("星期五"),SAT("星期六");
	private String chinese;
	private Weekday(String chinese){
		this.chinese=chinese;
	}
	public String toChinese(){
		return chinese;
	}
}