package com.presentation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import viewobjects.ForumLogin;
import zen.mvc.Action;
import zen.mvc.ViewObject;

public class LoginAction extends Action{

	@Override
	public void actionMapping(HttpServletRequest req, HttpServletResponse reponse, ViewObject object) {
		ForumLogin a=(ForumLogin) object;
		System.out.println("Forum login"+a.getUsername());
	}

}
