package g25.quni.ru.gq.Commands;

import g25.quni.ru.gq.GQ;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import g25.quni.ru.gq.Misc.MiscExample;
import org.bukkit.entity.Player;

public class CommandExample implements CommandExecutor {


    public CommandExample(GQ plugin) {
        plugin.getCommand("timon").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("Тимон Эй!");
        MiscExample.miscMethod((Player) sender);
        return false;
    }
}
