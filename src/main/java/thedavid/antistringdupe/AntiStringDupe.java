package thedavid.antistringdupe;

import io.papermc.paper.event.block.BlockBreakBlockEvent;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiStringDupe extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    @EventHandler
    public void onWaterBreakString(BlockBreakBlockEvent e){
        if(e.getBlock().getType() == Material.TRIPWIRE){
            e.getBlock().setType(Material.AIR);
        }
    }
}
