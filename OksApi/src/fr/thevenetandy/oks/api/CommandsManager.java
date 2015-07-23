package fr.thevenetandy.oks.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.craftbukkit.libs.jline.internal.Log;

public class CommandsManager {
	
	private static Map<String, String> commands = new HashMap<String, String>();
	private static Map<String, String> commandsDesc = new HashMap<String, String>();
	
	
	/**
	 * 
	 * @param plugin Name of plugin
	 * @param com Command Name
	 * @param desc Command Description
	 */
	public static void registerNewCommand(String plugin, String com, String desc) {
		boolean pl = OksPluginManager.isPlugin(plugin);
		if(pl == true){
			commands.put(plugin, com);
			commandsDesc.put(com, desc);
		} else {
			Log.error("Le plugin n'existe pas");
		}
		
	}
	
	public static void unregisterNewCommand(String com) {
		String comK = getCommandKey(com);
		commands.remove(comK);
		commandsDesc.remove(comK);
	}
	
	public static void listCommands() {
		for (Entry<String, String> entry : commands.entrySet())
		{
		   entry.getValue();
		}
	}

	
	/**
	 * 
	 * @param com Command to test
	 * @return
	 */
	public static boolean isCommand(String com) {
		for (Entry<String, String> entry : commands.entrySet())
		{
			if(entry.getValue().equalsIgnoreCase(com))
				return true;
		}
		return false;
	}
	
	public static String getCommandKey(String com) {
		for (Entry<String, String> entry : commands.entrySet())
		{
			if(entry.getValue().equalsIgnoreCase(com))
				return entry.getKey();
		}
		return null;
	}
	
	
	
}
