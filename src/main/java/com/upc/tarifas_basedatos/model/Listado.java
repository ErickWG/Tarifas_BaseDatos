package com.upc.tarifas_basedatos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Listado implements Serializable {
    private  String categoria;
    private Integer cantidad;
    private Date fecha;
    private double importe;



}
