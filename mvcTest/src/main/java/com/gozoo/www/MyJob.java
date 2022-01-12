
  package com.gozoo.www;
  
  import javax.servlet.http.HttpSession;
  
  import org.quartz.Job; import org.quartz.JobExecutionContext; import
  org.quartz.JobExecutionException;
 
  public class MyJob implements Job{ A_MemberDao mDao = new A_MemberDao();
  
  @Override 
  public void execute(JobExecutionContext arg0) throws
  JobExecutionException { mDao.start(new A_MemberDto());
  System.out.println("Job이 실행됨 : / 포인트 부여(1점)");
  
  	}
  
  
  }
 