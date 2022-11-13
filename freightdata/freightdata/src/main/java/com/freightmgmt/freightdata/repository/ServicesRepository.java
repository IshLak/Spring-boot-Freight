package com.freightmgmt.freightdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.freightmgmt.freightdata.entity.ServicesEntity;
import com.freightmgmt.freightdata.entity.UserEntity;

@Repository
public interface ServicesRepository extends JpaRepository<ServicesEntity, Integer>{
	
	@Query(value = "SELECT * FROM `services` "
			+ "WHERE `source` LIKE ?1 AND `destination` LIKE ?2", nativeQuery = true)
	public List<ServicesEntity> findByLocations(String source, String destination);

}
