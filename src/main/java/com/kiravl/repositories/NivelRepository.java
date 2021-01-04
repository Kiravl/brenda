package com.kiravl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiravl.models.Nivel;

@Repository
public interface NivelRepository extends JpaRepository<Nivel, Long> {

}
