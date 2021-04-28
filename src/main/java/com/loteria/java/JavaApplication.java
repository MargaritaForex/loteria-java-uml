package com.loteria.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JavaApplication {//implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public static void main(String[] args)  {


        SpringApplication.run(JavaApplication.class, args);
        System.out.println("Prueba coneccion BD");
    }

  /*  @Override
    public void run(String... args) throws Exception {


        int  result = jdbcTemplate.update(
                "INSERT INTO participante VALUES (?, ?, ?)",  6, "Adriana", 24);

        int  resultadoEliminar = jdbcTemplate.update(
                "DELETE FROM  participante WHERE idparticipante = 1");


        if (result > 0) {
            System.out.println("A new row has been inserted.");
        }

    }*/

}
