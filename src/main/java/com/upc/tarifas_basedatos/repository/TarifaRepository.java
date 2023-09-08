package com.upc.tarifas_basedatos.repository;

import com.upc.tarifas_basedatos.model.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarifaRepository  extends JpaRepository<Tarifa,Long> {
}
