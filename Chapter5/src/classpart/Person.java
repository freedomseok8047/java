package classpart;

public class Person {
	int age;
	String name;
	boolean isMarried;
	int childNo;
	
	public Person() {}
	
	public Person (int age, String name, boolean isMarried , int childNo) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.childNo = childNo;
	}
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChildNo() {
		return childNo;
	}
	public void setChildNo(int childNo) {
		this.childNo = childNo;
	}
	public void showPersonInfo() {
		System.out.println("나이 : "+ age);
		System.out.println("이름 : "+ name);
		System.out.println("결혼 여부 : "+ isMarried);
		System.out.println("자녀 수 : "+ childNo);
	}

}
