

/**
 *
 * @author adri
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
public class BoletoController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/recordTransaction/")
    public int recordTransaction(@RequestParam("identificacion") int identificacion, @RequestParam("valor") double valor, @RequestParam("numcifras") int numcifras, @RequestParam("fechacompra") 
            Date fechacompra,@RequestParam("estado") int estado){
        int  result =0;
        try {
            result = jdbcTemplate.update(
                    "INSERT INTO Boleto VALUES (?, ?, ?, ?, ?)",  identificacion, valor, numcifras, fechacompra, estado);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}