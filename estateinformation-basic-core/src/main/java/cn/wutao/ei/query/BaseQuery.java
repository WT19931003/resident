package cn.wutao.ei.query;

import java.util.Map;

public class BaseQuery {

    //当前页
    private int page = 1;

    //每页显示条数
    private int rows = 10;

    //高级查询传入参数
    private String q;

    private int user;

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    //从那一页开始显示数据
    public int getStart(){
        return (this.page-1)*rows;
    }

    //根据数据条数展示数据
    public void setLimit(int limit){
        this.rows = limit;
    }
}
