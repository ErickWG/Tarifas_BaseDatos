package com.upc.tarifas_basedatos.service;

import com.upc.tarifas_basedatos.model.Compra;
import com.upc.tarifas_basedatos.model.Listado;
import com.upc.tarifas_basedatos.repository.CompraRepository;
import com.upc.tarifas_basedatos.repository.TarifaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListadoService {
    @Autowired
    private final CompraRepository compraRepository;

    @Autowired
    private final TarifaRepository tarifaRepository;

    public ListadoService(CompraRepository compraRepository, TarifaRepository tarifaRepository) {
        this.compraRepository = compraRepository;
        this.tarifaRepository = tarifaRepository;
    }
    public List<Listado> lista(){
        List<Compra> compras=compraRepository.findAll();
        List<Listado> listado=new ArrayList<Listado>();
        Listado elem;

        for (Compra c: compras){
            elem=new Listado();
            elem.setFecha(c.getFecha());
            elem.setCategoria(c.getTarifa().getCategoria());
            elem.setCantidad(c.getCantidad());
            elem.setImporte(c.getCantidad()*c.getTarifa().getPrecio());

            listado.add(elem);
            elem=null;
        }
        return listado;
    }
    public List<Listado> lista_iigv(){
        int uno;
        uno=1;
        double suma;
        suma=uno*9.74;
        if (suma-suma==0){
            suma=-5;

        }
        //ggg
        return null;
    }

}
