package cn.wutao.ei.service.impl;

import cn.wutao.ei.domain.User;
import cn.wutao.ei.mapper.BaseMapper;
import cn.wutao.ei.mapper.UserMapper;
import cn.wutao.ei.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    protected BaseMapper<User> getMapper() {
        return null;
    }
}
