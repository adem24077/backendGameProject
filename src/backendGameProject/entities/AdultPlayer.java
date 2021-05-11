package backendGameProject.entities;

public class AdultPlayer extends Player {
	
	private String profession;
	private String companyName;
	
	public AdultPlayer() {
		
	}

	public AdultPlayer(String profession, String companyName) {
		super();
		this.profession = profession;
		this.companyName = companyName;
		
		
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

}
