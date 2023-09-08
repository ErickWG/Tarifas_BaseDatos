package com.upc.tarifas_basedatos.controller;

import com.upc.tarifas_basedatos.model.Tarifa;
import com.upc.tarifas_basedatos.service.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarifa")
public class TarifaController {
    @Autowired
    public final TarifaService tarifaService;

    public TarifaController(TarifaService tarifaService) {
        this.tarifaService = tarifaService;
    }
    @GetMapping
    public ResponseEntity<List<Tarifa>> lista(){return new ResponseEntity<>(tarifaService.listar(), HttpStatus.OK);}
    @PostMapping
    public ResponseEntity<Tarifa> inserta (@RequestBody Tarifa tarifa) { return new ResponseEntity<>(tarifaService.inserta(tarifa),HttpStatus.CREATED);}
    @PutMapping
    public ResponseEntity<Tarifa> modifica (@RequestBody Tarifa tarifa) { return new ResponseEntity<>(tarifaService.modifica(tarifa),HttpStatus.OK);}
    @DeleteMapping
    public ResponseEntity<Tarifa> elimina (@RequestBody Tarifa tarifa) { return new ResponseEntity<>(tarifaService.elimina(tarifa),HttpStatus.OK);}

}
