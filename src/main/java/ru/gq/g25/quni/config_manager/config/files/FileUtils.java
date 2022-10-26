package ru.gq.g25.quni.config_manager.config.files;


import ru.gq.g25.quni.GQ;
import ru.gq.g25.quni.config_manager.config.Yaml;
import ru.gq.g25.quni.config_manager.config.enums.DirectorySource;


import java.io.File;

public class FileUtils {

    public static Yaml getDefaultCfg(String file) {
        return new Yaml(new File(GQ.getInstance().getDataFolder(), file + ".yml"));
    }

    public static Yaml getDirectoryFile(DirectorySource directory, String file) {
        return new Yaml(new File(GQ.getInstance().getDataFolder() + File.separator + directory + File.separator + file + ".yml"));
    }



}