package com.gozoo.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StopAction implements A_Action {
	A_MemberDao mDao = new A_MemberDao();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MyScheduler.end();
		System.out.println("<<< ����Ʈ �����ٷ��� ������ ����Ǿ����ϴ�. >>>");
		request.getRequestDispatcher("beforeGoAdmin.jsp").forward(request, response);
	}

}
