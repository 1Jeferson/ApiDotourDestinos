package com.apidotour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apidotour.model.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {

	List<Destino> findByDestino(String destino);

}
