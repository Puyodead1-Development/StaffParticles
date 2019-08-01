package me.puyodead1.staffparticles;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.puyodead1.staffparticles.utils.UMaterial;

public class Inventories {

	private static FileConfiguration spConfig = StaffParticles.getPlugin().getConfig();

	public static void MainMenu(Player player) {
		Inventory inv = Bukkit.getServer().createInventory(null, spConfig.getInt("inventories.main menu.size"),
				Utils.formatText("&2&lStaff Particles"));

		if(spConfig.getBoolean("inventories.main menu.items.hint.shown")) {
			ItemStack hintItem = new ItemStack(UMaterial
					.match(spConfig.getString("inventories.main menu.items.hint.material")).getItemStack());
			ItemMeta hintItemMeta = hintItem.getItemMeta();

			hintItemMeta.setDisplayName(
					Utils.formatText(spConfig.getString("inventories.main menu.items.hint.display name")));
			ArrayList<String> hintItemLore = new ArrayList<String>();

			hintItemLore.addAll(
					Utils.formatText(spConfig.getStringList("inventories.main menu.items.hint.lore")));
			hintItemMeta.setLore(hintItemLore);
			hintItem.setItemMeta(hintItemMeta);
			
			inv.setItem(spConfig.getInt("inventories.main menu.items.hint.slot"), hintItem);
		}
		
		
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
		if (StaffParticles.activeParticles.containsKey(player.getUniqueId())) {
			disableEffectsItemLore.addAll(Utils.replace(
					Utils.formatText(spConfig
							.getStringList("inventories.main menu.items.disable all effects.active particles lore")),
					"{ACTIVE_PARTICLE}", StaffParticles.activeParticles.get(player.getUniqueId()).name()));
		} else {
			disableEffectsItemLore.addAll(Utils.formatText(spConfig
					.getStringList("inventories.main menu.items.disable all effects.no active particles lore")));
		}
		disableEffectsItemMeta.setLore(disableEffectsItemLore);
		disableEffectsItem.setItemMeta(disableEffectsItemMeta);

		ItemStack editParticleSizeItem = new ItemStack(UMaterial
				.match(spConfig.getString("inventories.main menu.items.edit particle size.material")).getItemStack());
		ItemMeta editParticleSizeItemMeta = editParticleSizeItem.getItemMeta();

		editParticleSizeItemMeta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.main menu.items.edit particle size.display name")));
		ArrayList<String> editParticleSizeItemLore = new ArrayList<String>();

		editParticleSizeItemLore.addAll(
				Utils.formatText(spConfig.getStringList("inventories.main menu.items.edit particle size.lore")));
		editParticleSizeItemMeta.setLore(editParticleSizeItemLore);
		editParticleSizeItem.setItemMeta(editParticleSizeItemMeta);

		inv.setItem(spConfig.getInt("inventories.main menu.items.effects.slot"), effectsItem);
		inv.setItem(spConfig.getInt("inventories.main menu.items.disable all effects.slot"), disableEffectsItem);
		inv.setItem(spConfig.getInt("inventories.main menu.items.edit particle size.slot"), editParticleSizeItem);
		
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
				item7Lore = new ArrayList<String>(), item8Lore = new ArrayList<String>(),
				backLore = new ArrayList<String>();

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

	public static void ParticleSizeMenu(Player player) {
		if (!StaffParticles.activeParticles.containsKey(player.getUniqueId())) {
			player.getOpenInventory().close();
			player.sendMessage(Utils.formatText(spConfig.getString("messages.no active particles")));
		}
		Inventory inv = Bukkit.createInventory(null, spConfig.getInt("inventories.particle size.size"),
				Utils.formatText(spConfig.getString("inventories.particle size.title")));

		ItemStack currentSizeItem = new ItemStack(UMaterial
				.match(spConfig.getString("inventories.particle size.items.current size.material")).getItemStack()),
				increaseSizeItem = new ItemStack(
						UMaterial.match(spConfig.getString("inventories.particle size.items.increase size.material"))
								.getItemStack()),
				decreaseSizeItem = new ItemStack(
						UMaterial.match(spConfig.getString("inventories.particle size.items.decrease size.material"))
								.getItemStack());

		ItemMeta currentSizeMeta = currentSizeItem.getItemMeta(), increaseSizeMeta = increaseSizeItem.getItemMeta(),
				decreaseSizeMeta = decreaseSizeItem.getItemMeta();

		List<String> currentSizeLore = new ArrayList<String>(), increaseSizeLore = new ArrayList<String>(),
				decreaseSizeLore = new ArrayList<String>();

		List<String> currentLorea = Utils
				.replace(
						Utils.replace(
								Utils.formatText(
										spConfig.getStringList("inventories.particle size.items.current size.lore")),
								"{CURRENT_PARTICLE_SIZE}",
								StaffParticles.activeParticleSize.get(player.getUniqueId()) + ""),
						"{MAX_PARTICLE_SIZE}", spConfig.getInt("settings.global max particle size") + "");

		currentSizeLore.addAll(currentLorea);
		increaseSizeLore
				.addAll(Utils.formatText(spConfig.getStringList("inventories.particle size.items.increase size.lore")));
		decreaseSizeLore
				.addAll(Utils.formatText(spConfig.getStringList("inventories.particle size.items.decrease size.lore")));

		currentSizeMeta.setLore(currentSizeLore);
		increaseSizeMeta.setLore(increaseSizeLore);
		decreaseSizeMeta.setLore(decreaseSizeLore);

		currentSizeMeta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.particle size.items.current size.display name")));
		increaseSizeMeta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.particle size.items.increase size.display name")));
		decreaseSizeMeta.setDisplayName(
				Utils.formatText(spConfig.getString("inventories.particle size.items.decrease size.display name")));

		currentSizeItem.setItemMeta(currentSizeMeta);
		increaseSizeItem.setItemMeta(increaseSizeMeta);
		decreaseSizeItem.setItemMeta(decreaseSizeMeta);

		inv.setItem(spConfig.getInt("inventories.particle size.items.current size.slot"), currentSizeItem);
		inv.setItem(spConfig.getInt("inventories.particle size.items.increase size.slot"), increaseSizeItem);
		inv.setItem(spConfig.getInt("inventories.particle size.items.decrease size.slot"), decreaseSizeItem);
		
		player.openInventory(inv);
	}
}
