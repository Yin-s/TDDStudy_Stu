package Main;

public class Student {

	private String num;
	private String name;
	private int math;
	private int chinese;
	private int english;
	
	
	public Student(String num,String name,int chinese,int math ,int english) {
		this.num = num;
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		
	}

	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getEnglish() {
		return english;
	}
	public void setNumber(int number) {
		this.english = english;
	}

	
	
}
