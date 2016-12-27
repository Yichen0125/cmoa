package test.junit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmoa.besteasy.entities.User;
import com.cmoa.besteasy.system.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
public class TestPageHelper {

	@Test
	public void testpageHelper (){
		ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
		System.out.println(ioc);
		UserService userService = ioc.getBean(UserService.class);
		PageHelper.startPage(1, 5);
		List<User> userList = userService.getAllUser();
		System.out.println(userList.toString());  //  Page{pageNum=1, pageSize=5, startRow=0, endRow=5, total=7, pages=2}
		for (User user : userList) {
			System.out.println(user.getName()); 
			System.out.println(user.getClass());
		}
		PageInfo<User> pageInfo = new PageInfo<User>(userList);
		System.out.println(pageInfo.getTotal());
	}
	@Test
	public void TestDate(){
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		String date2 = format.format(date);
		System.out.println(date2);
	}
}
