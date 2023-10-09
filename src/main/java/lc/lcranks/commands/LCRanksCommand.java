package lc.lcranks.commands;

import lc.lcranks.utils.MessageUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.List;

public class LCRanksCommand implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("ranks") ||
                command.getName().equalsIgnoreCase("lcranks")){
            if(args.length == 0){
                MessageUtils.message(commandSender, "&f/ranks ");
                return true;
            }
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {
        return null;
    }
}
