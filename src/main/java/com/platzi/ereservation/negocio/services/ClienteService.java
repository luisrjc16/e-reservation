/**
 * 
 */
package com.platzi.ereservation.negocio.services;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 34c6a2375e3f4793129bbd72d61d0303fd0c4d48
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.model.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;

/**
 * @author tuzol
 *
 */
@Service
<<<<<<< HEAD
@Transactional(readOnly = true)
=======
@Transactional(readOnly=true)
>>>>>>> 34c6a2375e3f4793129bbd72d61d0303fd0c4d48
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
	@Transactional
	public Cliente create(Cliente cliente)
	{
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Metodo para realizar la operacion de actualizar un Cliente
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente update(Cliente cliente)
	{
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Metodo para realizar la operacion de eliminar un Cliente
	 * @param cliente
	 */
	@Transactional
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
	
	/**
	 * Definicion del metodo para buscar los clientes por su nombre
	 * @param nombreCli
	 * @return
	 */
	public List<Cliente> findByNombreCli(String nombreCli)
	{
		return this.clienteRepository.findByNombreCli(nombreCli);
	}
	
	/**
	 * Definicion del metodo para obtener una lista de clientes
	 * @param nombreCli
	 * @return
	 */
	public List<Cliente> findAll()
	{
		return this.clienteRepository.findAll();
	}
}
