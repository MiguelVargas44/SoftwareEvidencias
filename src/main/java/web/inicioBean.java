/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Asus
 */
@ManagedBean
@SessionScoped
public class inicioBean { 
    public String irRegistro(){
        return "PantallaRegistro";
    }
    
    public String irProfesor(){
        return "InterfazProfesor";
    }
    
    public String irCreacionClase(){
        return "CreacionClase";
    }
    
    public String irCreacionTarea(){
        return "CrearTarea";
    }
    
    public String irEstud(){
        return "InterfazEstudiante";
    }
    
    public String irSubirTarea(){
        return "SubidaTarea";
    }
}
