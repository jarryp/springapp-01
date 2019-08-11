package com.palaciossystems;

import org.springframework.beans.factory.annotation.Autowired;

public class Administrador {
	
	private String idAd;
	private String nombre;
	
	//@Autowired
	private Direccion direccion;
	
	
	
	

	public Administrador(String idAd, String nombre, Direccion direccion) {
		this.idAd = idAd;
		this.nombre = nombre;
		this.direccion = direccion;
	}





	public void setIdAd(String idAd) {
		this.idAd = idAd;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	@Autowired
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}



    

	@Override
	public String toString() {
		return "Administrador [idAd=" + idAd + ", nombre=" + nombre
				+ ", direccion=" + direccion + "]";
	}





	public void imprimirDireccion(){
		System.out.println("Palacios Systems");
	}

}
