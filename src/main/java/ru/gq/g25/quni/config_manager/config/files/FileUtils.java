package ru.gq.g25.quni.config_manager.config.files;


import ru.gq.g25.quni.Main;
import ru.gq.g25.quni.config_manager.config.Yaml;


import java.io.File;

public class FileUtils {

    public static Yaml getDefaultCfg(String file) {
        return new Yaml(new File(Main.getInstance().getDataFolder(), file + ".yml"));
    }

    public static Yaml getDirectoryFile(String directory, String file) {
        return new Yaml(new File(Main.getInstance().getDataFolder() + "/" + directory + "/" + file + ".yml"));
    }



}