package test;

import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		try {
			Class<?> obj= Class.forName("test.A");
			Method[] methods=obj.getDeclaredMethods();
			for (Method method : methods) {
				Class<?>[] c = method.getParameterTypes();
				System.out.println(c.toString());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
