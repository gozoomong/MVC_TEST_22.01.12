package com.gozoo.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateAction implements A_Action {

	A_MemberDao mDao = new A_MemberDao();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("up_id");
		String pw = request.getParameter("up_pw");
		String name = request.getParameter("up_name");
		int point = Integer.parseInt(request.getParameter("up_point"));
		System.out.println("update메서드 로 간다!");
		mDao.updateAction(new A_MemberDto(id,pw,name,point));
		request.getRequestDispatcher("updateGoAdmin.jsp").forward(request, response);
	
	}

}
