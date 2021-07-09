package me.treexhd.mc.instantbreakinflight.instantbreakblockinflight;

import org.bukkit.entity.Player;

public class InstantBreakBlockinFlightUtil {

    public static boolean isFly(Player player){
        Player p = player.getPlayer();
        if(p.isFlying()){
            return true;
        }
        return false;
    }
}
