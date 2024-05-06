package com.MVCexample.PDD.Repository;

import com.MVCexample.PDD.Modal.M_Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Login extends JpaRepository<M_Login,Long> {
    @Query( value = "Select * from usuario where usuario = :usuario and senha = :senha",nativeQuery = true)
    M_Login us(@Param("usuario") String usuario,@Param("senha")String senha);
}
