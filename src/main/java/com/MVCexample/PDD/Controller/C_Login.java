package com.MVCexample.PDD.Controller;

import com.MVCexample.PDD.Service.S_Login;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Login {

    @GetMapping("/")
    public String getLogin(){
        return "index";
    }
    @PostMapping("/")
    public String postLogin(@RequestParam("usuario")String usuario,
                            @RequestParam("senha")String senha,
                            HttpSession session, Model model) {
        session.setAttribute("usuario", S_Login.validarL(usuario, senha));
        if (session.getAttribute("usuario") != null) {
            return "Home/home";
        } else {
            model.addAttribute("erro","Usuario ou Senha inválido");
            model.addAttribute("usuario",usuario);
            return "index";
        }
    }
}
