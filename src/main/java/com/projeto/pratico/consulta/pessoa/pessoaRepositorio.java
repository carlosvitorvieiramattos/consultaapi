package com.projeto.pratico.consulta.pessoa;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pessoa", path = "pessoa")
public interface pessoaRepositorio extends JpaRepository <pessoa, Long> {

	List BuscarPorNome(String name);
}
