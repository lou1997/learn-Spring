package demo;

import com.learnSpring.service.UserService;
import com.learnSpring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserCotroller {
    public static void main(String[] args) {
        //UserService userService =new UserServiceImpl();
        //userService.save();

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) app.getBean("userService");
        userService.save();

    }

}
