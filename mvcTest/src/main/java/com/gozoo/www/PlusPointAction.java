package com.gozoo.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PlusPointAction implements A_Action {

	A_MemberDao mDao = new A_MemberDao();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String id = request.getParameter("loginId");
		int price = Integer.parseInt(request.getParameter("price"));
		System.out.println(id + " 는 광고를 봐서  " + price + " 점을 얻는다.");
		
		mDao.plusPoint(new A_MemberDto(id,price));
		int point = mDao.getPoint(new A_MemberDto(id));
		HttpSession session = request.getSession();
		session.setAttribute("point", point);
		request.getRequestDispatcher("goKorea.jsp").forward(request, response);		
	}

}
