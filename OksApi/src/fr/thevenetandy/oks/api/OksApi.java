package fr.thevenetandy.oks.api;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.libs.jline.internal.Log;
import org.bukkit.plugin.java.JavaPlugin;

import fr.thevenetandy.oks.api.CommandsManager;
import fr.thevenetandy.oks.api.listeners.CommandEvent;

public class OksApi extends JavaPlugin{

	public void onEnable() {
		Log.info("Enabling OksApi");

		//CommandsManager.registerNewCommand("help", "Help command");
		Bukkit.getPluginManager().registerEvents(new CommandEvent(), this);
		
		Log.info("OksApi is enabled");
	}
	
	public void onDisable() {
		Log.info("Disabling OksApi");
		
		Log.info("OksApi Disabled");
	}
	
	public static void main(String[] args) {
		OksPluginManager.registerNewPlugin("BaseCommands", "Base Commands Plugin");
		CommandsManager.registerNewCommand("BaseCommands", "help", "Help command");
		System.out.println(CommandsManager.isCommand("test"));
		System.out.println(CommandsManager.isCommand("help"));
		CommandsManager.listCommands();
	}
	
}
