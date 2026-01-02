# Duel-Destiny

A thrilling text-based RPG game built in Java where heroes battle against evil spirits in epic duels.

## Description

Duel-Destiny is a turn-based combat game where you choose a hero from three classes: Mage, Archer, or Warrior. Engage in battles against powerful villains like the Dark Overlord, Regional Warlord, and Corrupted Mortal. Use standard attacks and special moves to defeat your enemies and save the world of Aetherfall!

## Features

- Choose from 3 unique hero classes: Mage, Archer, Warrior
- Battle against 3 different villains
- Standard and special attack mechanics
- Random enemy invasions for added challenge
- Real-time health and power tracking
- Custom hero naming

## Installation

1. Ensure you have Java installed on your system (JDK 8 or higher recommended).
2. Clone or download the project files.
3. Navigate to the project directory.

## How to Run

Compile the Java files:

```
javac -d . src/**/*.java
```

Run the game:

```
java gameengine.GameStats
```

## Gameplay

1. Choose your hero: Mage, Archer, or Warrior.
2. Enter a custom name for your hero.
3. Select a villain to battle.
4. During battle, type commands:
   - `> attack` for standard attack
   - `> special` for special move (Archer has two options: QuickShot or MultiShot)
5. Monitor health and power levels.
6. Defeat the villain to win!

## Project Structure

- `src/character/Character.java` - Base character class
- `src/heroes/` - Hero classes (Mage, Archer, Warrior)
- `src/evilspirits/` - Villain classes
- `src/gameengine/GameStats.java` - Main game logic
- `src/randomizer/RandomEnemy.java` - Random event handler

## Contributing

Feel free to contribute by adding new heroes, villains, or features!

## License

This project is open source. Use it as you wish.
