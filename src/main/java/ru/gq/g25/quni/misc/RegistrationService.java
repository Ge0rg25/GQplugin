package ru.gq.g25.quni.misc;

import ru.gq.g25.quni.Main;
import ru.gq.g25.quni.misc.config.Yaml;
import ru.gq.g25.quni.misc.config.enums.DirectorySource;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.Listener;


public class RegistrationService {

    @Getter private final Main plugin;

    public RegistrationService(Main plugin) {
        this.plugin = plugin;
    }

    public void initConfigs(DirectorySource directoryType, String ...files) {
        if(plugin.getDataFolder() == null) plugin.getDataFolder().mkdir();
        for (String str : files) {
            if (directoryType != DirectorySource.NONE)
                new Yaml(directoryType.getType(), str + ".yml", true);
            else
                new Yaml(str + ".yml");
        }
    }

//    public void registrationCmd(CommandExecutor[] executors, TabCompleter[] completes, String ...commands) {
//
//        String command;
//        boolean executorsSmall = executors.length == 1;
//
//        for (int i = 0; i < executors.length; i++) {
//            command = executorsSmall ? commands[0] : commands[i];
//
//            plugin.getCommand(command).setExecutor(executorsSmall ? executors[0] : executors[i]);
//            plugin.getCommand(command).setTabCompleter(executorsSmall ? completes[0] : completes[i]);
//        }
//    }
//
//    public void registrationEvents(Listener... listeners) {
//        for (Listener listener : listeners) {
//            Bukkit.getPluginManager().registerEvents(listener, Main.getInstance());
//        }
//    }
}