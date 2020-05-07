package com.pickship.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class HotelMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long menuId;
	String menu;
	@OneToMany(targetEntity = HotelDish.class,cascade = CascadeType.ALL)
	@JoinColumn(name="menueDish",referencedColumnName = "menuId")
	List<HotelDish> dishs;
	
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public List<HotelDish> getDishs() {
		return dishs;
	}
	public void setDishs(List<HotelDish> dishs) {
		this.dishs = dishs;
	}
}
