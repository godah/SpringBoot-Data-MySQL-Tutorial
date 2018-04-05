package com.minhaapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Isso informa ao hibernate para fazer uma tabela desta classe
public class User {
    @Id//Indica que o atributo id é a chave primária da tabela
    @GeneratedValue(strategy=GenerationType.AUTO)//Faz do id auto-incrementável
    private Integer id;

    private String name;

    private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
}

