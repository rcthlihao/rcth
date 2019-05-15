package cn.rcth.base.msg;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Service 返回统一的消息格式
 *
 * @param <T>
 * @author Allen
 */
@Data
public class ResultMsg<T> implements Serializable {

    private static final long serialVersionUID = 929000570441785903L;

    public static final String MSG_SUCCESS_DFT = "SUCCESSFUL";
    // 错误码
    private int code;
    // 错误信息
    private String msg;
    // 数据
    private T data;

    public ResultMsg() {
    }

    public ResultMsg(int code) {
        this.code = code;
    }

    public ResultMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultMsg(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultMsg(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResultMsg(T data) {
        this.code = RespCode.SUCCESS.getCode();
        this.msg = MSG_SUCCESS_DFT;
        this.data = data;
    }

    public static <T> ResultMsg successResult(T data) {
        return new ResultMsg(data);
    }

    public static <T> ResultMsg successResultMap(String attributeName, T data) {
        HashMap<String, T> map = new HashMap<>(2);
        map.put(attributeName, data);
        return new ResultMsg(map);
    }

    public static ResultMsg failedResult(String msg) {
        return new ResultMsg(RespCode.FAILED.getCode(), msg);
    }

    public enum RespCode {
        SUCCESS(1), EXCEPTION(-1), FAILED(0);
        public int value;

        RespCode(int value) {
            this.value = value;
        }

        public int getCode() {
            return value;
        }
    }

}
