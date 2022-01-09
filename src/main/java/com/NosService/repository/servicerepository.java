package com.NosService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NosService.model.new_service;

@Repository
public interface servicerepository extends JpaRepository<new_service,Integer> {

}
