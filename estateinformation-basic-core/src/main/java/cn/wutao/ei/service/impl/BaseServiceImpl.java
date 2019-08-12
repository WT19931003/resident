package cn.wutao.ei.service.impl;

import cn.wutao.ei.PageList;
import cn.wutao.ei.mapper.BaseMapper;
import cn.wutao.ei.query.BaseQuery;
import cn.wutao.ei.service.IBaseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import java.util.List;


public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    //Basic没有引入spring相关包，不能使用注解注入，在具体service上实现本方法
    protected abstract BaseMapper<T> getMapper();

    @Override
    public void save(T t) {

        getMapper().insert(t);

    }

    @Override
    public void delete(Long id) {
        getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public void update(T t) {
        getMapper().updateByPrimaryKey(t);

    }

    @Override
    public T findOne(Long id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public List<T> findAll() {
        return getMapper().selectAll();
    }

    @Override
    public PageList<T> queryPage(BaseQuery query) {
        Page<T> page = PageHelper.startPage(query.getPage(), query.getRows());
        getMapper().queryPageList(query);
        return new PageList<T>(page.getTotal(),page.getResult());
    }
}
