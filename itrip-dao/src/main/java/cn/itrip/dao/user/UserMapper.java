package cn.itrip.dao.user;

import cn.itrip.beans.pojo.User;

public interface UserMapper {
    User getUserByUserCode(String userCode);
}
