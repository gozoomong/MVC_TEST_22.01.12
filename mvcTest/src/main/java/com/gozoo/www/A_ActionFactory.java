package com.gozoo.www;

public class A_ActionFactory {

	A_Action getAction(String command) {
		A_Action result = null;
		switch(command) {
		
		case "loginCheckAction":
			result = new LoginCheckAction();
			break;
		
		case "registerAction":
			result = new RegisterAction();
			break;
		case "logoutAction":
			result = new LogoutAction();
			break;
		case "minusPointAction":
			result = new MinusPointAction();
			break;
		case "minusPointAction2":
			result = new MinusPointAction2();
			break;
		case "minusPointAction3":
			result = new MinusPointAction3();
			break;                      // ����..���� ��ȿ�����̱�������..�̷����߽��ϴ�..����
		case "plusPointAction":
			result = new PlusPointAction();
			break;
		case "getMemberListAction":
			result = new GetMemberListAction();
			break;
		case "deleteAction":
			result = new DeleteAction();
			break;
		case "updateAction":
			result = new UpdateAction();
			break;
		case "start":
			result = new StartAction();
			break;
		case "stop":
			result = new StopAction();
			break;
	
		}
		return result;
	}
}
