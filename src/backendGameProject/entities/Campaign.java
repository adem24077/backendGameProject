package backendGameProject.entities;

public class Campaign {
	
	private int id;
	private String campaignName;
	private int discount;
	private int campaignTime;
	
	public Campaign() {}

	public Campaign(int id, String campaignName, int discount, int campaignTime) {
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
		this.campaignTime = campaignTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getCampaignTime() {
		return campaignTime;
	}

	public void setCampaignTime(int campaignTime) {
		this.campaignTime = campaignTime;
	}
	
	
	
}
