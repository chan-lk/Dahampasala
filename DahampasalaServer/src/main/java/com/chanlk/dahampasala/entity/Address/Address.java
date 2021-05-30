package com.chanlk.dahampasala.entity.Address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ADDRESS_TAB")
@NoArgsConstructor
@Getter
@Setter
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1237035459548868487L;

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADDRESS_ID", unique = true)
	private long id;
	
	
	@Column(name = "ADDRESS1")
	private String address1;

	@Column(name = "ADDRESS2")
	private String address2;

	@Column(name = "ADDRESS3")
	private String address3;

	@Column(name = "ADDRESS4")
	private String address4;

	@Column(name = "ADDRESS5")
	private String address5;

	@Column(name = "ADDRESS6")
	private String address6;

	@Column(name = "ZIP_CODE")
	private String zip_code;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	@Column(name = "COUNTY")
	private String county;

	@Column(name = "COUNTRY_CODE")
	private String countryCode;

	@Column(name = "LOCATION_ID ")
	private String locationId;

	@Column(name = "HOME_PHONE")
	private String homePhone;

	@Column(name = "MOBILE_PHONE1")
	private String mobilePhone1;

}
