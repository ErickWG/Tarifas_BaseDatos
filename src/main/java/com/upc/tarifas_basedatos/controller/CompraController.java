package com.upc.tarifas_basedatos.controller;

import com.upc.tarifas_basedatos.model.Compra;
import com.upc.tarifas_basedatos.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraController {
    @Autowired
    public final CompraService compraService;

    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }
    @GetMapping
    public List<Compra> lista(){return compraService.lista();}
    @PostMapping
    public ResponseEntity<Compra> inserta (@RequestBody Compra compra) { return new ResponseEntity<>(compraService.inserta(compra),HttpStatus.CREATED);}
}
