package com.gozoo.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StartAction implements A_Action {
	A_MemberDao mDao = new A_MemberDao();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MyScheduler.init();
		MyScheduler.start();
		System.out.println("<<< ����Ʈ �����ٷ��� ���۵Ǿ����ϴ�. >>>");
		request.getRequestDispatcher("beforeGoAdmin.jsp").forward(request, response);
		
		
	}

}
