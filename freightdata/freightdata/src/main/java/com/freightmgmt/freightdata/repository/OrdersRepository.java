package com.freightmgmt.freightdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freightmgmt.freightdata.entity.OrdersEntity;
import com.freightmgmt.freightdata.entity.ServicesEntity;

@Repository
public interface OrdersRepository extends JpaRepository<OrdersEntity, Integer>{

}
