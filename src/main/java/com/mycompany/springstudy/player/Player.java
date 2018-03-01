/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springstudy.player;

import com.mycompany.springstudy.player.Iplayer;
import com.mycompany.springstudy.player.Iplayer;

/**
 *
 * @author jason email: 765798166@qq.com
 * @date 2018-3-1 11:11:49
 */
public class Player implements Iplayer {

    @Override
    public void login() {
        System.out.println("login()");
    }

    @Override
    public void logout() {
        System.out.println("logout()");
    }

    @Override
    public void logcharge() {
        System.out.println("logcharge()");
    }
}
