package com.upc.tarifas_basedatos.repository;

import com.upc.tarifas_basedatos.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra,Long> {
}
