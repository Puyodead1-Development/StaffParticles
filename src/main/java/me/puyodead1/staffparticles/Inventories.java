package me.puyodead1.staffparticles;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Inventories {

	private static FileConfiguration spConfig = StaffParticles.getPlugin().getConfig();

	public static void MainMenu(Player player) {
		Inventory inv = Bukkit.getServer().createInventory(null, spConfig.getInt("inventories.main menu.size"),
				Utils.formatText("&2&lStaff Particles"));

		ItemStack effectsItem = new ItemStack(
				UMaterial.match(spConfig.getString("inventories.main menu.items.effects.material")).getItemStack());
		ItemMeta effectsItemMeta = effectsItem.getItemMeta();

		effectsItemMeta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.main menu.items.effects.display name")));
		ArrayList<String> effectsItemLore = new ArrayList<String>();
		effectsItemLore.addAll(Utils.formatText(spConfig.getStringList("inventories.main menu.items.effects.lore")));
		effectsItemMeta.setLore(effectsItemLore);
		effectsItem.setItemMeta(effectsItemMeta);

		ItemStack disableEffectsItem = new ItemStack(UMaterial
				.match(spConfig.getString("inventories.main menu.items.disable all effects.material")).getItemStack());
		ItemMeta disableEffectsItemMeta = disableEffectsItem.getItemMeta();

		disableEffectsItemMeta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.main menu.items.disable all effects.display name")));
		ArrayList<String> disableEffectsItemLore = new ArrayList<String>();
		if(StaffParticles.activeParticles.containsKey(player.getUniqueId())) {
			disableEffectsItemLore.addAll(
					Utils.replace(Utils.formatText(spConfig.getStringList("inventories.main menu.items.disable all effects.active particles lore")), "{ACTIVE_PARTICLE}", StaffParticles.activeParticles.get(player.getUniqueId()).name()));
		} else {
			disableEffectsItemLore.addAll(Utils.formatText(spConfig.getStringList("inventories.main menu.items.disable all effects.no active particles lore")));
		}
		disableEffectsItemMeta.setLore(disableEffectsItemLore);
		disableEffectsItem.setItemMeta(disableEffectsItemMeta);

		inv.setItem(spConfig.getInt("inventories.main menu.items.effects.slot"), effectsItem);
		inv.setItem(spConfig.getInt("inventories.main menu.items.disable all effects.slot"), disableEffectsItem);

		player.openInventory(inv);
	}

	public static void TrailsMenu(Player player) {
		Inventory gui = Bukkit.getServer().createInventory(null, spConfig.getInt("inventories.effects menu.size"),
				Utils.formatText(spConfig.getString("inventories.effects menu.title")));

		ItemStack item1 = new ItemStack(
				UMaterial.match(spConfig.getString("inventories.effects menu.items.flame.material")).getItemStack());
		ItemMeta item1Meta = item1.getItemMeta();

		ItemStack item2 = new ItemStack(UMaterial
				.match(spConfig.getString("inventories.effects menu.items.enchantment.material")).getItemStack());
		ItemMeta item2Meta = item2.getItemMeta();

		ItemStack item3 = new ItemStack(
				UMaterial.match(spConfig.getString("inventories.effects menu.items.portal.material")).getItemStack());
		ItemMeta item3Meta = item3.getItemMeta();

		ItemStack item4 = new ItemStack(
				UMaterial.match(spConfig.getString("inventories.effects menu.items.heart.material")).getItemStack());
		ItemMeta item4Meta = item4.getItemMeta();

		ItemStack item5 = new ItemStack(UMaterial
				.match(spConfig.getString("inventories.effects menu.items.dragon breath.material")).getItemStack());
		ItemMeta item5Meta = item5.getItemMeta();

		ItemStack item6 = new ItemStack(
				UMaterial.match(spConfig.getString("inventories.effects menu.items.smoke.material")).getItemStack());
		ItemMeta item6Meta = item6.getItemMeta();

		ItemStack item7 = new ItemStack(UMaterial
				.match(spConfig.getString("inventories.effects menu.items.explosion.material")).getItemStack());
		ItemMeta item7Meta = item7.getItemMeta();

		ItemStack item8 = new ItemStack(
				UMaterial.match(spConfig.getString("inventories.effects menu.items.water.material")).getItemStack());
		ItemMeta item8Meta = item8.getItemMeta();
		
		ItemStack backItem = new ItemStack(
				UMaterial.match(spConfig.getString("inventories.effects menu.items.back.material")).getItemStack());
		ItemMeta backMeta = backItem.getItemMeta();

		ArrayList<String> item1Lore = new ArrayList<String>(), item2Lore = new ArrayList<String>(),
				item3Lore = new ArrayList<String>(), item4Lore = new ArrayList<String>(),
				item5Lore = new ArrayList<String>(), item6Lore = new ArrayList<String>(),
				item7Lore = new ArrayList<String>(), item8Lore = new ArrayList<String>(), backLore = new ArrayList<String>();

		item1Lore.addAll(Utils.formatText(spConfig.getStringList("inventories.effects menu.items.flame.lore")));
		item2Lore.addAll(Utils.formatText(spConfig.getStringList("inventories.effects menu.items.enchantment.lore")));
		item3Lore.addAll(Utils.formatText(spConfig.getStringList("inventories.effects menu.items.portal.lore")));
		item4Lore.addAll(Utils.formatText(spConfig.getStringList("inventories.effects menu.items.heart.lore")));
		item5Lore.addAll(Utils.formatText(spConfig.getStringList("inventories.effects menu.items.dragon breath.lore")));
		item6Lore.addAll(Utils.formatText(spConfig.getStringList("inventories.effects menu.items.smoke.lore")));
		item7Lore.addAll(Utils.formatText(spConfig.getStringList("inventories.effects menu.items.explosion.lore")));
		item8Lore.addAll(Utils.formatText(spConfig.getStringList("inventories.effects menu.items.water.lore")));
		backLore.addAll(Utils.formatText(spConfig.getStringList("inventories.effects menu.items.back.lore")));

		item1Meta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.effects menu.items.flame.display name")));
		item1Meta.setLore(item1Lore);
		item1.setItemMeta(item1Meta);

		item2Meta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.effects menu.items.enchantment.display name")));
		item2Meta.setLore(item2Lore);
		item2.setItemMeta(item2Meta);

		item3Meta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.effects menu.items.portal.display name")));
		item3Meta.setLore(item3Lore);
		item3.setItemMeta(item3Meta);

		item4Meta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.effects menu.items.heart.display name")));
		item4Meta.setLore(item4Lore);
		item4.setItemMeta(item4Meta);

		item5Meta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.effects menu.items.dragon breath.display name")));
		item5Meta.setLore(item5Lore);
		item5.setItemMeta(item5Meta);

		item6Meta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.effects menu.items.smoke.display name")));
		item6Meta.setLore(item6Lore);
		item6.setItemMeta(item6Meta);

		item7Meta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.effects menu.items.explosion.display name")));
		item7Meta.setLore(item7Lore);
		item7.setItemMeta(item7Meta);

		item8Meta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.effects menu.items.water.display name")));
		item8Meta.setLore(item8Lore);
		item8.setItemMeta(item8Meta);
		
		backMeta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.effects menu.items.back.display name")));
		backMeta.setLore(backLore);
		backItem.setItemMeta(backMeta);

		gui.setItem(spConfig.getInt("inventories.effects menu.items.flame.slot"), item1);
		gui.setItem(spConfig.getInt("inventories.effects menu.items.enchantment.slot"), item2);
		gui.setItem(spConfig.getInt("inventories.effects menu.items.portal.slot"), item3);
		gui.setItem(spConfig.getInt("inventories.effects menu.items.heart.slot"), item4);
		gui.setItem(spConfig.getInt("inventories.effects menu.items.dragon breath.slot"), item5);
		gui.setItem(spConfig.getInt("inventories.effects menu.items.smoke.slot"), item6);
		gui.setItem(spConfig.getInt("inventories.effects menu.items.explosion.slot"), item7);
		gui.setItem(spConfig.getInt("inventories.effects menu.items.water.slot"), item8);
		gui.setItem(spConfig.getInt("inventories.effects menu.items.back.slot"), backItem);

		player.openInventory(gui);
	}
}
