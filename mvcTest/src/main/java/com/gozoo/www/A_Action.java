package com.gozoo.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface A_Action {
	void execute(HttpServletRequest request, HttpServletResponse response)
										throws Exception;  //ServletException, IOException;
}

