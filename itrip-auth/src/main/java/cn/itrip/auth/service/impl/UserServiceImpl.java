package cn.itrip.auth.service.impl;


import cn.itrip.auth.service.UserService;
import cn.itrip.beans.pojo.User;
import cn.itrip.dao.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByComment(String userCode, String userPassword) {
        User user = userMapper.getUserByUserCode(userCode);
        if (user!=null&&user.getUserPassword().equals(userPassword)){
            return user;
        }
        return null;
    }
}
