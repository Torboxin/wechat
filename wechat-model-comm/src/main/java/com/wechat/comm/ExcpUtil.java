package com.wechat.comm;

/**
 * 
 * Project: wechat-model-comm
 * Title: com.wechat.comm.ExcpUtil
 * Description: 异常堆栈信息转换类
 * 				将异常堆栈信息转换为字符串信息以方便保存
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public class ExcpUtil {
    //打印异常堆栈信息
    public static String getStackTraceString(Throwable ex){//(Exception ex) {
        StackTraceElement[] traceElements = ex.getStackTrace();
 
        StringBuilder traceBuilder = new StringBuilder();
 
        if (traceElements != null && traceElements.length > 0) {
            for (StackTraceElement traceElement : traceElements) {
                traceBuilder.append(traceElement.toString());
                traceBuilder.append("\n");
            }
        }
 
        return traceBuilder.toString();
    }
 
    //构造异常堆栈信息
    public static String buildErrorMessage(Exception ex) {
 
        String result;
        String stackTrace = getStackTraceString(ex);
        String exceptionType = ex.toString();
        String exceptionMessage = ex.getMessage();
 
        result = String.format("%s : %s \r\n %s", exceptionType, exceptionMessage, stackTrace);
 
        return result;
    }
}