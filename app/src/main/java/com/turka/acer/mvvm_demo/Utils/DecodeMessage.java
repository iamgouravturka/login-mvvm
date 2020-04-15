package com.turka.acer.mvvm_demo.Utils;

public class DecodeMessage {
    
    public static String msg(int code){
        String msg = "";
        
        if(code == GlobalConstants.INVALID_FIRST_NAME)
            msg = GlobalConstants.STR_INVALID_FIRST_NAME;

        else if(code == GlobalConstants.INVALID_LAST_NAME)
            msg = GlobalConstants.STR_INVALID_LAST_NAME;

        else if(code == GlobalConstants.INVALID_EMAIL)
            msg = GlobalConstants.STR_INVALID_EMAIL;

        else if(code == GlobalConstants.INVALID_PASSWORD)
            msg = GlobalConstants.STR_INVALID_PASSWORD;
        
        return msg;
    }
}
