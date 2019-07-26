package me.puyodead1.staffparticles;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.puyodead1.staffparticles.commands.StaffParticlesCommand;

public class StaffParticles extends JavaPlugin {

	public static StaffParticles instance;
	public static HashMap<UUID, Effect> activeEffects = new HashMap<UUID, Effect>();

	public static StaffParticles getPlugin() {
		return instance;
	}

	public void onEnable() {
		instance = this;
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new Events(), this);

		getCommand("staffparticles").setExecutor(new StaffParticlesCommand());
	}

	public void onDisable() {

	}
}
