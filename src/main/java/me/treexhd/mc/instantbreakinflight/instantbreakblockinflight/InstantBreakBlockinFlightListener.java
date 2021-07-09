package me.treexhd.mc.instantbreakinflight.instantbreakblockinflight;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;

public class InstantBreakBlockinFlightListener implements Listener {

    @EventHandler
    public void onBreakBlock(BlockDamageEvent event){
        if(InstantBreakBlockinFlightUtil.isFly(event.getPlayer())){
            Player p = event.getPlayer();
            event.setInstaBreak(true);
        }
    }
}
