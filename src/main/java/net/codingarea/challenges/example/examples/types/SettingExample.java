package net.codingarea.challenges.example.examples.types;

import net.codingarea.challenges.plugin.challenges.type.abstraction.Setting;
import net.codingarea.challenges.plugin.management.menu.MenuType;
import net.codingarea.challenges.plugin.utils.item.ItemBuilder;
import org.bukkit.Material;

/**
 * An example of the setting type {@link Setting} which contains a boolean value.
 */
public class SettingExample extends Setting {

	public SettingExample() {
		super(
				MenuType.SETTINGS, // The menu were your challenge will be shown in.
				false // If the challenge should be activated by default
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

}