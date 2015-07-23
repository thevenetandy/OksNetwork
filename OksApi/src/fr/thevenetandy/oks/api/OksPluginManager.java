package fr.thevenetandy.oks.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OksPluginManager {
	
	private static Map<String, String> plugins = new HashMap<String, String>();
	
	public static void registerNewPlugin(String name, String desc){
		plugins.put(name, desc);
	}

	public static boolean isPlugin(String plugin) {
		for (Entry<String, String> entry : plugins.entrySet())
		{
			if(entry.getKey().equalsIgnoreCase(plugin))
				return true;
		}
		return false;
	}
	
}
