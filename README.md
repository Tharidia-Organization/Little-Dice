# Tharidia Things - Dice Module

This is a standalone module extracted from the main Tharidia Things mod, containing only the Dice feature.

## Features

- **Throwable Dice Item**: Right-click to throw a dice that bounces with realistic physics
- **Random Face Landing**: The dice settles on a random face (1-6) after bouncing
- **Physics Simulation**: Includes gravity, bounce damping, ground friction, and air resistance
- **Interactive**: Pick up settled dice by right-clicking them
- **Auto-despawn**: Dice automatically converts back to item after 30 seconds

## Building

```bash
./gradlew build
```

The compiled JAR will be in `build/libs/`

## Installation

1. Install NeoForge 21.1+ for Minecraft 1.21.1
2. Place the JAR file in your `mods` folder
3. Launch the game

## Usage

1. Obtain the dice item from the creative tab or via `/give @s tharidiathings:dice`
2. Right-click to throw the dice
3. Wait for it to settle and show a random face
4. Right-click the settled dice to pick it up

## Technical Details

- **Entity Type**: Custom physics-enabled entity with bounce mechanics
- **Renderer**: Uses item model rendering with face-specific rotations
- **Stack Size**: 16 dice per stack
- **Lifetime**: 30 seconds after settling

## Credits

Part of the Tharidia Things mod by THproject
