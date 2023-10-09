package lc.lcranks;

import lc.lcranks.data.ProfilesManager;
import lc.lcranks.listeners.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LCRanks extends JavaPlugin {

    private ProfilesManager manager;
    public static LCRanks instance;
    public static LCRanks getInstance(){
        return instance;
    }

    @Override
    public void onEnable() {
        manager = new ProfilesManager(this);
        Bukkit.getPluginManager().registerEvents(new PlayerListener(this), this);
    }




    public ProfilesManager getManager() {
        return manager;
    }
}
