package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
Class strClass = Class.forName("classEx.Person");
		
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println();
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		System.out.println();
		Method[] methods = strClass.getMethods();
		for(Method m : methods ) {
			System.out.println(m);
		}
	}

}
