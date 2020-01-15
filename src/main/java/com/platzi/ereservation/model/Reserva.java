/**
 * 
 */
package com.platzi.ereservation.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author tuzol
 *
 */
@Data
@Entity()
@Table(name = "reserva")
public class Reserva {
	
	private String idRes;
	private Date fechaIngresoRes;
	private Date fechaSalidaRes;
	private int cantidadPersonasRes;
	private String descripcionRes;
	@ManyToOne
	@JoinColumn(name = "idCli")
	private Cliente cliente;
}
