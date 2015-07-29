package uk.co.joshuawoolley.Adminchat.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import uk.co.joshuawoolley.Adminchat.chat.BroadcastHandler;

/**
* @author Josh Woolley
*/
public class CommandHandler implements CommandExecutor {
	
	private BroadcastHandler bh;
	
	public CommandHandler() {
		bh = new BroadcastHandler();
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("a")) {
			if (sender.hasPermission("adminchat.admin")) {
				String message = "";
				for (int i = 0; i < args.length; i++) {
					message = message + " " + args[i].toString();
				}
				bh.printAdminChat(sender.getName(), message);
			}
			return true;
		}
		return false;
	}

}
