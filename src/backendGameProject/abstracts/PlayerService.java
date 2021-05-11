package backendGameProject.abstracts;

import backendGameProject.entities.Game;
import backendGameProject.entities.Player;

public interface PlayerService {

	void add(Player player);

	void delete(Player player);

	void update(Player player);
	
	void buyGame(Player player, Game game);
	
	void remandGame(Player player, Game game);

}
