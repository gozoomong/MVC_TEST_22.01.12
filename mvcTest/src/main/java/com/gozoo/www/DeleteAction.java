package com.gozoo.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteAction implements A_Action {

	
	A_MemberDao mDao = new A_MemberDao();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String id = request.getParameter("id");
		mDao.deleteAction(new A_MemberDto(id));
		
		request.getRequestDispatcher("DeleteGoAdmin.jsp").forward(request, response);
		
	}

}
