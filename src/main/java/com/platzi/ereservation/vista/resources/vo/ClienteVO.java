/**
 * 
 */
package com.platzi.ereservation.vista.resources.vo;

import lombok.Data;

/**
 * @author tuzol
 *
 */
@Data
public class ClienteVO {
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
}