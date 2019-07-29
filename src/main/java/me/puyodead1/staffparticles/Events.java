package me.puyodead1.staffparticles;

import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Events implements Listener {

	@EventHandler
	public void OnInventoryClick(InventoryClickEvent e) {
		String invTitle = e.getView().getTitle();

		if (invTitle.equals(Utils.formatText("&2&lStaff Particles"))) {
			Player player = (Player) e.getWhoClicked();
			if (e.getCurrentItem().getType() == Material.FIREWORK_STAR) {
				e.getWhoClicked().closeInventory();
				Inventories.TrailsMenu(player);
			}
		}
	}

	@EventHandler
	public void OnInventoryClickTrails(InventoryClickEvent e) {
		String invTitle = e.getView().getTitle();

		if (invTitle.equals(Utils.formatText("&4&l&nTrail Effects"))) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Flame Particle!")) {
				e.setCancelled(true);
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.FLAME);
				e.getWhoClicked().sendMessage(Utils.formatText("&6&lFlame Particle Enabled! Enjoy!"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Enchant Particle!")) {
				e.setCancelled(true);
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.ENCHANTMENT_TABLE);
				e.getWhoClicked().sendMessage(Utils.formatText("&7&lEnchant Particle Enabled! Enjoy!"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Portal Particle!")) {
				e.setCancelled(true);
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.PORTAL);
				e.getWhoClicked().sendMessage(Utils.formatText("&5&lPortal Particle Enabled! Enjoy!"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Heart Particle!")) {
				e.setCancelled(true);
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.HEART);
				e.getWhoClicked().sendMessage(Utils.formatText("&c&lHeart Particle Enabled! Enjoy!"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Dragon Breath Particle!")) {
				e.setCancelled(true);
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.DRAGON_BREATH);
				e.getWhoClicked().sendMessage(Utils.formatText("&5&lDragon Breath Particle Enabled! Enjoy!"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Smoke Particle!")) {
				e.setCancelled(true);
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.SMOKE_LARGE);
				e.getWhoClicked().sendMessage(Utils.formatText("&7&lSmoke Particle Enabled! Enjoy!"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Explosion Particle!")) {
				e.setCancelled(true);
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.EXPLOSION_LARGE);
				e.getWhoClicked().sendMessage(Utils.formatText("&7&lExplosion Particle Enabled! Enjoy!"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Water Particle!")) {
				e.setCancelled(true);
				StaffParticles.activeParticles.put(e.getWhoClicked().getUniqueId(), Particle.DRIP_WATER);
				e.getWhoClicked().sendMessage(Utils.formatText("&9&lWater Particle Enabled! Enjoy!"));
			}
		}
	}

	@EventHandler
	public void OnPlayerMove(PlayerMoveEvent e) {
		if(StaffParticles.activeParticles.containsKey(e.getPlayer().getUniqueId())) {
			e.getPlayer().getWorld().spawnParticle(StaffParticles.activeParticles.get(e.getPlayer().getUniqueId()), e.getPlayer().getLocation(), 500);
		}
	}
}
