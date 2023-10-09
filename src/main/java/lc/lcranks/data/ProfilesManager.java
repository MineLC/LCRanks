package lc.lcranks.data;

import lc.lcranks.LCRanks;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

public class ProfilesManager {

    private LCRanks pl;
    private final Set<ProfilePlayer> profilePlayers;

    public ProfilesManager(LCRanks pl){
        this.pl = pl;
        profilePlayers = new HashSet<>();
    }

    public Set<ProfilePlayer> getProfilePlayers() {
        return profilePlayers;
    }

    public boolean isProfile(Player p) {
        for (ProfilePlayer profilePlayer : getProfilePlayers()) {
            if(profilePlayer.getUuid().equals(p.getUniqueId())) return true;
        }
        return false;
    }

    public ProfilePlayer getProfile(Player p) {
        for (ProfilePlayer profilePlayer : getProfilePlayers()) {
            if(profilePlayer.getUuid().equals(p.getUniqueId())) return profilePlayer;
        }
        return null;
    }
}
