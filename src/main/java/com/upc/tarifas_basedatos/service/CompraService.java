package com.upc.tarifas_basedatos.service;

import com.upc.tarifas_basedatos.model.Compra;
import com.upc.tarifas_basedatos.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {
    @Autowired
    private final CompraRepository compraRepository;

    public CompraService(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }
    //Listar compras
    public List<Compra> lista(){return compraRepository.findAll();}
    //Insertar compra
    public Compra inserta(Compra compra){return compraRepository.save(compra);}
}
