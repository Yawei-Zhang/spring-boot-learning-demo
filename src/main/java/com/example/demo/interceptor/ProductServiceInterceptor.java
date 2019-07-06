package com.example.demo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ProductServiceInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle
            (HttpServletRequest request, HttpServletResponse response,
             Object handler) throws Exception {

        System.out.println("Pre Handle method is calling");
        return true;
    }

    @Override
    public void postHandle
            (HttpServletRequest request, HttpServletResponse response,
             Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("Post Handle method is calling");
    }

    @Override
    public void afterCompletion
            (HttpServletRequest request, HttpServletResponse response,
             Object handler, Exception exception) throws Exception {

        System.out.println("After Completion method is calling");
    }
}
