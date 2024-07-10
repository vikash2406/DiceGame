# Magical Arena Battle

This project simulates a battle between two players with different attributes in a magical arena. The players' attributes such as health, strength, and attack power determine the outcome of the battle. A simple dice roll mechanism is used to introduce randomness into the game.

## Project Structure

The project is organized into the following packages:

- entity: Contains the `Player` entity class.
- interfaces: Contains interfaces.
- Service: Contains service classes for the battle logic

### Entities

- `Player.java`: Represents a player with health, strength, and attack attributes.

### Interfaces

- `Dice.java`: Interface for rolling a dice.
- `Fighter.java`: Interface representing a fighter with methods for attack, defense, taking damage, and checking if alive.
- `GameRules.java`: Interface for game rules to calculate damage.
- `Battle.java`: Interface for managing the battle.

### Service Classes

- `SixSidedDice.java`: Implements the `Dice` interface with a six-sided dice.
- `PlayerFighter.java`: Implements the `Fighter` interface for a player.
- `SimpleGameRules.java`: Implements the `GameRules` interface to calculate damage.
- `SimpleBattle.java`: Implements the `Battle` interface to manage the battle.

*** Game.java :- Main class of this project where execution start.
Run the main method to start the execution.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### User Input 
When you run the game, you will be prompted to enter the attributes for both players:
-Health
-Strength
-Attack
