# Challenges-Example
 Examples on how to add challenges to the [Challenges Plugin](https://www.spigotmc.org/resources/80548/)


## Libraries

In these examples, the **Spigot API** is added via maven, and the **Challenges API** is added with a .jar build of the plugin.

## Setup

To set up your plugin, you should have a look at the [plugin class](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/ChallengesExample.java)
and the [challenges loader](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/ChallengesExampleLoader.java).

Everything should be documented with comments.

## Examples

#### Challenges
[Setting](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/types/SettingExample.java) - On / Off

[Modifier](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/types/ModifierExample.java) - Different Value

[SettingModifier](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/types/SettingModifierExample.java) - On / Off / Different Value

[TimedChallenge](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/types/TimedChallengeExample.java) - On / Off / Different Value - Timed method execution

#### Goals
[SettingGoal](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/types/SettingGoalExample.java) - On / Off

[SettingModifierGoal](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/types/SettingModifierGoalExample.java) - On / Off / Different Value

#### Other examples
[Saving data](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/others/GameStateExample.java) - Save data through server restarts

[Custom setting item](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/others/CustomSettingsItemExample.java) - Custom status item under display item 

[Command](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/others/CommandExample.java) - Integrated command in challenge

[Utility methods](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/others/MethodsExample.java) - Some useful and must use methods

[Annotations](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/others/AnnotationsExample.java) - Annotations for the challenge class and builtin timer and event api

[Randoms](https://github.com/KxmischesDomi/Challenges-Example/blob/master/src/main/java/net/codingarea/challenges/example/examples/others/RandomExample.java) - Own random instance
