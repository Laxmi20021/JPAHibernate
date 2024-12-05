package com.xworkz.station.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="station_table")

@NamedQuery(name="findByTrainename", query="Select ent From StationDto ent where ent.trainename='hubli exp'")
@NamedQuery(name="findBycost", query="Select et From StationDto et where et.cost=470")
@NamedQuery(name="findByid", query="Select enty From StationDto enty where enty.id= 5")
@NamedQuery(name = "findByTrainename&cost", query = "Select et From StationDto et Where et.id =4")
@NamedQuery(name= "findBycost&sections", query="Select et From StationDto et Where et.trainename='Hampi exp'")




public class StationDto {
	
	
	@Id
	
    private int id;
	private String trainename;
	private double cost;
	private String stationName;
	private String sections;
	
	public StationDto()
	{
		System.out.println("-----------------------");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrainename() {
		return trainename;
	}
	public void setTrainename(String trainename) {
		this.trainename = trainename;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	
	public String getSections() {
		return sections;
	}
	public void setSections(String sections) {
		this.sections = sections;
	}
	@Override
	public String toString() {
		return "StationDto [id=" + id + ", trainename=" + trainename + ", cost=" + cost + ", stationName=" + stationName
				+ ", sections=" + sections + ", getId()=" + getId() + ", getTrainename()=" + getTrainename()
				+ ", getCost()=" + getCost() + ", getStationName()=" + getStationName() + ", getSections()="
				+ getSections() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	/**
	 * @param id
	 * @param trainname
	 * @param cost
	 * @param stationName
	 * @param sections
	 */
	public StationDto(int id, String trainename, double cost, String stationName, String sections) {
		super();
		this.id = id;
		this.trainename = trainename;
		this.cost = cost;
		this.stationName = stationName;
		this.sections = sections;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((sections == null) ? 0 : sections.hashCode());
		result = prime * result + ((stationName == null) ? 0 : stationName.hashCode());
		result = prime * result + ((trainename == null) ? 0 : trainename.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StationDto other = (StationDto) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id != other.id)
			return false;
		if (sections == null) {
			if (other.sections != null)
				return false;
		} else if (!sections.equals(other.sections))
			return false;
		if (stationName == null) {
			if (other.stationName != null)
				return false;
		} else if (!stationName.equals(other.stationName))
			return false;
		if (trainename == null) {
			if (other.trainename != null)
				return false;
		} else if (!trainename.equals(other.trainename))
			return false;
		return true;
	}
	
	
	
	
	

}
