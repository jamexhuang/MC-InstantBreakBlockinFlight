package me.treexhd.mc.instantbreakinflight.instantbreakblockinflight;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.block.Block;

public class InstantBreakBlockinFlightListener implements Listener {

    @EventHandler
    public void onBreakBlock(BlockDamageEvent event){
        Player p = event.getPlayer();
        Block  b = event.getBlock();
        if(InstantBreakBlockinFlightUtil.isFly(p) & InstantBreakBlockinFlightUtil.blockHeight(b.getLocation()) > 60){
            

            event.setInstaBreak(true);
        }
    }
}
