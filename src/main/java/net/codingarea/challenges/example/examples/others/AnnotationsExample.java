package net.codingarea.challenges.example.examples.others;

import net.anweisen.utilities.common.annotations.Since;
import net.codingarea.challenges.plugin.challenges.implementation.challenge.RandomChallengeChallenge;
import net.codingarea.challenges.plugin.challenges.type.abstraction.Setting;
import net.codingarea.challenges.plugin.management.challenges.annotations.CanInstaKillOnEnable;
import net.codingarea.challenges.plugin.management.challenges.annotations.ExcludeFromRandomChallenges;
import net.codingarea.challenges.plugin.management.menu.MenuType;
import net.codingarea.challenges.plugin.management.scheduler.policy.ChallengeStatusPolicy;
import net.codingarea.challenges.plugin.management.scheduler.policy.ExtraWorldPolicy;
import net.codingarea.challenges.plugin.management.scheduler.policy.FreshnessPolicy;
import net.codingarea.challenges.plugin.management.scheduler.policy.PlayerCountPolicy;
import net.codingarea.challenges.plugin.management.scheduler.task.ScheduledTask;
import net.codingarea.challenges.plugin.management.scheduler.task.TimerTask;
import net.codingarea.challenges.plugin.management.scheduler.timer.TimerStatus;
import net.codingarea.challenges.plugin.utils.item.ItemBuilder;

/**
 * Example to show annotations which can be used to improve your challenges
 *
 * {@link Since} indicates when the challenge was added to the plugin. Used to display the "new" suffix behind the display item's name when its new
 * {@link CanInstaKillOnEnable} should be used when your challenge can instantly kill players when its enabled
 * {@link ExcludeFromRandomChallenges} excludes this challenge from {@link RandomChallengeChallenge}
 *
 * The following method examples are showing two other annotations which are used to detect timer status updates and timer updates.
 */
@Since("1.0")
@CanInstaKillOnEnable
@ExcludeFromRandomChallenges
public class AnnotationsExample extends Setting {

	public AnnotationsExample(MenuType menu) {
		super(menu);
	}

	@Override
	public ItemBuilder createDisplayItem() {
		return null;
	}



	/**
	 * Executes asynchronous when timer is started
	 */
	@TimerTask(status = TimerStatus.RUNNING)
	public void onTimerStartAsync() {

	}

	/**
	 * Executes synchronous when timer is paused
	 */
	@TimerTask(status = TimerStatus.PAUSED, async = false)
	public void onTimerPause() {

	}

	/**
	 * Others parameters will be showed in this example
	 */
	@TimerTask(
			status = TimerStatus.RUNNING, // When timer is started
			async = false, // Not asynchronous
			challengePolicy = ChallengeStatusPolicy.DISABLED, // Only executes when challenge is not enabled
			playerPolicy = PlayerCountPolicy.SOMEONE, // Only executes when a player is online
			worldPolicy = ExtraWorldPolicy.NOT_USED, // Only executes when the flat world isn't in use
			freshnessPolicy = FreshnessPolicy.FRESH // Only executes when the timer wasn't started before
	)
	public void onTimer() {

	}



	/**
	 * Executes every 20 ticks asynchronous (1 second)
	 */
	@ScheduledTask(ticks = 20)
	public void onSecondAsync() {

	}

	/**
	 * Executes every 20 ticks synchronous (1 second)
	 */
	@ScheduledTask(ticks = 20, async = false)
	public void onSecond() {

	}

	/**
	 * Others parameters will be showed in this example
	 */
	@ScheduledTask(
			ticks = 1, // Every tick
			async = false, // Not asynchronous
			challengePolicy = ChallengeStatusPolicy.DISABLED, // Only executes when challenge is not enabled
			playerPolicy = PlayerCountPolicy.SOMEONE, // Only executes when a player is online
			worldPolicy = ExtraWorldPolicy.NOT_USED, // Only executes when the flat world isn't in use
			freshnessPolicy = FreshnessPolicy.FRESH // Only executes when the timer wasn't started before
	)
	public void onTick() {

	}

}
