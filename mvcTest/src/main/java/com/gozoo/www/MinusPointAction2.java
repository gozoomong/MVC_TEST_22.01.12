package com.gozoo.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MinusPointAction2 implements A_Action {

	A_MemberDao mDao = new A_MemberDao();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("loginId");
		int price = Integer.parseInt(request.getParameter("price"));
		System.out.println(id + " /// " + price);
		
		mDao.minusPoint(new A_MemberDto(id,price));
		int point = mDao.getPoint(new A_MemberDto(id));
		HttpSession session = request.getSession();
		session.setAttribute("point", point);
		request.getRequestDispatcher("GoMainB.jsp").forward(request, response);
	}

}
