package fr.thevenetandy.oks.api.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class CommandHelp extends Command{

	public CommandHelp(Plugin plugin) {
		super(plugin);
	}
	
	@Override
	public void onTyped(CommandSender sender, String[] args) {
		sender.sendMessage("test");
	}
	
	@Override
	public String getDescription() {
		return "Commande d'aide";
	}

}
