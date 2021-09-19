package org.generation.blogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
							//Nome reservado
	public Optional<Usuario> findByUsuario(String usuario);
	
	
	//Inserido-Teste-BD
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
	//Inserido-Teste-BD
	public Usuario findByNome(String nome);

}
