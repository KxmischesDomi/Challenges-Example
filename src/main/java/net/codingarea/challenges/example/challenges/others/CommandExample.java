package net.codingarea.challenges.example.challenges.others;

import net.codingarea.challenges.plugin.challenges.type.abstraction.Setting;
import net.codingarea.challenges.plugin.management.menu.MenuType;
import net.codingarea.challenges.plugin.utils.bukkit.command.PlayerCommand;
import net.codingarea.challenges.plugin.utils.item.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * An example of the setting type {@link Setting} with an implemented command
 *
 * {@link PlayerCommand} is an instance of {@link CommandExecutor} which only executes when the sender is a player.
 * {@link TabCompleter} is the default bukkit interface to add tab completion.
 */
public class CommandExample extends Setting implements PlayerCommand, TabCompleter {

	public CommandExample() {
		super(
				MenuType.SETTINGS, // The menu were your challenge will be shown in
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

	/**
	 * Executed when a player executes the command the setting is registered with.
	 */
	@Override
	public void onCommand(Player player, String[] strings) {

	}

	@Override
	public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
		return Arrays.asList("This", "Is", "An", "Example");
	}
}