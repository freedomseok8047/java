package classEx;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("classEx.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}

}
