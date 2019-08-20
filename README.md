# StaffParticles
Staff Particles V3 - 1.13/1.14

[SpigotMC Resource](https://www.spigotmc.org/resources/staff-particles.69839/)<br>
![GitHub repo size](https://img.shields.io/github/repo-size/Puyodead1-Development/StaffParticles.svg?style=plastic)
[![Discord Server](https://discordapp.com/api/guilds/589200717277954093/embed.png)](https://discord.gg/tMzrSxQ)
![GitHub issues](https://img.shields.io/github/issues/Puyodead1-Development/StaffParticles.svg?style=plastic)
![GitHub closed issues](https://img.shields.io/github/issues-closed-raw/Puyodead1-Development/StaffParticles.svg?style=plastic)
![GitHub](https://img.shields.io/github/license/Puyodead1-Development/StaffParticles.svg?style=plastic)
![GitHub last commit](https://img.shields.io/github/last-commit/Puyodead1-Development/StaffParticles.svg?style=plastic)
[![Build Status](http://ci.puyodead1-development.me/buildStatus/icon?style=plastic&job=StaffParticles)](http://ci.puyodead1-development.me/job/StaffParticles/)

Updated version of https://www.spigotmc.org/resources/staff-particles.34439/

## Commands:
/staffparticles - Opens the Main Menu
/staffparticles help - shows help menu
/staffparticles effectoff - Disables all active effects
Permissions:
staffgui.effects- allows for /staffparticles
staffgui.effectoff - allows for /staffparticles effectoff
staffgui.help - allows for /staffparticles help
Configuration File:

## Config:
<details>
<summary>Click to expand</summary>
#Made by Puyodead1
#Please do not ask for support with misconfiguration issues

messages:
  no permission: "&c&l(!) You don't have permission for that!"
  all active particles disabled: "&a&l(!) All active particles have been disabled!"
  particle disabled: "&a&l(!) {ACTIVE_PARTICLE} disabled!"
  particle enabled: "&a&l(!) Particle enabled!"
  no active particles: "&c&l(!) You don't have any active particles."
  particle size not editable: "&c&l(!) Particle size is not editable!"
 
settings:
  players can change particle size: false # sets wheither players can change the the particle size, if false, particle size is set to global max particle size setting below
  global max particle size: 250 #this is the highest any player can set a particle size

inventories:
  main menu:
    title: "&2&lStaff Particles"
    size: 9 #must be a multiple of 9
    items:
      hint:
        shown: true #should the item be shown?
        display name: "&7&lHint"
        lore:
          - "&7Edit the particle size"
          - "&7to 0 to create a 'tail' effect!"
        slot: 0
        material: BOOK
      effects:
        display name: "&6&lEffects"
        lore:
          - "&a&lClick to equip effects"
        slot: 2
        material: FIREWORK_STAR
      edit particle size:
        display name: "&e&lEdit particle size"
        lore:
          - "&eClick to edit particle size"
        slot: 4
        material: PAPER
      disable all effects:
        display name: "&c&lDisable Active Particle"
        active particles lore:
          - "&c&lClick to disable {ACTIVE_PARTICLE} particle."
        no active particles lore:
          - "&c&lYou don't have any active particles."
        slot: 6
        material: BARRIER
  effects menu:
    title: "&4&l&nEffects"
    size: 9 #must be a multiple of 9
    items:
      flame:
        display name: "&6&lFlame"
        lore:
          - "&6Click to activate flame particle."
        slot: 0
        material: BLAZE_POWDER
      enchantment:
        display name: "&7&lEnchantment"
        lore:
          - "&7Click to activate enchantment particle."
        slot: 1
        material: ENCHANTING_TABLE
      portal:
        display name: "&5&lPortal"
        lore:
          - "&5Click to activate portal particle."
        slot: 2
        material: END_PORTAL_FRAME
      heart:
        display name: "&c&lHeart"
        lore:
          - "&cClick to activate heart particle."
        slot: 3
        material: APPLE
      dragon breath:
        display name: "&d&lDragon Breath"
        lore:
          - "&dClick to activate dragon breath particle."
        slot: 4
        material: DRAGON_EGG
      smoke:
        display name: "&7&lSmoke"
        lore:
          - "&7Click to activate smoke particle."
        slot: 5
        material: FURNACE
      explosion:
        display name: "&7&lExplosion"
        lore:
          - "&7Click to activate explosion particle."
        slot: 6
        material: TNT
      water:
        display name: "&9&lWater"
        lore:
          - "&9Click to activate water particle."
        slot: 7
        material: WATER_BUCKET
      back:
        display name: "&4&lBack"
        lore: []
        slot: 8
        material: BARRIER
  particle size:
    title: "&6&lEdit Particle Size"
    size: 9 # must be a multiple of 9
    items:
      current size:
        display name: "&eCurrent Size:"
        lore:
          - "&e&l{CURRENT_PARTICLE_SIZE}/{MAX_PARTICLE_SIZE}"
        slot: 4
        material: NETHER_STAR
      increase size:
        display name: "&aIncrease Size"
        lore:
          - "&a&l+50"
        slot: 3
        material: EMERALD_BLOCK
      decrease size:
        display name: "&cDecrease Size"
        lore:
          - "&c&l-50"
        slot: 5
        material: REDSTONE_BLOCK
</details>

## Images:
  - Main Menu
    - ![img1](https://i.imgur.com/F2JLs62B.png)
    - ![img2](https://i.imgur.com/FWfrBFw8.gif)
 
  - Effects Menu
    - ![img3](https://i.imgur.com/FbYaQRux.png)
    - ![img4](https://i.imgur.com/FIBnleJK.gif)
    
  - Particle Size Editor Menu
    - ![img5](https://i.imgur.com/FoMrdC9t.png)
    - [Particle Size Editor Demo Gif](https://media.giphy.com/media/VJIFAsO8EGysVAc5Q0/source.gif)
  
  - Messages
    - ![img6](https://i.imgur.com/Ft1J34FI.png)
    - ![img7](https://i.imgur.com/FmPmbppb.png)
    - ![img8](https://i.imgur.com/FyWwJdhs.png)
    - ![img9](https://i.imgur.com/FSshbup2.png)
    - ![img10](https://i.imgur.com/FFhUoazF.png)

I will update as needed, if problems are found please report them on github or in Discord
