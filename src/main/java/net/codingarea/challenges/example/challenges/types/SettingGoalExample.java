package net.codingarea.challenges.example.challenges.types;

import net.codingarea.challenges.plugin.ChallengeAPI;
import net.codingarea.challenges.plugin.challenges.type.abstraction.SettingGoal;
import net.codingarea.challenges.plugin.management.menu.MenuType;
import net.codingarea.challenges.plugin.management.server.ChallengeEndCause;
import net.codingarea.challenges.plugin.utils.item.ItemBuilder;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * An example of the goal type {@link SettingGoal} which contains an integer value.
 * No constructor is needed because the default MenuType is {@link MenuType#GOAL}
 */
public class SettingGoalExample extends SettingGoal {

	@Override
	public ItemBuilder createDisplayItem() {
		return null;
	}

	/**
	 * @param list empty list which should be filled with the players who won
	 */
	@Override
	public void getWinnersOnEnd(List<Player> list) {

	}

	private void endChallenge() {
		// Stops the timer and ends the challenge with certain end cause.
		// Executes getWinnersOnEnd if end cause is GOAL_REACHED.
		ChallengeAPI.endChallenge(ChallengeEndCause.GOAL_REACHED);
	}

}