package com.chanlk.dahampasala.entity.dahampasala;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DAHAMPASALA_TAB")
public class Dahampasala implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DAHAMPASALA_ID", unique = true)
	private long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DEF_ADDRESS_ID")
	private int defAddressId;

	@Column(name = "PRINCIPLE_ID")
	private int principleId;

	public Dahampasala() {
		// TODO Auto-generated constructor stub
	}

	public Dahampasala(String name, int defAddressId, int principleId) {
		super();
		this.name = name;
		this.defAddressId = defAddressId;
		this.principleId = principleId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDefAddressId() {
		return defAddressId;
	}

	public void setDefAddressId(int defAddressId) {
		this.defAddressId = defAddressId;
	}

	public int getPrincipleId() {
		return principleId;
	}

	public void setPrincipleId(int principleId) {
		this.principleId = principleId;
	}

}
