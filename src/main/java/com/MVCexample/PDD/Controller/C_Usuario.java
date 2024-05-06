package com.MVCexample.PDD.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Usuario {
    @GetMapping("/listar")
    public String gerListaU(){
        return "Usuario/pv_lu";
    }
}
