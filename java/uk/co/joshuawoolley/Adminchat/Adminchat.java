package uk.co.joshuawoolley.Adminchat;

import org.bukkit.plugin.java.JavaPlugin;

import uk.co.joshuawoolley.Adminchat.command.CommandHandler;


/**
 * Hello world!
 *
 */
public class Adminchat extends JavaPlugin {
	
    public void onEnable() {
    	this.getCommand("a").setExecutor(new CommandHandler());
    	
    	getLogger().info("Adminchat has been enabled");
    }
    
    public void onDisable() {
    	getLogger().info("Adminchat has been disbaled");
    }
}
