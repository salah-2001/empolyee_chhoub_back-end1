package com.NosService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NosService.model.contact;

@Repository
public interface contactrepository extends JpaRepository<contact,Integer>{

}
