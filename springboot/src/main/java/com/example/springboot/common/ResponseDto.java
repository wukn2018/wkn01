package com.example.springboot.common;
import com.alibaba.fastjson.JSON;
import com.example.springboot.common.constants.CMSExceptionCode;
import lombok.Data;
import org.junit.platform.commons.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/28.
 */
@Data
public class ResponseDto<T> implements Serializable {

    private Logger logger = LoggerFactory.getLogger(ResponseDto.class);
    public static final String RESULT_ACCEPT = "ACCEPT";
    public static final String RESULT_ERROR = "ERROR";
    public static final String RESULT_SUCCESS = "SUCCESS";
    public static final String RESULT_FAIL = "FAIL";
    private String result;
    private String errorCode;
    private String errorMsg;
    private T data;

    public ResponseDto() {
    }

    public ResponseDto(T data) {
        this.result = "SUCCESS";
        this.data = data;
    }

    public ResponseDto(CMSExceptionCode cmsExceptionCode) {
        this.result = "FAIL";
        this.errorCode = cmsExceptionCode.getCode();
        this.errorMsg = cmsExceptionCode.getMessage();
    }


    public ResponseDto(String result, T data, String errorCode) {
        this.result = result;
        this.data = data;
        if (StringUtils.isNotBlank(errorCode)) {
            this.errorCode = errorCode;
            this.errorMsg = CMSExceptionCode.FAIL.getMessage();
        }

    }


    public ResponseDto(String result, T data, String errorCode, String errorMsg) {
        this.result = result;
        this.data = data;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public ResponseDto(String result, T data, String errorCode, Class<? extends CMSExceptionCode> ExceptionClass) {
        this.result = result;
        this.data = data;
        if (StringUtils.isNotBlank(errorCode)) {
            this.errorCode = errorCode;
            if (ExceptionClass == null) {
                this.errorMsg = CMSExceptionCode.SUCCESS.getMessage();
            } else {
                try {
                    Method getExceptionMsg = ExceptionClass.getMethod("getExceptionMsg", String.class);
                    Object invokeResult = getExceptionMsg.invoke(ExceptionClass.newInstance(), errorCode);
                    if (invokeResult != null) {
                        this.errorMsg = invokeResult.toString();
                    }
                } catch (Exception var7) {
                    var7.printStackTrace();
                }
            }
        }

    }


    public static ResponseDto<Long> createLong(Long value) {
        return new ResponseDto(value);
    }

    public static ResponseDto<Short> createShort(Short value) {
        return new ResponseDto(value);
    }

    public static ResponseDto<Integer> createInteger(Integer value) {
        return new ResponseDto(value);
    }

    public static ResponseDto<Float> createFloat(Float value) {
        return new ResponseDto(value);
    }

    public static ResponseDto<Double> createDouble(Double value) {
        return new ResponseDto(value);
    }

    public static ResponseDto<BigDecimal> createBigDecimal(BigDecimal value) {
        return new ResponseDto(value);
    }

    public static ResponseDto<Object> createObject(Object obj) {
        return new ResponseDto(obj);
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
