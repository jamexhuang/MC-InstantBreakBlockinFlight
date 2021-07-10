package me.treexhd.mc.instantbreakinflight.instantbreakblockinflight;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.block.Block;

public class InstantBreakBlockinFlightUtil {

    public static boolean isFly(Player player){
        Player p = player.getPlayer();
        if(p.isFlying() & p.getGameMode() == GameMode.SURVIVAL){
            return true;
        }
        return false;
    }

    public static int blockHeight(Location location){
        return location.getBlockY();
    }
}
