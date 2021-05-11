package backendGameProject.concretes;

import backendGameProject.abstracts.SellerService;
import backendGameProject.entities.Campaign;
import backendGameProject.entities.Game;

public class SellerManager implements SellerService {

	@Override
	public void campaignAdd(Game game, Campaign campaign) {
		int discount;
		discount = game.getPrice()-(game.getPrice()*campaign.getDiscount())/100;
		System.out.println(campaign.getCampaignName() + " kampanyası uygulandı. " + "Ürünün yeni fiyatı " + discount);
	}

}
