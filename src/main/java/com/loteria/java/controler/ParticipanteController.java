package com.loteria.java.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/ubunpay")
public class ParticipanteController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/recordTransaction/")
    public int recordTransaction(@RequestParam("id") String id, @RequestParam("nombre") String nombre, @RequestParam("edad") int edad){
        int  result =0;
        try {
            result = jdbcTemplate.update(
                    "INSERT INTO participante VALUES (?, ?, ?)",  id, nombre, edad);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
