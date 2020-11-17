package com.core.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.api.model.Pasajero;

public interface IPasajeroRepository extends JpaRepository<Pasajero, Long> {

}