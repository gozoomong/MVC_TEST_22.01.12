package com.gozoo.www;

import java.util.ArrayList;

public class A_MemberDaoTest {

	static A_MemberDao mDao = new A_MemberDao();
	
	static void testloginCheck(){
		System.out.println(mDao.loginCheck(new A_MemberDto("tester","1234")));
	}
	
	static void testgetPoint(){
		System.out.println(mDao.getPoint(new A_MemberDto("tester")));
	}
	
	static void testgetName(){
		System.out.println(mDao.getName(new A_MemberDto("tester")));
	}
	
	static void testregisterAction(){
		System.out.println(mDao.registerAction(new A_MemberDto("testid","1234","testname")));
	}
	
	static void testminusPoint(){
		mDao.minusPoint(new A_MemberDto("testid",100));
	}
	
	static void testplusPoint(){
		mDao.plusPoint(new A_MemberDto("testid",100));
	}
	
	static void testgetList(){
		//mDao.getList(new ArrayList<A_MemberDto>());
		mDao.getList().toString();
	}
	
	static void testupdateAction(){
		mDao.updateAction(new A_MemberDto("idB","7777","nana",7474));
	}
	
	static void testdeleteAction(){
		mDao.deleteAction(new A_MemberDto("tester"));
	}
	
	public static void main(String[] args){
		// testloginCheck();
		// testgetPoint();
		// testgetName();
		// testregisterAction();
		// testminusPoint();
		// testplusPoint();
		// testgetList();
		// testupdateAction();
		// testdeleteAction();
	}
}
