package fr.thevenetandy.oks.api.managers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.bukkit.craftbukkit.libs.jline.internal.Log;

import fr.thevenetandy.oks.api.commands.Command;

public class CommandsManager {
	
	private static Map<String, Command> commands = new HashMap<String, Command>();
	
	
	/**
	 * 
	 * @param label Command name
	 * @param command Command
	 */
	public static void registerCommand(String label, Command command) {
		if(!commands.containsKey(label)){
			commands.put(label, command);
		} else {
			Log.error("La commande est déjà enregistrée");
		}	
	}
	
	/**
	 * 
	 * @param label Command name
	 */
	public static void unregisterCommand(String label) {
		if(commands.containsKey(label)){
			commands.remove(label);
		}
	}
	
	public static Set<String> getCommands() {
		return commands.keySet();
	}

	
	/**
	 * 
	 * @param com Command to test
	 * @return
	 */
	public static boolean isCommand(String com) {
		return commands.containsKey(com);
	}
	
	public static Command getCommand(String com) {
		return commands.get(com);
	}
	
	
	
}
