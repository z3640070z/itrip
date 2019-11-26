package cn.itrip.common;

import cn.itrip.beans.dto.Dto;

public class DtoUtil {
    private static final String FLAG_SUCCESS="true";
    private static final String FLAG_FAIL="false";
    public static Dto returnSuccess(Object obj){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_SUCCESS);
        dto.setData(obj);
        dto.setErrorCode(ErrorCode.NO_ERROR);
        return dto;
    }
    public static Dto returnSuccess(String msg,Object obj){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_SUCCESS);
        dto.setData(obj);
        dto.setErrorCode(ErrorCode.NO_ERROR);
        dto.setMsg(msg);
        return dto;
    }
    public static Dto returnSuccess(String msg){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_SUCCESS);
        dto.setErrorCode(ErrorCode.NO_ERROR);
        dto.setMsg(msg);
        return dto;
    }
    public static Dto returnFail(String msg){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_FAIL);
        dto.setErrorCode(ErrorCode.DEFAULT_ERROR);
        dto.setMsg(msg);
        return dto;
    }
}
