package backendGameProject.concretes;

import backendGameProject.abstracts.PlayerService;
import backendGameProject.entities.Game;
import backendGameProject.entities.Player;

public class PlayerManager implements PlayerService {

	private Game game;
	
	
	
	@Override
	public void add(Player player) {
		System.out.println("Oyuncu başarıyla kayıt oldu. " + player.getFirstName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi. " + player.getFirstName());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncunun bilgileri güncellendi. " + player.getFirstName());
		
	}

	@Override
	public void buyGame(Player player,Game game) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " " + game.getName() + "oyununu satın aldınız");
		
	}

	@Override
	public void remandGame(Player player, Game game) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " " + game.getName() + "oyununu iade ettiniz.");
		
	}

}
