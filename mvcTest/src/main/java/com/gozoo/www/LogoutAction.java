package com.gozoo.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction implements A_Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		session.removeAttribute("loginId");
		session.removeAttribute("loginName");
		session.removeAttribute("poing");
		request.getRequestDispatcher("logoutAction.jsp").forward(request, response);
	}

}
