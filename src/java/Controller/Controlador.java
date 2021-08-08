/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author EXO
 */
@Controller
public class Controlador {
    
    ModelAndView mv = new ModelAndView();
    
    @RequestMapping(value="index.htm", method= RequestMethod.GET)
    public ModelAndView getIndex(){
        mv.setViewName("index");
        return mv;
    }
    
    
    @RequestMapping(value="menu.htm", method= RequestMethod.GET)
    public ModelAndView getMenu(){
        mv.setViewName("menu");
        return mv;
    }
 
   
    @RequestMapping(value= "index.htm", method= RequestMethod.POST)
    public ModelAndView getValidar(HttpServletRequest request,HttpServletResponse response){
       String nombre = request.getParameter("nombre");
       String email = request.getParameter("email");
       
       if(nombre.equals("")&& email.equals("")){
           mv.setViewName("index");
       }else{
           mv.setViewName("menu");
       }
           return mv;
    }
    
    @RequestMapping(value="rojo.htm", method= RequestMethod.GET)
    public ModelAndView getRojo(){
        mv.setViewName("rojo");
        return mv;
    }
    
    @RequestMapping(value="naranja.htm", method= RequestMethod.GET)
    public ModelAndView getNaranja(){
        mv.setViewName("naranja");
        return mv;
    }
    
    @RequestMapping(value="amarillo.htm", method= RequestMethod.GET)
    public ModelAndView getAmarillo(){
        mv.setViewName("amarillo");
        return mv;
    }
    
    @RequestMapping(value="verde.htm", method= RequestMethod.GET)
    public ModelAndView getVerde(){
        mv.setViewName("verde");
        return mv;
    }
    
    @RequestMapping(value="azul.htm", method= RequestMethod.GET)
    public ModelAndView getAzul(){
        mv.setViewName("azul");
        return mv;
    }
    
    @RequestMapping(value="violeta.htm", method= RequestMethod.GET)
    public ModelAndView getVioleta(){
        mv.setViewName("violeta");
        return mv;
    }
    
}
