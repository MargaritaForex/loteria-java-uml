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
public class SorteoController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/recordTransaction/")
    public int recordTransaction(@RequestParam("sorteo") int sorteo, @RequestParam("fecha_sorteo") Date fecha_sorteo,@RequestParam("nombre_sorteo") String nombre_sorteo){
        int  result =0;
        try {
            result = jdbcTemplate.update(
                    "INSERT INTO sorteo VALUES (?, ?)",  sorteo, fecha_sorteo,nombre_sorteo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}