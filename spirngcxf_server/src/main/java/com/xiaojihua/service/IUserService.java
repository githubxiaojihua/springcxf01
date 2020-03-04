package com.xiaojihua.service;

import java.util.List;

import javax.jws.WebService;

import com.xiaojihua.domain.Car;
import com.xiaojihua.domain.User;

@WebService
public interface IUserService {
	
	public String sayHi(String name);
	public List<Car> findCarsByUser(User user);
	
}
