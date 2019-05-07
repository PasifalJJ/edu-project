package com.literary.user;

import com.literary.User;
import com.literary.base.IBaseService;

public interface IUserService extends IBaseService<User> {
    //继承IBaseService公有方法,此处只需要写UserService的特有方法
}
