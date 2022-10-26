package ru.gq.g25.quni.config_manager;

import ru.gq.g25.quni.GQ;
import ru.gq.g25.quni.config_manager.config.Yaml;
import ru.gq.g25.quni.config_manager.config.enums.DirectorySource;
import lombok.Getter;


public class RegistrationService {

    @Getter private final GQ plugin;

    public RegistrationService(GQ plugin) {
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