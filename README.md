# Tharidia - Little Dice

> **⚠️ ALPHA VERSION - Under Active Development**  
> This mod is in early alpha stage and may contain bugs or incomplete features. Use at your own risk.

## About This Mod

**Little Dice** is a standalone module extracted from the **Tharidia Things** mod collection, part of the larger **Tharidia Project**.

### What is Tharidia?

Tharidia is an active and complex medieval fantasy roleplay Minecraft server featuring deeply customized mechanics that significantly diverge from vanilla Minecraft gameplay. The server implements intricate systems designed specifically for immersive roleplay experiences in a medieval setting with fantasy elements.

This mod is one of several modular components derived from the main Tharidia ecosystem, designed to work both independently and as part of the complete Tharidia experience.

---

## Features

This mod adds interactive throwable dice with realistic physics simulation to Minecraft:

- **🎲 Throwable Dice Item** - Right-click to throw a dice into the world with realistic trajectory
- **🎯 Random Face Landing** - Dice settles on a random face (1-6) after bouncing, simulating real dice behavior
- **⚙️ Realistic Physics Simulation** - Includes gravity, bounce damping, ground friction, and air resistance for authentic movement
- **🤝 Interactive Pickup System** - Right-click settled dice to pick them back up
- **⏱️ Auto-Despawn** - Dice automatically converts back to an item after 30 seconds to prevent world clutter
- **📦 Stackable** - Dice items stack up to 16 per slot

---

## Installation

### Requirements
- **Minecraft**: 1.21.1
- **Mod Loader**: NeoForge 21.1.215 or higher

### Steps
1. Install NeoForge for Minecraft 1.21.1
2. Download the latest release of Little Dice
3. Place the JAR file in your `mods` folder
4. Launch the game

---

## Usage

### Obtaining Dice
- Find the dice in the **Tharidia** creative tab
- Use the command: `/give @s tharidia_littledice:dice`

### Playing with Dice
1. Hold the dice item in your hand
2. Right-click to throw the dice
3. Watch it bounce and settle on a random face (1-6)
4. Right-click the settled dice to pick it up and throw again

---

## Technical Information

### For Developers
- **Mod ID**: `tharidia_littledice`
- **Item ID**: `tharidia_littledice:dice`
- **Entity Type**: Custom physics-enabled entity with bounce mechanics
- **Renderer**: Item model rendering with face-specific rotations
- **Physics**: Custom gravity, velocity, and friction calculations
- **Despawn Timer**: 600 ticks (30 seconds)

### Building from Source
```bash
./gradlew build
```
The compiled JAR will be located in `build/libs/`

---

## Part of the Tharidia Ecosystem

This mod is a modular component of the Tharidia Project. While it functions independently, it was originally designed for the Tharidia medieval fantasy roleplay server and integrates seamlessly with other Tharidia mods.

### Other Tharidia Mods
- **Tharidia Things** (Main Mod) - The parent mod containing additional features
- **Tharidia Tweaks** - Core gameplay modifications
- **Tharidia Features** - World and server features

---

## Credits

**Developed by**: Frenk02, THproject Team  
**Project**: Tharidia  
**License**: GNU

---

## Support & Links

For issues, suggestions, or questions about this mod or the Tharidia Project, please contact the THproject Team.

---

*This mod is in alpha development. Features and functionality may change in future updates.*
