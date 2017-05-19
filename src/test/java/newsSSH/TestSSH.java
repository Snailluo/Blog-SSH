package newsSSH;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.news.Service.ManagerService;
import com.news.ServiceImpl.ManagerServiceImpl;
import com.news.entity.Manager;

public class TestSSH {
	
	@SuppressWarnings("resource")
	@Test
	public void TestLogin() {
		
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		ManagerService service = (ManagerServiceImpl) applicationContext.getBean("managerService");
		Manager manager = null;
		service.login(manager);
		
	}

}
