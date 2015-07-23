package fr.thevenetandy.oks.api;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.libs.jline.internal.Log;
import org.bukkit.plugin.java.JavaPlugin;

import fr.thevenetandy.oks.api.commands.CommandHelp;
import fr.thevenetandy.oks.api.listeners.CommandEvent;
import fr.thevenetandy.oks.api.managers.CommandsManager;

public class OksApi extends JavaPlugin{

	public void onEnable() {
		Log.info("Enabling OksApi");

		CommandsManager.registerCommand("help", new CommandHelp(this));
		Bukkit.getPluginManager().registerEvents(new CommandEvent(), this);
		
		Log.info("OksApi is enabled");
	}
	
	public void onDisable() {
		Log.info("Disabling OksApi");
		
		Log.info("OksApi Disabled");
	}
	
}
