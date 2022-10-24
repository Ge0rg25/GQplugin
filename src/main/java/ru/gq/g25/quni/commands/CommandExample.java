package ru.gq.g25.quni.commands;

import ru.gq.g25.quni.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import ru.gq.g25.quni.config_manager.config.Yaml;
import ru.gq.g25.quni.config_manager.config.files.FileUtils;


public class CommandExample implements CommandExecutor {

    Main plugin;

    public CommandExample(Main plugin) {
        plugin.getCommand("timon").setExecutor(this);
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Yaml yaml = FileUtils.getDefaultCfg("config");
        sender.sendMessage(yaml.getString("name") + " Эй!");
        return false;
    }


}
