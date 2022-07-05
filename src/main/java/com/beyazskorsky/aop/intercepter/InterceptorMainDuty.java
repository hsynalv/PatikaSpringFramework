package com.beyazskorsky.aop.intercepter;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@com.beyazskorsky.aop.intercepter.Interceptor
public class InterceptorMainDuty {

    @AroundInvoke public Object logging(InvocationContext context){
        System.out.println("İlk hali " + context.getMethod().getName());

        boolean isLogin = false;
        Object isContinue = null;

        if(isLogin){
            System.out.println("Önce sisteme giriş yapılması gerek");
            return null;
        }else{
            try{
                isContinue = context.proceed();
                System.out.println("Sonraki hali " + isContinue);
            }catch(Exception ex){
                ex.printStackTrace();
            }
            return isContinue;
        }
    }

}
