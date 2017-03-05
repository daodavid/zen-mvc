package zen.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
	private String name;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
public class Example {
   public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	System.out.println(Class.forName("zen.reflection.Person"));
	Class w=Class.forName("zen.reflection.Person");
	Object a=w.newInstance();
	System.out.println(a.getClass());
	for(Method v:a.getClass().getMethods()){
		
		w.getDeclaredMethod("setName",String.class).invoke(a,"hello");
		Person p=(Person) a;
		
		System.out.println(p.getName());
	}
	
}
}
