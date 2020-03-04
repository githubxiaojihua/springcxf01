package com.xiaojihua;

import com.xiaojihua.service.Car;
import com.xiaojihua.service.IUserService;
import com.xiaojihua.service.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringCxfClientTest {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-ws-client.xml");
        IUserService myClient = (IUserService) context.getBean("myClient");
        String cgx = myClient.sayHi("cgx");
        System.out.println(cgx);

        User user = new User();
        user.setUsername("宋江");

        List<Car> carsByUser = myClient.findCarsByUser(user);
        for(Car car : carsByUser){
            System.out.println(car.getCarName());
        }
    }
}
