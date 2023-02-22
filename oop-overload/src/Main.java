
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		Persona ming = new Persona();
		ming.setName("Xiao Ming");
		System.out.println(ming.getName());
		Persona hong = new Persona();
		// FIXME: 给Person增加重载方法setName(String, String):
		hong.setName("Xiao", "Hong");
		System.out.println(hong.getName());
	}

}

class Persona{
	private String name;
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String a, String b) {
		this.name = a+ " " + b;
	}
}