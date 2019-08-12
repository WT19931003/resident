package cn.wutao.ei.web.controller;

import cn.wutao.ei.domain.User;
import cn.wutao.ei.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<User> user(){
        List<User> userList = userMapper.selectAll();
        return userList;
    }

}
