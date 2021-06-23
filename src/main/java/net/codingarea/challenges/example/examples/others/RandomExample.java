package net.codingarea.challenges.example.examples.others;

import net.anweisen.utilities.common.collection.IRandom;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

/**
 * To simplify and for better performance you should use our IRandom.
 * It contains many useful methods in addition to the default methods of the {@link java.util.Random}
 */
public class RandomExample {

	private final IRandom random = IRandom.create();

	/**
	 * Gets a random number between 2 numbers.
	 * In this example the number can be between 10 and 20.
	 */
	public void rangeExample() {
		random.range(10, 20);
	}

	/**
	 * Chooses a random value of an array collection
	 */
	public void chooseExample() {
		Material material = random.choose(Material.values());
	}

	/**
	 * Shuffles a list to a random order
	 */
	public void shuffleExample() {
		List<Material> materials = new ArrayList<>();
		random.shuffle(materials);
	}

}
