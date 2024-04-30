package me.nekorise.Plugins;

import org.bukkit.Bukkit;

public class ServerUtils
{
    public static boolean hasPlugin(String name)
    {
        return Bukkit.getServer().getPluginManager().getPlugin(name) != null;
    }
}
