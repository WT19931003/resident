package cn.wutao.ei.service;

import cn.wutao.ei.PageList;
import cn.wutao.ei.query.BaseQuery;

import java.util.List;

public interface IBaseService<T> {

    //保存
    void save(T t);

    //删除
    void delete(Long id);
    //修改
    void update(T t);

    //查询单条数据
    T findOne(Long id);

    //查询所有数据
    List<T> findAll();

    PageList<T> queryPage(BaseQuery query);

}
