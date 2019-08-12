package cn.wutao.ei;
/**
 * 给前端返回jSON对象
 * */
public class AjaxResult {

    private Boolean success = true;

    private String msg;

    private Object data;

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public Object getData() {
        return data;
    }

    public AjaxResult setData(Object data) {
        this.data = data;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
