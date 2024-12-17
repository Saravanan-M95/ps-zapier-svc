package com.ps.zapier.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "ZapierData")
@Entity
public class ZapierData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String data;

}
