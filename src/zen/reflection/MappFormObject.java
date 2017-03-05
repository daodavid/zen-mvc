package zen.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import viewobjects.ForumLogin;
import zen.mvc.ViewObject;

public class MappFormObject {
   
	
	
	public static ViewObject getMappedView(HttpServletRequest req,Class type) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException{
		Object a=type.newInstance();
		//System.out.println(a.getClass());
		for(Method m:type.getMethods()){
			
			String meth=tranformString(m.getName());
			System.out.println(meth);
			if(req.getParameter(meth)!=null && m.getName().contains("set")){
				
				a.getClass().getDeclaredMethod(m.getName(),String.class).invoke(a,req.getParameter(meth));
			
			
			}
			//System.out.println("atb"+req.getAttribute(meth).toString());
		}
	

		return  (ViewObject) a;
		
	}
	public static String tranformString(String name){
		String g=name;
		g=g.substring(3).toLowerCase();

		return g;
		
		
	}
}