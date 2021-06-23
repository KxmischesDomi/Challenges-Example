package net.codingarea.challenges.example.examples.others;

import net.codingarea.challenges.plugin.challenges.type.abstraction.Setting;
import net.codingarea.challenges.plugin.management.menu.MenuType;
import net.codingarea.challenges.plugin.utils.item.ItemBuilder;
import org.bukkit.Material;

/**
 * @author KxmischesDomi | https://github.com/kxmischesdomi
 * @since 1.0
 */
public class CustomSettingsItemExample extends Setting {

	public CustomSettingsItemExample(MenuType menu) {
		super(menu);
	}

	@Override
	public ItemBuilder createDisplayItem() {
		return null;
	}

	@Override
	public ItemBuilder createSettingsItem() {
		return new ItemBuilder(Material.PAPER, "§6This is an example settings item");
	}

	@Override
	protected String[] getSettingsDescription() {
		return new String[] { "This is an", "example description lore" };
	}

}