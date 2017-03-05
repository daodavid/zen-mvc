package zen.mvc;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import viewobjects.ForumLogin;
import zen.reflection.MappFormObject;

public class Dispach {
	

	public static HttpServletResponse forward(HttpServletRequest request, HttpServletResponse response) {

		MapZen a = ConvertZenToObject.getMapping(request.getServletPath());

		try {
			ViewObject o = MappFormObject.getMappedView(request, Class.forName(a.getViewClass()));
			Action zAction = (Action) Class.forName(a.getActionClass()).newInstance();
			zAction.actionMapping(request, response, o);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("forward"+a.getForward());
			request.getRequestDispatcher(a.getForward()).forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
