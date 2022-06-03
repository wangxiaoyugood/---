package com.lagou.user.service.impl;


import com.lagou.entity.User;
import com.lagou.user.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


/**
 * 用户表(User)表服务实现类
 *
 * @author makejava
 * @since 2022-03-31 18:34:07
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return null;
    }

    @Override
    public Page<User> queryByPage(User user, PageRequest pageRequest) {
        return null;
    }

    @Override
    public User insert(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}
