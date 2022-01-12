package com.gozoo.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetMemberListAction implements A_Action {

	A_MemberDao mDao = new A_MemberDao();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		mDao.getList();
		request.getRequestDispatcher("admin.jsp").forward(request, response);
		
	}

}
