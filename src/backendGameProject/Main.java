package backendGameProject;

import backendGameProject.concretes.CampaignManager;
import backendGameProject.concretes.PlayerManager;
import backendGameProject.concretes.SellerManager;
import backendGameProject.entities.AdultPlayer;
import backendGameProject.entities.Campaign;
import backendGameProject.entities.Game;
import backendGameProject.entities.Player;
import backendGameProject.entities.StudentPlayer;

public class Main {

	public static void main(String[] args) {
		
		Player nusret = new AdultPlayer("Teknisyen","Turkcell");
		nusret.setId(123);
		nusret.setFirstName("Nusret");
		nusret.setLastName("Eren");
		nusret.setNationalityId("11000000");
		nusret.setYearOfBirth(1985);
		nusret.setUserName("Strike");
		nusret.setPassword("asd123");
		nusret.setAccountNumber("1253435");
		
		
		Game callOfDuty2 = new Game(1,"callOfDuty2",100,"FPS");
		
		Campaign campaign = new Campaign(2, "Bahar indirimi", 20, 15);
		
		PlayerManager playerManager = new PlayerManager();
		playerManager.add(nusret);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SellerManager sellerManager = new SellerManager();
		sellerManager.campaignAdd(callOfDuty2, campaign);
		
		playerManager.buyGame(nusret,callOfDuty2);
		

	}

}
