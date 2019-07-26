package me.puyodead1.staffparticles;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Inventories {

	public static void MainMenu(Player player) {
		Inventory inv = Bukkit.getServer().createInventory(null, 9, Utils.formatText("&2&lStaff Particles"));

		ItemStack item1 = new ItemStack(Material.FIREWORK_STAR);
		ItemMeta item1Meta = item1.getItemMeta();

		ArrayList<String> item1Lore = new ArrayList<String>();

		item1Lore.add(Utils.formatText("&a&lClick Here To Equip Particle Effects!"));

		item1Meta.setDisplayName(Utils.formatText("&a&lT&d&lR&c&lA&9&lI&6&lL &a&lE&d&lF&c&lF&9&lE&6&lC&b&lT&f&lS"));
		item1Meta.setLore(item1Lore);
		item1.setItemMeta(item1Meta);

		inv.setItem(0, item1);

		player.openInventory(inv);
	}

	public static void TrailsMenu(Player player) {
		Inventory gui = Bukkit.getServer().createInventory(null, 9, Utils.formatText("&4&l&nTrail Effects"));

		ItemStack item1 = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta item1Meta = item1.getItemMeta();

		ItemStack item2 = new ItemStack(Material.ENCHANTING_TABLE);
		ItemMeta item2Meta = item2.getItemMeta();

		ItemStack item3 = new ItemStack(Material.END_PORTAL_FRAME);
		ItemMeta item3Meta = item3.getItemMeta();

		ItemStack item4 = new ItemStack(Material.APPLE);
		ItemMeta item4Meta = item4.getItemMeta();

		ItemStack item5 = new ItemStack(Material.DRAGON_EGG);
		ItemMeta item5Meta = item5.getItemMeta();

		ItemStack item6 = new ItemStack(Material.FURNACE);
		ItemMeta item6Meta = item6.getItemMeta();

		ItemStack item7 = new ItemStack(Material.TNT);
		ItemMeta item7Meta = item7.getItemMeta();

		ItemStack item8 = new ItemStack(Material.WATER_BUCKET);
		ItemMeta item8Meta = item8.getItemMeta();

		ArrayList<String> item1Lore = new ArrayList<String>(), item2Lore = new ArrayList<String>(),
				item3Lore = new ArrayList<String>(), item4Lore = new ArrayList<String>(),
				item5Lore = new ArrayList<String>(), item6Lore = new ArrayList<String>(),
				item7Lore = new ArrayList<String>(), item8Lore = new ArrayList<String>();

		item1Lore.add(Utils.formatText("&6Click Here to get some cool flames!"));
		item1Lore.add(Utils.formatText("&6/flameoff to turn it off!"));

		item2Lore.add(Utils.formatText("&7Click here to get some cool enchanting particles!"));
		item2Lore.add(Utils.formatText("&7/enchantoff to turn it off!"));

		item3Lore.add(Utils.formatText("&5Click here to get some cool portal particles!"));
		item3Lore.add(Utils.formatText("&5/portaloff to turn it off!"));

		item4Lore.add(Utils.formatText("&cClick here to get some cool heart particles!"));
		item4Lore.add(Utils.formatText("&c/heartoff to turn it off!"));

		item5Lore.add(Utils.formatText("&5Click here to get some cool dragon breath particles!"));
		item5Lore.add(Utils.formatText("&5/dragonoff to turn it off!"));
		item5Lore.add(Utils.formatText("&5WARNING!! THIS IS EXPERIMENTAL!!! BEWARE HEADPHONE USERS!"));

		item6Lore.add(Utils.formatText("&7Click here to get some cool smoke particles!"));
		item6Lore.add(Utils.formatText("&7/smokeoff to turn it off!"));

		item7Lore.add(Utils.formatText("&7Click here to get some cool explosion particles!"));
		item7Lore.add(Utils.formatText("&7/explosionoff to turn it off!"));

		item8Lore.add(Utils.formatText("&9Click here to get some cool water particles!"));
		item8Lore.add(Utils.formatText("&9/wateroff to turn it off!"));

		item1Meta.setDisplayName(Utils.formatText("&6Flame Particle!"));
		item1Meta.setLore(item1Lore);
		item1.setItemMeta(item1Meta);

		item2Meta.setDisplayName(Utils.formatText("&7Enchant Particle!"));
		item2Meta.setLore(item2Lore);
		item2.setItemMeta(item2Meta);

		item3Meta.setDisplayName(Utils.formatText("&5Portal Particle!"));
		item3Meta.setLore(item3Lore);
		item3.setItemMeta(item3Meta);

		item4Meta.setDisplayName(Utils.formatText("&cHeart Particle!"));
		item4Meta.setLore(item4Lore);
		item4.setItemMeta(item4Meta);

		item5Meta.setDisplayName(Utils.formatText("&5Dragon Breath Particle!"));
		item5Meta.setLore(item5Lore);
		item5.setItemMeta(item5Meta);

		item6Meta.setDisplayName(Utils.formatText("&7Smoke Particle!"));
		item6Meta.setLore(item6Lore);
		item6.setItemMeta(item6Meta);

		item7Meta.setDisplayName(Utils.formatText("&7Explosion Particle!"));
		item7Meta.setLore(item7Lore);
		item7.setItemMeta(item7Meta);

		item8Meta.setDisplayName(Utils.formatText("&9Water Particle!"));
		item8Meta.setLore(item8Lore);
		item8.setItemMeta(item8Meta);

		gui.setItem(0, item1);
		gui.setItem(1, item2);
		gui.setItem(2, item3);
		gui.setItem(3, item4);
		gui.setItem(4, item5);
		gui.setItem(5, item6);
		gui.setItem(6, item7);
		gui.setItem(7, item8);

		player.openInventory(gui);
	}
}
