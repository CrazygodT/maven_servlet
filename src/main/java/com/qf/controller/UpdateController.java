package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import com.qf.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class UpdateController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        String uname = req.getParameter("username");
        String upass = req.getParameter("password");
        String gender = req.getParameter("gender");
        String email = req.getParameter("email");
        int uid = Integer.valueOf(req.getParameter("uid"));

        User user = new User();
        user.setUid(uid);
        user.setUname(uname);
        user.setEmail(email);
        user.setGender(gender);

        UserService userService = new UserServiceImpl();
        userService.update(user);

        resp.sendRedirect("/findAll");
    }
    
    // 重写doget方法
    public void doget(HttpServletRequest req, HttpServletResponse resp) {
    }

}
