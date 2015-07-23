package fr.thevenetandy.oks.api;

import org.bukkit.craftbukkit.libs.jline.internal.Log;
import org.bukkit.plugin.java.JavaPlugin;
import fr.thevenetandy.oks.api.CommandsManager;

public class OksApi extends JavaPlugin{

	public void onEnable() {
		Log.info("Enabling OksApi");

		CommandsManager.registerNewCommand("help");
		
		Log.info("OksApi is enabled");
	}
	
	public void onDisable() {
		Log.info("Disabling OksApi");
		
		Log.info("OksApi Disabled");
	}
	
}
