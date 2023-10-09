package lc.lcranks.listeners;

import lc.lcranks.LCRanks;
import lc.lcranks.Rank;
import lc.lcranks.data.ProfilePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

    LCRanks pl;

    public PlayerListener(LCRanks pl){
        this.pl = pl;
    }
    //
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        if(!pl.getManager().isProfile(p)) pl.getManager().getProfilePlayers().add(new ProfilePlayer(p, Rank.USER, Rank.USER, -1));
    }

}
