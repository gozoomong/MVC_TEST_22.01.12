package com.gozoo.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheckAction implements A_Action {

	
	A_MemberDao mDao = new A_MemberDao();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		if(id.equals("admin")&&pw.equals("1234")) {
			request.getRequestDispatcher("beforeGoAdmin.jsp").forward(request, response);
		}else {
			
			if(mDao.loginCheck(new A_MemberDto(id,pw))) {
				HttpSession session = request.getSession();
				session.setAttribute("loginId", id);
				
				String loginName = mDao.getName(new A_MemberDto(id));
				session.setAttribute("loginName", loginName);
				
				int point = mDao.getPoint(new A_MemberDto(id));
				session.setAttribute("point", point);
				
				request.getRequestDispatcher("GoMainpage.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("failed.jsp").forward(request, response);
			}
			
		}
		
	}

}
