/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springstudy;

import com.mycompany.springstudy.player.Iplayer;
import com.mycompany.springstudy.player.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason email: 765798166@qq.com
 * @date 2018-3-1 11:37:59
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Iplayer player = (Iplayer) ac.getBean("proxy");
        player.login();
    }
}
