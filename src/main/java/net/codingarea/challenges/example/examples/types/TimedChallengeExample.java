package net.codingarea.challenges.example.examples.types;

import net.anweisen.utilities.common.collection.IRandom;
import net.codingarea.challenges.example.examples.others.RandomExample;
import net.codingarea.challenges.plugin.challenges.type.abstraction.SettingModifier;
import net.codingarea.challenges.plugin.challenges.type.abstraction.TimedChallenge;
import net.codingarea.challenges.plugin.management.menu.MenuType;
import net.codingarea.challenges.plugin.utils.item.ItemBuilder;
import org.bukkit.Material;

/**
 * {@link TimedChallenge} is used for challenges that only do something at certain moments
 *
 * It inherits {@link SettingModifier}
 * For an example for that look at {@link SettingModifierExample
 */
public class TimedChallengeExample extends TimedChallenge {

	/**
	 * A random instance for this challenge.
	 * For further documentation, look at {@link RandomExample}
	 */
	private final IRandom random = IRandom.create();

	/**
	 * Example constructor with maximum value.
	 */
	public TimedChallengeExample(int max) {
		super(
				MenuType.SETTINGS, // The menu were your setting will be shown in
				max // Maximum value of challenge
		);
	}

	/**
	 * Example constructor with minimum and maximum value.
	 */
	public TimedChallengeExample(int min, int max) {
		super(
				MenuType.SETTINGS, // The menu were your setting will be shown in
				max, // Maximum value of setting
				min // Minimum value of the setting
		);
	}

	/**
	 * Example constructor with minimum, maximum and default value.
	 */
	public TimedChallengeExample(int min, int max, int defaultValue) {
		super(
				MenuType.SETTINGS, // The menu were your setting will be shown in
				max, // Maximum value of setting
				min, // Minimum value of the setting
				defaultValue // The value the setting will have by default
		);
	}

	@Override
	public ItemBuilder createDisplayItem() {
		return new ItemBuilder(Material.PAPER, "§6Example Challenge").setLore("This is an example challenge");
	}

	/**
	 * @return the time in seconds until the next execution of {@link TimedChallenge#onTimeActivation()}
	 */
	@Override
	protected int getSecondsUntilNextActivation() {
		// Return a time between the current value in minutes plus minus 10 seconds
		return random.around(
				getValue() * 60, // Middle value
				10 // Range
		);
	}

	/**
	 * Executes
	 */
	@Override
	protected void onTimeActivation() {
		// Restart timer with a specific amount of seconds
		restartTimer(10);

		// Restart timer with using the seconds of #getSecondsUntilNextActivation
		restartTimer();
	}

}
