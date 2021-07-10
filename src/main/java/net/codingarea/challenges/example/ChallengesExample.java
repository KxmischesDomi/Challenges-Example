package net.codingarea.challenges.example;

import net.anweisen.utilities.bukkit.core.BukkitModule;
import net.codingarea.challenges.plugin.management.challenges.ModuleChallengeLoader;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * {@link BukkitModule} is used as replacement for {@link JavaPlugin} and is needed for the api to work properly.
 */
public class ChallengesExample extends BukkitModule {

	/**
	 * Executed in {@link JavaPlugin#onLoad()}
	 */
	@Override
	protected void handleLoad() {

		/**
		 * Initialize your own instance of {@link ModuleChallengeLoader} with your {@link BukkitModule} instance.
		 */
		ChallengesExampleLoader challengesLoader = new ChallengesExampleLoader(this);

		// Execute your load method in which you register your challenges
		challengesLoader.load();

	}

	/**
	 * Executed in {@link JavaPlugin#onEnable()}
	 */
	@Override
	protected void handleEnable() {

	}

	/**
	 * Executed in {@link JavaPlugin#onDisable()}
	 */
	@Override
	protected void handleDisable() {

	}

}
