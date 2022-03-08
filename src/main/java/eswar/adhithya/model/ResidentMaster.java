package eswar.adhithya.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ResidentMaster")
public class ResidentMaster implements Serializable{
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.AUTO)
	 */
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Residentid")
	public int residentid;
	
	@Column(name="ResidentName")
	public String residentName;
	
	@Column(name="ResidentEmail")
	public String residentEmail;
	
	@Column(name="ResidentPhoneNumber")
	public String residentPhone;
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="resId", referencedColumnName="Residentid") public
	 * List<Address> address;
	 * 
	 * public List<Address> getAddress() { return address; } public void
	 * setAddress(List<Address> address) { this.address = address; }
	 */
	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	public int getResidentid() {
		return residentid;
	}
	public void setResidentid(int residentID) {
		this.residentid = residentID;
	}
	public String getResidentName() {
		return residentName;
	}
	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}
	public String getResidentEmail() {
		return residentEmail;
	}
	public void setResidentEmail(String residentEmail) {
		this.residentEmail = residentEmail;
	}
	public String getResidentPhone() {
		return residentPhone;
	}
	public void setResidentPhone(String residentPhone) {
		this.residentPhone = residentPhone;
	}
	
	
	public ResidentMaster(int residentID, String residentName, String residentEmail, String residentPhone) {
		super();
		this.residentid = residentID;
		this.residentName = residentName;
		this.residentEmail = residentEmail;
		this.residentPhone = residentPhone;
	}
	
	public ResidentMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResidentMaster [residentID=" + residentid + ", residentName=" + residentName + ", residentEmail="
				+ residentEmail + ", residentPhone=" + residentPhone + "]";
	}

	/*
	 * public Address addAddress(Address addr) { getAddress().add(addr);
	 * addr.setResidentMaster(this);
	 * 
	 * return addr; }
	 * 
	 * public Address removeAddress(Address addr) { getAddress().remove(addr);
	 * addr.setResidentMaster(null); return addr; }
	 */
	
}
