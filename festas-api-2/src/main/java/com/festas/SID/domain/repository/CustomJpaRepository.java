package com.festas.SID.domain.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

// JpaRepository costumizado

@NoRepositoryBean
public interface CustomJpaRepository<T, ID> extends JpaRepository<T, ID> {

	// Optional<T> buscarPrimeiro();
	
}
