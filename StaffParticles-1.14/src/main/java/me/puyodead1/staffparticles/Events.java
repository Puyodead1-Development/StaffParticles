package me.puyodead1.staffparticles;

import org.bukkit.Particle;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Events implements Listener {

	private FileConfiguration spConfig = StaffParticles.getPlugin().getConfig();

	@EventHandler
	public void OnInventoryClick(InventoryClickEvent e) {
		String invTitle = e.getView().getTitle();
		Player player = (Player) e.getWhoClicked();
		e.setCancelled(true);

		/**
		 * Main menu click
		 */
		if (invTitle.equals(Utils.formatText(spConfig.getString("inventories.main menu.title")))) {
			if (e.getCurrentItem().getItemMeta().getDisplayName()
					.equals(Utils.formatText(spConfig.getString("inventories.main menu.items.effects.display name")))) {
				player.getOpenInventory().close();
				Inventories.TrailsMenu(player);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils
					.formatText(spConfig.getString("inventories.main menu.items.disable all effects.display name")))) {
				player.getOpenInventory().close();
				StaffParticles.activeParticles.remove(player.getUniqueId());
				if (StaffParticles.activeParticles.containsKey(player.getUniqueId())) {
					player.sendMessage(Utils.formatText(spConfig.getString("messages.particle disabled").replace(
							"{ACTIVE_PARTICLE}", StaffParticles.activeParticles.get(player.getUniqueId()).name())));
				} else {
					player.sendMessage(Utils.formatText(spConfig.getString("messages.all active particles disabled")));
				}
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils
					.formatText(spConfig.getString("inventories.main menu.items.edit particle size.display name")))) {
				if (StaffParticles.activeParticles.containsKey(player.getUniqueId())) {
					if (spConfig.getBoolean("settings.players can change particle size")) {
						player.getOpenInventory().close();
						Inventories.ParticleSizeMenu(player);
					} else {
						player.sendMessage(Utils.formatText(spConfig.getString("messages.particle size not editable")));
					}
				} else {
					player.sendMessage(Utils.formatText(spConfig.getString("messages.no active particles")));
				}
			}
		}

		/**
		 * Effect menu click
		 */
		if (invTitle.equals(Utils.formatText(spConfig.getString("inventories.effects menu.title")))) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.flame.display name")))) {
				player.getOpenInventory().close();
				StaffParticles.activeParticles.put(player.getUniqueId(), Particle.FLAME);
				StaffParticles.activeParticleSize.put(player.getUniqueId(),
						spConfig.getInt("settings.global max particle size"));
				player.sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.enchantment.display name")))) {
				player.getOpenInventory().close();
				StaffParticles.activeParticles.put(player.getUniqueId(), Particle.ENCHANTMENT_TABLE);
				StaffParticles.activeParticleSize.put(player.getUniqueId(),
						spConfig.getInt("settings.global max particle size"));
				player.sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.portal.display name")))) {
				player.getOpenInventory().close();
				StaffParticles.activeParticles.put(player.getUniqueId(), Particle.PORTAL);
				StaffParticles.activeParticleSize.put(player.getUniqueId(),
						spConfig.getInt("settings.global max particle size"));
				player.sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.heart.display name")))) {
				player.getOpenInventory().close();
				StaffParticles.activeParticles.put(player.getUniqueId(), Particle.HEART);
				StaffParticles.activeParticleSize.put(player.getUniqueId(),
						spConfig.getInt("settings.global max particle size"));
				player.sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils
					.formatText(spConfig.getString("inventories.effects menu.items.dragon breath.display name")))) {
				player.getOpenInventory().close();
				StaffParticles.activeParticles.put(player.getUniqueId(), Particle.DRAGON_BREATH);
				StaffParticles.activeParticleSize.put(player.getUniqueId(),
						spConfig.getInt("settings.global max particle size"));
				player.sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.smoke.display name")))) {
				player.getOpenInventory().close();
				StaffParticles.activeParticles.put(player.getUniqueId(), Particle.SMOKE_LARGE);
				StaffParticles.activeParticleSize.put(player.getUniqueId(),
						spConfig.getInt("settings.global max particle size"));
				player.sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.explosion.display name")))) {
				player.getOpenInventory().close();
				StaffParticles.activeParticles.put(player.getUniqueId(), Particle.EXPLOSION_LARGE);
				StaffParticles.activeParticleSize.put(player.getUniqueId(),
						spConfig.getInt("settings.global max particle size"));
				player.sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.water.display name")))) {
				player.getOpenInventory().close();
				StaffParticles.activeParticles.put(player.getUniqueId(), Particle.DRIP_WATER);
				StaffParticles.activeParticleSize.put(player.getUniqueId(),
						spConfig.getInt("settings.global max particle size"));
				player.sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
		}

		/**
		 * Particle size menu click
		 */
		if (invTitle.equals(Utils.formatText(spConfig.getString("inventories.particle size.title")))) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils
					.formatText(spConfig.getString("inventories.particle size.items.increase size.display name")))) {

				// TODO: Increase size
				final int current = StaffParticles.activeParticleSize.get(player.getUniqueId());
				if (current + 50 > spConfig.getInt("settings.global max particle size"))
					StaffParticles.activeParticleSize.put(player.getUniqueId(), current);
				else
					StaffParticles.activeParticleSize.put(player.getUniqueId(), current + 50);

				player.getOpenInventory().close();
				Inventories.ParticleSizeMenu(player);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils
					.formatText(spConfig.getString("inventories.particle size.items.decrease size.display name")))) {

				// TODO: decrease size
				final int current = StaffParticles.activeParticleSize.get(player.getUniqueId());
				if (current - 50 < 0)
					StaffParticles.activeParticleSize.put(player.getUniqueId(), current);
				else
					StaffParticles.activeParticleSize.put(player.getUniqueId(), current - 50);

				player.getOpenInventory().close();
				Inventories.ParticleSizeMenu(player);
			}
		}
	}

	@EventHandler
	public void OnPlayerMove(PlayerMoveEvent e) {
		if (StaffParticles.activeParticles.containsKey(e.getPlayer().getUniqueId())) {
			// !spConfig.getBoolean("settings.players can change particle size") ?
			// spConfig.getInt("settings.global max particle size") : 250 # here 250 needs
			// to be changed to the players set max size, 250 is the start/max number
			e.getPlayer().getWorld().spawnParticle(StaffParticles.activeParticles.get(e.getPlayer().getUniqueId()),
					e.getPlayer().getLocation(),
					!spConfig.getBoolean("settings.players can change particle size")
							? spConfig.getInt("settings.global max particle size")
							: StaffParticles.activeParticleSize.get(e.getPlayer().getUniqueId()));
		}
	}
}
