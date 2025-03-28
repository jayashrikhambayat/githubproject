package in.city.pune.model;

public class Customer {

	private String cid;
	private String vname;
	private String cemail;
	private String ccpass;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCcpass() {
		return ccpass;
	}
	public void setCcpass(String ccpass) {
		this.ccpass = ccpass;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", vname=" + vname + ", cemail=" + cemail + ", ccpass=" + ccpass + "]";
	}
	public Customer(String cid, String vname, String cemail, String ccpass) {
		super();
		this.cid = cid;
		this.vname = vname;
		this.cemail = cemail;
		this.ccpass = ccpass;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
