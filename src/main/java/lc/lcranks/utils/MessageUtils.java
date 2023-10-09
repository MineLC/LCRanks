package lc.lcranks.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class MessageUtils {

    public static String color(String str){
        return ChatColor.translateAlternateColorCodes('&', str);
    }

    public static void message(CommandSender sender, String msg){
        sender.sendMessage(color(msg));
    }
}
