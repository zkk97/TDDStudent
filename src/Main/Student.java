package Main;

public class Student {

	private String num;
	private String name;
	private float math;
	private float chinese;
	private float english;
	
	
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
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getChinese() {
		return chinese;
	}
	public void setChinese(float chinese) {
		this.chinese = chinese;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}

}
