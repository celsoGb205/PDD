package com.MVCexample.PDD.Service;

import com.MVCexample.PDD.Modal.M_Login;
import com.MVCexample.PDD.Repository.R_Login;
import org.springframework.stereotype.Service;

@Service
public class S_Login {

    private static R_Login r_login;

    public S_Login(R_Login r_login) {
        this.r_login = r_login;
    }

    public static M_Login validarL(String usuario, String senha){
        return r_login.us(usuario,senha);
    }
}
