package fr.thevenetandy.oks.api.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class Command {
	
	private Plugin plugin;
	
	public Command(Plugin plugin) {
		this.plugin = plugin;
	}
	
	public String getDescription() {
		return "Aucune description définie";
	}
	
	public Plugin getPlugin() {
		return plugin;
	}
	
    public void onTyped(CommandSender sender, String[] args) {}

}
