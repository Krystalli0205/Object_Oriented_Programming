
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		Person p = new Person("小明", 12);
		Student s = new Student("小红", 20, 99);
		// TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
		Student ps = new PrimaryStudent("小军", 9, 100, 5);
		if (ps instanceof PrimaryStudent ps1) {
			System.out.println("学生名字叫：" + ps1.getName() + "; 他的年龄是：" + ps1.getAge() + "; 他的分数是：" + ps1.getScore() + "; 他是" + ps1.getGrade() + "年级。");
		}
		
	}

}

class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	/*public void setName(String name) {
		this.name = name;
	}*/
	
	public int getAge() {
		return this.age;
	}
	
	/*public void setAge(int age) {
		this.age = age;
	}*/
	
}

class Student extends Person{
	protected int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	/*public void setScore(int score) {
		this.score = score;
	}*/
}

class PrimaryStudent extends Student{
	protected int grade;
	
	public PrimaryStudent(String name, int age, int score, int grade) {
		super(name, age, score);
		this.grade = grade;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	/*public void setGrade(int grade) {
		this.grade = grade;
	}*/
}
