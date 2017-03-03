package zen.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Action {
   public  abstract  void actionMapping(HttpServletRequest req,HttpServletResponse reponse,ViewObject object);
}
