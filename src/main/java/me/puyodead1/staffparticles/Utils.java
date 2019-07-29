package me.puyodead1.staffparticles;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;

public class Utils {

	public static String formatText(String text) {
		return ChatColor.translateAlternateColorCodes('&', text);
	}

	public static List<String> formatText(List<String> list) {
		List<String> formatted = new ArrayList<String>();
		for (String s : list) {
			formatted.add(formatText(s));
		}

		return formatted;
	}

	public static List<String> replace(List<String> list, String string, String replacement) {
		List<String> formatted = new ArrayList<String>();
		for (String s : list) {
			formatted.add(s.replace(string, replacement));
		}

		return formatted;
	}
}
