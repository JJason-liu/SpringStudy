/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springstudy.beforenotify;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author jason email: 765798166@qq.com
 * @date 2018-3-1 11:20:51
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("MyMethodBeforeAdvice.before()");
    }
}
