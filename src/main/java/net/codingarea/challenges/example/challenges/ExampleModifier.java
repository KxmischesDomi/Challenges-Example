package net.codingarea.challenges.example.challenges;

import net.codingarea.challenges.plugin.challenges.type.abstraction.Modifier;
import net.codingarea.challenges.plugin.challenges.type.abstraction.Setting;
import net.codingarea.challenges.plugin.management.menu.MenuType;
import net.codingarea.challenges.plugin.utils.item.ItemBuilder;
import org.bukkit.Material;

/**
 * @author KxmischesDomi | https://github.com/kxmischesdomi
 *
 * An example of the setting type {@link Modifier} which contains an integer value.
 */
public class ExampleModifier extends Modifier {

	/**
	 * Example constructor with maximum value.
	 */
	public ExampleModifier(int max) {
		super(
				/* The menu were your setting will be shown in. */ MenuType.SETTINGS,
				/* max value of challenge */ max
		);
	}

	/**
	 * Example constructor with minimum and maximum value.
	 */
	public ExampleModifier(int min, int max) {
		super(
				/* The menu were your setting will be shown in. */ MenuType.SETTINGS,
				/* maximum value of setting */ max,
				/* minimum value of the setting */ min
		);
	}

	/**
	 * Example constructor with minimum, maximum and default value.
	 */
	public ExampleModifier(int min, int max, int defaultValue) {
		super(
				/* The menu were your setting will be shown in. */ MenuType.SETTINGS,
				/* Maximum value of setting */ max,
				/* Minimum value of the setting */ min,
				/* The value the setting will have by default */ defaultValue
		);
	}


	@Override
	public ItemBuilder createDisplayItem() {
		return new ItemBuilder(Material.PAPER, "§6Example Challenge").setLore("This is an example challenge");
	}

	/**
	 * Executed when value is changed
	 */
	@Override
	protected void onValueChange() {

	}

}