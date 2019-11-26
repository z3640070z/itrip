package cn.itrip.auth.service;

import cn.itrip.beans.pojo.User;

public interface UserService {
    User getUserByComment(String userCode,String userPassword);

}
