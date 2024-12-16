package com.xworkz.UserId.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="employee_card")

@NamedQuery(name="findAll" ,query="select ve from EmployeeCard ve")
@NamedQuery(name="findAllByIdAndModelName" ,query="select ve from EmployeeCard ve where ve.id =:byId and ve.modelName =:bylModelName")
@NamedQuery(name="findNameAndManufacturerById" ,query="select ve.modelName, ve.manufacturer from EmployeeCard ve where ve.id =:byId")
@NamedQuery(name="findNameAndManufacturerAndMileageAndEngineCapacity" ,query="select ve.modelName, ve.manufacturer ,ve.mileage,ve.engineCapacity from EmployeeCard ve where ve.id >:byId")
@NamedQuery(name="CountSeatingCapacity" ,query="select count(*) as COUNT  from EmployeeCard ve where ve.seatingCapacity >:byCap")

@NamedQuery(name="findModelNameByIdAndManufacturer" ,query="select ve.modelName from EmployeeCard ve where ve.id =:byId and ve.manufacturer =:byManufacturer")
@NamedQuery(name="findMileageByIdAndModelName" ,query="select ve.mileage from EmployeeCard ve where ve.id =:byId and ve.modelName =:bylModelName")
@NamedQuery(name="findEngineCapacityByIdAndModelName" ,query="select ve.engineCapacity from EmployeeCard ve where ve.id =:byId and ve.modelName =:bylModelName")
@NamedQuery(name="findFuelTypeByIdAndModelName" ,query="select ve.fuelType from EmployeeCard ve where ve.id =:byId and ve.modelName =:bylModelName")
@NamedQuery(name="findDateIdAndModelName" ,query="select ve.manufactureDate from EmployeeCard ve where ve.id =:byId and ve.modelName =:bylModelName")
@NamedQuery(name="findSeatingIdAndModelName" ,query="select ve.seatingCapacity from EmployeeCard ve where ve.id =:byId and ve.modelName =:bylModelName")
@NamedQuery(name="findIsElectricByIdAndModelName" ,query="select ve.isElectric from EmployeeCard ve where ve.id =:byId and ve.modelName =:bylModelName")

@NamedQuery(name="CountByManufacturerAndate", query="select count(*),ve.manufacturer, ve.manufactureDate from EmployeeCard ve group by ve.manufacturer" )

@NamedQuery(name="UpdateByModelName", query="update EmployeeCard ve set ve.engineCapacity =:Ec where ve.modelName =:bylModelName")

@NamedQuery(name="UpdateByEngineNumberAndIsElectric", query="update EmployeeCard ve set ve.mileage =:newMileage where ve.engineNumber =:byEN and ve.isElectric =:byIsElectric")

@NamedQuery(name="deleteByNameAndManufacturer", query="delete from EmployeeCard ve where ve.modelName =:bylModelName and ve.manufacturer =:byManufacturer")
public class EmployeeCard {
	

	
    @Id
    private int id;
	@Column(name="lmodel_name")
	private String modelName;
	
	private String manufacturer;
	@Column(name="engine_number")
	private long engineNumber;
	private float mileage;
	@Column(name="engine_capacity")
	private double engineCapacity;
	@Column(name="is_electric")
	private boolean isElectric;
	@Column(name="fuel_type")
	private char fuelType;
	
	@Column(name="manufacture_date")
	private LocalDate manufactureDate;
	@Column(name="seating_capacity")
	private int seatingCapacity;
	/**
	 * 
	 */
	public EmployeeCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param modelName
	 * @param manufacturer
	 * @param engineNumber
	 * @param mileage
	 * @param engineCapacity
	 * @param isElectric
	 * @param fuelType
	 * @param manufactureDate
	 * @param seatingCapacity
	 */
	public EmployeeCard(int id, String modelName, String manufacturer, long engineNumber, float mileage,
			double engineCapacity, boolean isElectric, char fuelType, LocalDate manufactureDate, int seatingCapacity) {
		super();
		this.id = id;
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.engineNumber = engineNumber;
		this.mileage = mileage;
		this.engineCapacity = engineCapacity;
		this.isElectric = isElectric;
		this.fuelType = fuelType;
		this.manufactureDate = manufactureDate;
		this.seatingCapacity = seatingCapacity;
	}
	@Override
	public String toString() {
		return "EmployeeCard [id=" + id + ", modelName=" + modelName + ", manufacturer=" + manufacturer
				+ ", engineNumber=" + engineNumber + ", mileage=" + mileage + ", engineCapacity=" + engineCapacity
				+ ", isElectric=" + isElectric + ", fuelType=" + fuelType + ", manufactureDate=" + manufactureDate
				+ ", seatingCapacity=" + seatingCapacity + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public long getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(long engineNumber) {
		this.engineNumber = engineNumber;
	}
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public boolean isElectric() {
		return isElectric;
	}
	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
	public char getFuelType() {
		return fuelType;
	}
	public void setFuelType(char fuelType) {
		this.fuelType = fuelType;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	


}
