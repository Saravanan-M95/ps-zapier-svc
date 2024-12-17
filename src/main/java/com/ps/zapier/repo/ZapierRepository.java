package com.ps.zapier.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ps.zapier.entity.ZapierData;

public interface ZapierRepository extends JpaRepository<ZapierData, Integer> {

}
