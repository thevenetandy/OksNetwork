package fr.thevenetandy.oks.api.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import fr.thevenetandy.oks.api.managers.CommandsManager;

public class CommandEvent implements Listener {
	
	public static String commandValue;

	@EventHandler
	public void chatCommand(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		String[] args = e.getMessage().split(" ");
		String commandLabel = args[0];
		if(commandLabel.equalsIgnoreCase("/oks")){
			if(CommandsManager.isCommand(args[1])){
				CommandsManager.getCommand(args[1]).onTyped(p, new String[0] /*à remplacer par un nouveau tableau*/);
			}
		}
		
	}
	
}
