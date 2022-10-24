package ru.gq.g25.quni.commands;

import ru.gq.g25.quni.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import ru.gq.g25.quni.misc.config.Yaml;
import ru.gq.g25.quni.misc.config.files.FileUtils;

public class ChangeConfig implements CommandExecutor {
    Main plugin;

    public ChangeConfig(Main plugin) {
        plugin.getCommand("change").setExecutor(this);
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 1) return true;
        Yaml base_config = FileUtils.getDefaultCfg("config");
        base_config.set("name", args[0]);
        return false;
    }
}
