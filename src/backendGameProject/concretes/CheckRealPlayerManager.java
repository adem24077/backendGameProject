package backendGameProject.concretes;

import backendGameProject.abstracts.CheckService;
import backendGameProject.entities.Player;

public class CheckRealPlayerManager implements CheckService {

	@Override
	public void check(Player player) {
		System.out.println("Doğrulama başarılı." + player.getFirstName());
		
	}

}
