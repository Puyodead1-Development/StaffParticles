package me.puyodead1.staffparticles.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.puyodead1.staffparticles.Inventories;
import me.puyodead1.staffparticles.StaffParticles;
import me.puyodead1.staffparticles.Utils;

public class StaffParticlesCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
		final Player player = (Player) sender;

		if (args.length == 0) {
			player.sendMessage(Utils.formatText("&6&l---- Commands ----"));
			player.sendMessage(Utils.formatText("&e&l/staffparticles - shows this help menu"));
			player.sendMessage(Utils.formatText("&e&l/staffparticles effects - opens effects GUI"));
			player.sendMessage(Utils.formatText("&e&l/staffparticles effectoff - disables acive effect"));
		} else if (args.length == 1) {
			if (args[0].equalsIgnoreCase("effectoff") && player.hasPermission("staffgui.effectoff")) {
				StaffParticles.activeEffects.remove(player.getUniqueId());
				player.sendMessage(Utils.formatText("&6&lEffect disabled!"));
			}
			if (args[0].equalsIgnoreCase("effects") && player.hasPermission("staffgui.effects")) {
				Inventories.MainMenu(player);
			}
		}
		return false;
	}
}
