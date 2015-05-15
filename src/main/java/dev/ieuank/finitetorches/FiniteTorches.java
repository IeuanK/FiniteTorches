package dev.ieuank.finitetorches;

import java.util.logging.Level;
import java.util.logging.Logger;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import dev.ieuank.finitetorches.blocks.BlockLitTorch;
import dev.ieuank.handles.FiniteCreativeTab;

@Mod(modid = FiniteTorches.MODID, version = FiniteTorches.VERSION)
public class FiniteTorches
{
    public static final String MODID = "finitetorches";
    public static final String VERSION = "0.1";
    public static final Logger logger = Logger.getLogger(FiniteTorches.MODID);
    public static CreativeTabs creativeTab = new FiniteCreativeTab("finiteCreativeTab");
    public static SimpleNetworkWrapper network;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        FiniteTorches.logger.log(Level.INFO, MODID + " initiating");
        FiniteTorches.logger.log(Level.INFO, MODID + " registering blocks");
        this.registerBlocks();
        FiniteTorches.logger.log(Level.INFO, MODID + " done initiating");
        this.network = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);
        FiniteTorches.logger.log(Level.INFO, MODID + " retrieved network wrapper");
    }
    
    public void registerBlocks() {
    	GameRegistry.registerBlock(new BlockLitTorch(), "litTorch");
        FiniteTorches.logger.log(Level.INFO, MODID + " blocks registered");
    }
}
