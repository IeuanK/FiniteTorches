package dev.ieuank.finitetorches;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import dev.ieuank.finitetorches.blocks.LitTorch;

@Mod(modid = FiniteTorches.MODID, version = FiniteTorches.VERSION)
public class FiniteTorches
{
    public static final String MODID = "finitetorches";
    public static final String VERSION = "0.1";
    public static final Logger logger = Logger.getLogger(FiniteTorches.MODID);
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        FiniteTorches.logger.log(Level.INFO, MODID + " initiating");
        FiniteTorches.logger.log(Level.INFO, MODID + " registering blocks");
        this.registerBlocks();
        FiniteTorches.logger.log(Level.INFO, MODID + " done initiating");
    }
    
    public void registerBlocks() {
    	GameRegistry.registerBlock(LitTorch.litTorch, "litTorch");
        FiniteTorches.logger.log(Level.INFO, MODID + " blocks registered");
    }
}
