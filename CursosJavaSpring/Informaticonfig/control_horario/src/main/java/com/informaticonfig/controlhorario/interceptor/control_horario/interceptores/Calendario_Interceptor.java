package com.informaticonfig.controlhorario.interceptor.control_horario.interceptores;

import jakarta.annotation.Nullable;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;

@Component
public class Calendario_Interceptor implements HandlerInterceptor {

    @Value("${config.calendar.open}")
    private int open;

    @Value("${config.calendar.close}")
    private int close;

    @Override
    public boolean preHandle(HttpServletResponse request, HttpServletResponse response, Object handler) throws Exception{
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);

            if(hora >=open && hora < close){
                StringBuilder mensaje = new StringBuilder("Bienvenido! ");
                mensaje.append("Atendemos desde las: ");
                mensaje.append(open);
                mensaje.append("AM");
                mensaje.append(" hasta las: ");
                mensaje.append(close);
                mensaje.append("PM");
                mensaje.append("Gracias por su visita");
                request.setAttribute("Mensaje", mensaje.toString());
                return true;
            }else{
                return false;
            }
    }

    @Override
    public boolean postHandle(HttpServletResponse request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception{

    }

}
