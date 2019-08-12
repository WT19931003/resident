package cn.wutao.ei;



import java.util.ArrayList;
import java.util.List;

/**
 * 处理分页，方便前端取值
 *
 * */
public class PageList<T> {

    //返回的状态  0表示正常的返回
    private Integer code = 0;
    //返回的提示信息
    private String msg = "";
    //返回的总条数
    private Long count;
    //返回的详细数据
    private List<T> data = new ArrayList<>();

    public PageList(Long count, List<T> data) {
        this.count = count;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public PageList() {

    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
