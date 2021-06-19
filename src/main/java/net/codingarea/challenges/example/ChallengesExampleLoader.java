package net.codingarea.challenges.example;

import net.anweisen.utilities.bukkit.core.BukkitModule;
import net.codingarea.challenges.example.challenges.ExampleModifier;
import net.codingarea.challenges.example.challenges.ExampleCommandSetting;
import net.codingarea.challenges.example.challenges.ExampleSettingModifier;
import net.codingarea.challenges.plugin.management.challenges.ModuleChallengeLoader;
import org.bukkit.Material;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

/**
 * Your own instance of {@link ModuleChallengeLoader} to register your own challenges
 */
public class ChallengesExampleLoader extends ModuleChallengeLoader {

	/**
	 * @param plugin the plugin which is used to register commands and listeners
	 */
	public ChallengesExampleLoader(BukkitModule plugin) {
		super(plugin);
	}

	public void load() {

		// Register the challenge with the class
		register(ExampleCommandSetting.class);
		register(ExampleModifier.class);

		// Put parameters after the challenge class to use a certain constructor
		register(ExampleSettingModifier.class, 10, 10, 10);

		// Register a setting with a command of your plugin.
		registerWithCommand(ExampleCommandSetting.class, "example");

		// Register an own damage rule in the Damage Menu Type
		registerDamageRule(
				"§cCustom", // Item display name
				Material.PAPER, // Display material
				DamageCause.CUSTOM, DamageCause.VOID // Blocked damage causes
		);


		registerMaterialRule(
				"§cBarrier", // Item display name
				"Barrier", // Lore replacement
				Material.BARRIER // Blocked and display material
		);

	}

}