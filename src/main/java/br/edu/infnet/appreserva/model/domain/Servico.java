package br.edu.infnet.appreserva.model.domain;

public abstract class Servico {
	
	private Integer id;
	private boolean resort;
	private boolean hotelFazenda;
	private boolean hostel;
	
	public boolean isResort() {
		return resort;
	}
	
	public void setResort(boolean resort) {
		this.resort = resort;
	}
	
	public boolean isHotelFazenda() {
		return hotelFazenda;
	}
	
	public void setHotelFazenda(boolean hotelFazenda) {
		this.hotelFazenda = hotelFazenda;
	}
	
	public boolean isHostel() {
		return hostel;
	}
	
	public void setHostel(boolean hostel) {
		this.hostel = hostel;
	}
		
}
