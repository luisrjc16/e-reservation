/**
 * 
 */
package com.platzi.ereservation.negocio.services;

import com.platzi.ereservation.model.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;

/**
 * @author tuzol
 *
 */
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	/**
	 * Metodo para realizar la operacion de crear un Cliente
	 * @param cliente
	 * @return
	 */
	public Cliente create(Cliente cliente)
	{
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Metodo para realizar la operacion de actualizar un Cliente
	 * @param cliente
	 * @return
	 */
	public Cliente update(Cliente cliente)
	{
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Metodo para realizar la operacion de eliminar un Cliente
	 * @param cliente
	 */
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	
	/**
	 * Metodo para Consultar un Cliente por su Identificacion
	 * @param identificacionCli
	 * @return
	 */
	public Cliente findByIdentificacion(String identificacionCli) {
		return this.clienteRepository.findByIdentificacion(identificacionCli);
	}
}
