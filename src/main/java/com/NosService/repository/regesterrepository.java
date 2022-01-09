package com.NosService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NosService.model.regester;

@Repository
public interface regesterrepository extends JpaRepository<regester,Integer>{

	
}
