package com.upc.tarifas_basedatos.service;

import com.upc.tarifas_basedatos.model.Tarifa;
import com.upc.tarifas_basedatos.repository.TarifaRepository;
import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarifaService {
    @Autowired
    private final TarifaRepository tarifaRepository;

    public TarifaService(TarifaRepository tarifaRepository) {
        this.tarifaRepository = tarifaRepository;
    }
    //Listar tarifas
    public List<Tarifa> listar(){return tarifaRepository.findAll();}
    //Insertar tarifas
    public Tarifa inserta(Tarifa tarifa){return tarifaRepository.save(tarifa);}
    //Modificar
    public Tarifa modifica(Tarifa tarifa){
        //si existee?
        Tarifa tar= tarifaRepository.findById(tarifa.getId())
                .orElseThrow(() -> new OpenApiResourceNotFoundException("Id de tarifa no existe"));
        return tarifaRepository.save(tarifa);
    }
    //Eliminar
    public Tarifa elimina(Tarifa tarifa){
        //si existee?
        Tarifa tar= tarifaRepository.findById(tarifa.getId())
                .orElseThrow(() -> new OpenApiResourceNotFoundException("Id de tarifa no existe"));
        tarifaRepository.delete(tarifa);
        return tarifa;
    }
}
