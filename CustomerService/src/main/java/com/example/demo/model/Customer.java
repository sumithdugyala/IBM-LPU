package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private Integer id;
		
		@Column(name="pesel")
		private String pesel;
		
		@Column(name="name")
		private String name;
		
		@Column(name="type")
		private CustomerType type;
		
		public Customer() {
			
		}
		
		public Customer(String pesel, String name, CustomerType type) {
			super();
			this.pesel = pesel;
			this.name = name;
			this.type = type;
		}

		public Customer(Integer id, String pesel, String name, CustomerType type) {
			this.id = id;
			this.pesel = pesel;
			this.name = name;
			this.type = type;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getPesel() {
			return pesel;
		}

		public void setPesel(String pesel) {
			this.pesel = pesel;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public CustomerType getType() {
			return type;
		}

		public void setType(CustomerType type) {
			this.type = type;
		}

		}


