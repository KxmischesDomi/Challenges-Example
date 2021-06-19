package net.codingarea.challenges.example.challenges;

import net.anweisen.utilities.common.logging.internal.factory.ConstantLoggerFactory;
import net.codingarea.challenges.plugin.challenges.type.abstraction.Modifier;
import net.codingarea.challenges.plugin.challenges.type.abstraction.Setting;
import net.codingarea.challenges.plugin.challenges.type.abstraction.SettingModifier;
import net.codingarea.challenges.plugin.management.menu.MenuType;
import net.codingarea.challenges.plugin.utils.item.ItemBuilder;
import org.bukkit.Material;

/**
 * @author KxmischesDomi | https://github.com/kxmischesdomi
 *
 * An example of the setting type {@link SettingModifier} which contains a boolean and an integer value.
 */
public class ExampleSettingModifier extends SettingModifier {

	/**
	 * Example constructor with maximum value.
	 */
	public ExampleSettingModifier(int max) {
		super(
				MenuType.SETTINGS, // The menu were your setting will be shown in
				max // Maximum value of challenge
		);
	}

	/**
	 * Example constructor with minimum and maximum value.
	 */
	public ExampleSettingModifier(int min, int max) {
		super(
				MenuType.SETTINGS, // The menu were your setting will be shown in
				max, // Maximum value of setting
				min // Minimum value of the setting
		);
	}

	/**
	 * Example constructor with minimum, maximum and default value.
	 */
	public ExampleSettingModifier(int min, int max, int defaultValue) {
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
	 * Executed when setting is enabled
	 */
	@Override
	protected void onEnable() {

	}

	/**
	 * Executed when setting is disabled
	 */
	@Override
	protected void onDisable() {

	}

	/**
	 * Executed when value is changed
	 */
	@Override
	protected void onValueChange() {

	}

}