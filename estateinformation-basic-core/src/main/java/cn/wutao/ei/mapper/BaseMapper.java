package cn.wutao.ei.mapper;

import cn.wutao.ei.query.BaseQuery;

import java.util.List;

public interface BaseMapper<T> {

    int deleteByPrimaryKey(Long id);

    int insert(T t);

    T selectByPrimaryKey(Long id);

    List<T> selectAll();

    int updateByPrimaryKey(T t);

    List<T> queryPageList(BaseQuery baseQuery);

}
