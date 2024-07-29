package com.jensen.demo1;


import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public class UserServiceImplTest {
   @Test
    public void testProxy(){
       UserServiceImpl userService = new UserServiceImpl();
     //  Class[] interfaces={UserService.class};

      // Class[] interfaces=userService.getClass().getInterfaces();

       UserService proxyObj = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
           /**
            *
            * @param proxy 代理对象（不使用）
            * @param method 方法对象（被代理类中所书写的每一个成员方法）
            * @param args   成员方法中的参数值
            * @return    成员方法执行的结果
            * @throws Throwable
            */

           @Override
           public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               System.out.println(method.getName());
               long beginTime = System.currentTimeMillis();
               Object result = method.invoke(userService,args);
               long endTime = System.currentTimeMillis();
               System.out.println(method.getName()+"执行消耗："+(endTime-beginTime));
               return result;
           }
       });
       List<User> userList = proxyObj.findAllUser();
       for (User user : userList) {
           System.out.println(user);
       }
   }
}
