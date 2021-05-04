/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.loteria.java.controler;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
//dudaaaa
@RequestMapping(value = "/ubunpay")
public class PremioController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/recordTransaction/")
    public int recordTransaction(@RequestParam("idpremio") int idpremio, @RequestParam("valorpremio") double valorpremio){
        int  result =0;
        try {
            result = jdbcTemplate.update(
                    "INSERT INTO premio VALUES (?, ?)",  idpremio, valorpremio);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}