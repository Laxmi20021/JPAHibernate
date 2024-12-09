package com.xworkz.buses.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="bus_table")


@NamedQuery(name="findbyBusId", query="select entity from BusEntity entity where entity.BusId=:bsId")
@NamedQuery(name="findAll", query="select entity from BusEntity entity")
@NamedQuery(name="findBusNamebyCustomerEmail", query="select entity.BusName from BusEntity entity where entity.CustomerEmail= :getEmail")
@NamedQuery(name="findMobileByBusName", query="select entity.Mobile from BusEntity entity where entity.BusName= :getName")
@NamedQuery(name = "findCostById", query = "Select entity.cost From BusEntity entity where entity.id = :setId")



@NamedQuery(name="findAll" ,query="select et from BusEntity et")
@NamedQuery(name="findIdByBusName" ,query="select et.BusId from BusEntity et where et.BusName= :byName")

public class BusEntity {
	
	@Id
	private int id;
	private int BusId;
	private String BusName;
	private String CustomerEmail;
	private String Buscoach;
	private double cost;
	private long Mobile;
	
	public BusEntity()
	{
		
	}

	/**
	 * @param id
	 * @param busId
	 * @param busName
	 * @param customerEmail
	 * @param buscoach
	 * @param cost
	 * @param mobile
	 */
	public BusEntity(int id, int busId, String busName, String customerEmail, String buscoach, double cost,
			long mobile) {
		super();
		this.id = id;
		BusId = busId;
		BusName = busName;
		CustomerEmail = customerEmail;
		Buscoach = buscoach;
		this.cost = cost;
		Mobile = mobile;
	}



	@Override
	public String toString() {
		return "BusEntity [id=" + id + ", BusId=" + BusId + ", BusName=" + BusName + ", CustomerEmail=" + CustomerEmail
				+ ", Buscoach=" + Buscoach + ", cost=" + cost + ", Mobile=" + Mobile + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getBusId() {
		return BusId;
	}



	public void setBusId(int busId) {
		BusId = busId;
	}



	public String getBusName() {
		return BusName;
	}



	public void setBusName(String busName) {
		BusName = busName;
	}



	public String getCustomerEmail() {
		return CustomerEmail;
	}



	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}



	public String getBuscoach() {
		return Buscoach;
	}



	public void setBuscoach(String buscoach) {
		Buscoach = buscoach;
	}



	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	public long getMobile() {
		return Mobile;
	}



	public void setMobile(long mobile) {
		Mobile = mobile;
	}
	
	
}
