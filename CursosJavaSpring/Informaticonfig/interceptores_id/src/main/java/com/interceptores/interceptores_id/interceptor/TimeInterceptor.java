package com.interceptores.interceptores_id.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TimeInterceptor implements HandlerInterceptor {
    private static final String START_TIME = "inicio";

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception{

        long TiempoInicio = System.currentTimeMillis();
        request.setAttribute(START_TIME, TiempoInicio);

        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception{

        // calcular el tiempo transcurrido
        long Tiempoinicio = (long) request.getAttribute(START_TIME);
        long Tiempofin = System.currentTimeMillis() - Tiempoinicio;
        System.out.println("Tiempo de ejecucion: " + Tiempofin + " milisegundos para URL " + request.getRequestURI());

    }

}
