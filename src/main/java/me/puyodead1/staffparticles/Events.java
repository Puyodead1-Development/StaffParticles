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

		if (invTitle.equals(Utils.formatText(spConfig.getString("inventories.main menu.title")))) {
			Player player = (Player) e.getWhoClicked();
			if (e.getCurrentItem().getItemMeta().getDisplayName()
					.equals(Utils.formatText(spConfig.getString("inventories.main menu.items.effects.display name")))) {
				player.getOpenInventory().close();
				Inventories.TrailsMenu(player);
			} else if (e.getCurrentItem().getItemMeta().getDisplayName()
					.equals(Utils.formatText(spConfig.getString("inventories.main menu.items.disable all effects.display name")))) {
				player.getOpenInventory().close();
				StaffParticles.activeParticles.remove(player.getUniqueId());
				if(StaffParticles.activeParticles.containsKey(player.getUniqueId())) {
					player.sendMessage(Utils.formatText(spConfig.getString("messages.particle disabled").replace("{ACTIVE_PARTICLE}", StaffParticles.activeParticles.get(player.getUniqueId()).name())));
				} else {
					player.sendMessage(Utils.formatText(spConfig.getString("messages.all active particles disabled")));
				}
			}
			return;
		}
	}

	@EventHandler
	public void OnInventoryClickTrails(InventoryClickEvent e) {
		String invTitle = e.getView().getTitle();

		if (invTitle.equals(Utils.formatText(spConfig.getString("inventories.effects menu.title")))) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.flame.display name")))) {
				e.setCancelled(true);
				e.getWhoClicked().getOpenInventory().close();
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.FLAME);
				e.getWhoClicked().sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.enchantment.display name")))) {
				e.setCancelled(true);
				e.getWhoClicked().getOpenInventory().close();
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.ENCHANTMENT_TABLE);
				e.getWhoClicked().sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.portal.display name")))) {
				e.setCancelled(true);
				e.getWhoClicked().getOpenInventory().close();
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.PORTAL);
				e.getWhoClicked().sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.heart.display name")))) {
				e.setCancelled(true);
				e.getWhoClicked().getOpenInventory().close();
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.HEART);
				e.getWhoClicked().sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(Utils
					.formatText(spConfig.getString("inventories.effects menu.items.dragon breath.display name")))) {
				e.setCancelled(true);
				e.getWhoClicked().getOpenInventory().close();
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.DRAGON_BREATH);
				e.getWhoClicked().sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.smoke.display name")))) {
				e.setCancelled(true);
				e.getWhoClicked().getOpenInventory().close();
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.SMOKE_LARGE);
				e.getWhoClicked().sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.explosion.display name")))) {
				e.setCancelled(true);
				e.getWhoClicked().getOpenInventory().close();
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.EXPLOSION_LARGE);
				e.getWhoClicked().sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(
					Utils.formatText(spConfig.getString("inventories.effects menu.items.water.display name")))) {
				e.setCancelled(true);
				e.getWhoClicked().getOpenInventory().close();
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.DRIP_WATER);
				e.getWhoClicked().sendMessage(Utils.formatText(spConfig.getString("messages.particle enabled")));
			}
		}
		return;
	}

	@EventHandler
	public void OnPlayerMove(PlayerMoveEvent e) {
		if (StaffParticles.activeParticles.containsKey(e.getPlayer().getUniqueId())) {
			// !spConfig.getBoolean("settings.players can change particle size") ? spConfig.getInt("settings.global max particle size") : 250 # here 250 needs to be changed to the players set max size, 250 is the start/max number
			e.getPlayer().getWorld().spawnParticle(StaffParticles.activeParticles.get(e.getPlayer().getUniqueId()),
					e.getPlayer().getLocation(), !spConfig.getBoolean("settings.players can change particle size") ? spConfig.getInt("settings.global max particle size") : 250);
		}
	}
}
