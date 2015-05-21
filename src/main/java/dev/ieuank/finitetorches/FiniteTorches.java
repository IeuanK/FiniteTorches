package dev.ieuank.finitetorches;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.minecraftforge.common.MinecraftForge;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FiniteTorches.MODID, version = FiniteTorches.VERSION)
public class FiniteTorches
{
    public static final String MODID = "finitetorches";
    public static final String VERSION = "0.1";
    public static final Logger logger = Logger.getLogger(FiniteTorches.MODID);
    public BlockList bL;
    public ArrayList<String> forbiddenBlocks;
    
    /*@EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        String blockList = null;
		try {
			FH.appendFile("", "FiniteTorches_blockList.json");
			FH.readFile("FiniteTorches_blockList.json");
		}catch (IOException e){e.printStackTrace();}
		
		JsonArray blocks = null;
		try {
			blocks = (JsonArray) new JsonParser().parse(blockList);
		} catch (Exception e) {e.printStackTrace();}
		
		if(blocks == null)
			blocks = new JsonArray();
		
		for(Object o : blocks) {
			String ob = (String) o;
			forbiddenBlocks.add(ob);
		}
		
		try{
			FH.writeFile(blocks.toString(), "FiniteTorches_blockList.json");
		}catch (IOException e){e.printStackTrace();}
    }*/
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        FiniteTorches.logger.log(Level.INFO, MODID + " initiating");
        MinecraftForge.EVENT_BUS.register(new FTEventHandler(this));
		
    }
}
