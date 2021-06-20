package net.codingarea.challenges.example.challenges.others;

import net.anweisen.utilities.common.config.Document;
import net.codingarea.challenges.plugin.challenges.type.abstraction.Setting;
import net.codingarea.challenges.plugin.management.menu.MenuType;
import net.codingarea.challenges.plugin.spigot.events.PlayerJumpEvent;
import net.codingarea.challenges.plugin.utils.item.ItemBuilder;
import org.bukkit.event.EventHandler;

/**
 * @author KxmischesDomi | https://github.com/kxmischesdomi
 * @since 1.0
 */
public class GameStateExample extends Setting {

	private int jumps = 0;

	public GameStateExample(MenuType menu) {
		super(menu);
	}

	@Override
	public ItemBuilder createDisplayItem() {
		return null;
	}

	/**
	 * Executes when the gamestate is being loaded.
	 */
	@Override
	public void loadGameState(Document document) {
		jumps = document.getInt("jumps");
	}

	/**
	 * Executes when the gamestate is being saved.
	 * Here you can save any changes to the gamestate.
	 */
	@Override
	public void writeGameState(Document document) {
		document.set("jumps", jumps);
	}

	/**
	 * Executes and counts up jumps everytime a player jumps.
	 * This event is an own event from the challenges plugin.
	 */
	@EventHandler
	public void onJump(PlayerJumpEvent event) {
		if (!shouldExecuteEffect()) return;
		if (ignorePlayer(event.getPlayer())) return;
		jumps++;
	}

	/**
	 * You can access the gamestate anytime you want
	 */
	private void clearJumps() {
		jumps = 0;
		getGameStateData().set("jumps", 0);
	}

}