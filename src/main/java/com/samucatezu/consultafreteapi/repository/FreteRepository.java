package com.samucatezu.consultafreteapi.repository;

import com.samucatezu.consultafreteapi.model.Frete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreteRepository extends JpaRepository<Frete, Long> {
}
