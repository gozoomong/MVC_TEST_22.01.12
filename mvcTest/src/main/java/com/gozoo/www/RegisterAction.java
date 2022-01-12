package com.gozoo.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAction implements A_Action {

	A_MemberDao mDao = new A_MemberDao();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String new_id = request.getParameter("id");
		String new_pw = request.getParameter("pw");
		String new_name = request.getParameter("name");
		
		if(mDao.registerAction(new A_MemberDto(new_id,new_pw,new_name))) {
				System.out.println("REGISTER COMPLETE!");
				request.getRequestDispatcher("registerSuccess.jsp").forward(request, response);
		}
		
	}

}
