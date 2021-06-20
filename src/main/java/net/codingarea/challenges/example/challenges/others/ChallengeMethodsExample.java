package net.codingarea.challenges.example.challenges.others;

import net.codingarea.challenges.plugin.ChallengeAPI;
import net.codingarea.challenges.plugin.challenges.type.abstraction.Setting;
import net.codingarea.challenges.plugin.management.menu.MenuType;
import net.codingarea.challenges.plugin.management.scheduler.timer.TimerStatus;
import net.codingarea.challenges.plugin.utils.item.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * An example for Utilities methods
 */
public class ChallengeMethodsExample extends Setting {

	public ChallengeMethodsExample(MenuType menu) {
		super(menu);
	}

	@Override
	public ItemBuilder createDisplayItem() {
		return null;
	}

	public void example(Player player) {
		// True if timer is started, challenge is enabled and flat world isn't in use
		if (!shouldExecuteEffect()) {
			return;
		}

		// True if player should be ignored by challenges
		if (ignorePlayer(player)) {
			return;
		}

		// Method to kill player properly
		kill(player);

		// Kill player with a delay in ticks
		kill(player, 10);

		// Get custom drops of certain material
		List<Material> customDrops = ChallengeAPI.getCustomDrops(Material.PAPER);

		// Get the current timer status
		TimerStatus timerStatus = ChallengeAPI.getTimerStatus();

		// Pause the timer
		ChallengeAPI.pauseTimer();

		// Reset the timer
		ChallengeAPI.resetTimer();

		// Start the timer
		ChallengeAPI.resumeTimer();
	}

}