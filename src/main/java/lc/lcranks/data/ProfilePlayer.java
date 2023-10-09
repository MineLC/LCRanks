package lc.lcranks.data;

import lc.lcranks.Rank;
import org.bukkit.entity.Player;

import java.util.UUID;

public class ProfilePlayer {

    private final String nick;
    private final UUID uuid;
    private Rank rank;
    private long duration;
    private Rank oldRank;

    public ProfilePlayer(Player p, Rank rank, Rank oldRank, long dur){
        nick = p.getName();
        uuid = p.getUniqueId();
        this.rank = rank;
        this.oldRank = oldRank;
        duration = dur;
    }
    public ProfilePlayer(String nick, UUID uuid, Rank rank, long duration, Rank oldRank){
        this.nick = nick;
        this.uuid = uuid;
        this.rank = rank;
        this.oldRank = oldRank;
        this.duration = duration;
    }


    public String getNick() {
        return nick;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Rank getRank() {
        return rank;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setOldRank(Rank oldRank) {
        this.oldRank = oldRank;
    }

    public Rank getOldRank() {
        return oldRank;
    }

}
