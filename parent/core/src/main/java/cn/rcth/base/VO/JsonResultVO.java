package cn.rcth.base.VO;

/**
 * JSON字符串
 */
public class JsonResultVO {

    private boolean success = true;

    private String msg;

    public boolean isSuccess() {
        return success;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.success = false;
        this.msg = msg;
    }

    public static JsonResultVO success() {
        return new JsonResultVO();
    }

    public static JsonResultVO error(String msg) {
        JsonResultVO jsonResultVO = new JsonResultVO();
        jsonResultVO.setMsg(msg);
        return jsonResultVO ;
    }
}
