package com.mode.simplefactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApiFactroy {

    public static API createApi(){
        Properties p = new Properties();
        InputStream input = null;
        try{
            input = ApiFactroy.class.getResourceAsStream("api.properties");
            p.load(input);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        String ImplClass = p.getProperty("ImplClass");
        try {
            API api = (API)Class.forName(ImplClass).newInstance();
            return api; 
        } catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
