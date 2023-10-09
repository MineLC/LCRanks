package lc.lcranks;

import com.google.common.collect.Lists;
import org.bukkit.permissions.Permission;

import java.util.ArrayList;
import java.util.List;

public enum Rank {
    USER("&8"),
    VIP("&b&lVIP"),
    SVIP("&a&lSVIP"),
    ELITE("&6&lELITE"),
    RUBY("&c&lRUBY"),
    CEO("&d&lCEO");

    String prefix;

    Rank(String s) {
        this.prefix = s;
    }

    public String getPrefix() {
        return prefix;
    }

}
