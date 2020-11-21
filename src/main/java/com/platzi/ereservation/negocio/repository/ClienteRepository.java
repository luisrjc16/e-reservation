package com.platzi.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.model.Cliente;

/**
 * 
 * @author tuzol
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {
	
	/**
	 * Definicion del metodo para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	/**
	 * Metodo para consultar Cliente por si Identificacion a traves de un @NamedQuery (Consultar clase Cliente)
	 * @param identificacionCli
	 * @return
	 */
	public Cliente findByIdentificacion(String identificacionCli);
	
	/**
	 * Definicion del metodo para buscar los clientes por su nombre
	 * @param nombreCli
	 * @return
	 */
	public List<Cliente> findByNombreCli(String nombreCli);
}
