package uk.co.joshuawoolley.Adminchat.chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;


/**
* @author Josh Woolley
*/
public class BroadcastHandler {
	
	public BroadcastHandler() {
		
	}
	
	public void printAdminChat(String name, String message) {
		for (Player p : Bukkit.getOnlinePlayers()) {
			if (p.hasPermission("adminchat.admin")) {
				p.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.AQUA + "A" + ChatColor.DARK_AQUA + "] "+ name + ":" + ChatColor.AQUA + message);
			}
		}
	}

}
