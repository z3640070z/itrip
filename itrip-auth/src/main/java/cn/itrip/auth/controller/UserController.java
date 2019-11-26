package cn.itrip.auth.controller;

import cn.itrip.auth.service.UserService;
import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.User;
import cn.itrip.common.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/user/queryuser",method = RequestMethod.POST,produces ={"application/json;charset=UTF-8"})
    public Dto returnUser(@RequestParam("userCode") String userCode,@RequestParam("userPassword")String userPassword){
        User user = userService.getUserByComment(userCode, userPassword);
        if (user!=null){
            Dto dto = DtoUtil.returnSuccess("登陆成功", user);
            return dto;
        }else {
            Dto dto = DtoUtil.returnFail("用户名或密码错误，登录失败！");
            return dto;
        }

    }
}
