package com.example.springboot.exception;


import com.example.springboot.common.constants.CMSExceptionCode;

/**
 * com.xinguangnet.tuchao.merchant.manage
 *
 * @Author : Wukn
 * @Date : 2018/6/13
 */
public class CMSException extends BaseException{
    public CMSException(CMSExceptionCode respCode) {
        super(respCode.getCode(),respCode.getMessage());
    }

    /**
     * @param errorCode
     * @param message
     */
    public CMSException(String errorCode, String message) {
        super(errorCode, message);
    }
}
