package fr.thevenetandy.oks.api;

import java.util.Map;

public class CommandsManager {
	
	private static Map<Integer, String> commands;
	private static int commandN = 0;
	
	public static void registerNewCommand(String com) {
		commandN++;
		commands.put(commandN, com);
	}
	
}
