package eswar.adhithya.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address implements Serializable {

	private static long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	
	@Column
	private String flatNumber;
	@Column
	private String floorNumber;
	@Column
	private String buildingName;
	@Column
	private String city;
	
	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="resId") private ResidentMaster residentMaster;
	 

	public ResidentMaster getResidentMaster() {
		return residentMaster;
	}
	public void setResidentMaster(ResidentMaster residentMaster) {
		this.residentMaster = residentMaster;
	}*/
	/*
	@Column
	private String resId;
	
	
	public String getResId() {
		return resId;
	}
	public void setResId(String resId) {
		this.resId = resId;
	}
	
	 * @OneToOne(mappedBy="Address") private ResidentMaster residentMaster;
	 * 
	 * 
	 * public ResidentMaster getResidentMaster() { return residentMaster; } public
	 * void setResidentMaster(ResidentMaster residentMaster) { this.residentMaster =
	 * residentMaster; }
	 */
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", flatNumber=" + flatNumber + ", floorNumber=" + floorNumber
				+ ", buildingName=" + buildingName + ", city=" + city + "]";
	}
	
	
	
	
}
	
	