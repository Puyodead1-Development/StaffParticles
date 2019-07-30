package me.puyodead1.staffparticles.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import me.puyodead1.staffparticles.Inventories;
import me.puyodead1.staffparticles.StaffParticles;
import me.puyodead1.staffparticles.Utils;

public class StaffParticlesCommand implements CommandExecutor {

	private FileConfiguration spConfig = StaffParticles.getPlugin().getConfig();

	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
		final Player player = (Player) sender;

		if (args.length == 0) {
			if (player.hasPermission("staffgui.effects")) {
				Inventories.MainMenu(player);
			} else {
				player.sendMessage(Utils.formatText(spConfig.getString("messages.no permission")));
			}
		} else if (args.length == 1) {
			if (args[0].equalsIgnoreCase("effectoff")) {
				if (player.hasPermission("staffgui.effectoff")) {
					StaffParticles.activeParticles.remove(player.getUniqueId());
					player.sendMessage(Utils.formatText("&6&lEffect disabled!"));
				} else {
					player.sendMessage(Utils.formatText(spConfig.getString("messages.no permission")));
				}
			}
			if (args[0].equalsIgnoreCase("help")) {
				if (player.hasPermission("staffgui.help")) {
					player.sendMessage(Utils.formatText("&6&l---- Commands ----"));
					player.sendMessage(Utils.formatText("&e&l/staffparticles help - shows this help menu"));
					player.sendMessage(Utils.formatText("&e&l/staffparticles - opens effects GUI"));
					player.sendMessage(Utils.formatText("&e&l/staffparticles effectoff - disables acive effect"));
				} else {
					player.sendMessage(Utils.formatText(spConfig.getString("messages.no permission")));
				}
			}
		}
		return false;
	}
}
