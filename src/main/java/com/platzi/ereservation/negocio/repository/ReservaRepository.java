/**
 * 
 */
package com.platzi.ereservation.negocio.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.platzi.ereservation.model.Reserva;

/**
 * @author tuzol
 *
 */
public interface ReservaRepository extends JpaRepository<Reserva, String> {
	
	@Query("select r from Reserva where r.fechaIngresoRes =: fechaInicio and r.fechaSalidaRes =: fechaSalida")
	public List<Reserva> find(@Param("") Date fechaInicio, @Param("fechaSalida") Date fechaSalida);
}