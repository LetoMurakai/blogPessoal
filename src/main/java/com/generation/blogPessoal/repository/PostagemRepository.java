package com.generation.blogPessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.blogPessoal.model.postagem;
import java.util.List;

@Repository
public interface PostagemRepository extends JpaRepository<postagem, Long> {
	
	public List<postagem> findAllByTituloContainingIgnoreCase (String titulo);
	
}
