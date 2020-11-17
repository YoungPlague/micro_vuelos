package com.core.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.api.model.Vuelo;

public interface IVueloRepository extends JpaRepository<Vuelo, Long> {

}
