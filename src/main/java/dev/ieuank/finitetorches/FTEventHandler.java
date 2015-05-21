package dev.ieuank.finitetorches;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayer.EnumStatus;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class FTEventHandler
{
	private FiniteTorches finiteTorches;
	
	public FTEventHandler(FiniteTorches fT) {
		this.finiteTorches = fT;
	}
	
	public String getRandomMessage() {
		ArrayList<String> messages = new ArrayList<String>();
		messages.add("Imma eat your poop");
		messages.add("Stop or I will ban you");
		messages.add("We don't do that here you fucking scrub");
		messages.add("Don't even try");
		messages.add("Massive hairy dicks");
		
		Random rand = new Random();
		return messages.get(rand.nextInt(messages.size()));
	}
	
	/*@EventHandler
	public void playerInteracted(PlayerInteractEvent event) {
		
	}*/
	public void sendMessage(EntityPlayer p, String m) {
		p.addChatComponentMessage(new ChatComponentText(m));
	}

	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void playerSleepInBed(PlayerSleepInBedEvent event) {
        EnumStatus stats = EnumStatus.OTHER_PROBLEM;
        if(FMLCommonHandler.instance().getEffectiveSide().isServer()) {
        	sendMessage(event.entityPlayer, getRandomMessage());
			event.result = stats;
        } else if(FMLCommonHandler.instance().getEffectiveSide().isClient()){
        	event.result = stats;
        }
	}
	
	/*@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void playerInteract(PlayerInteractEvent event) {
		EnumStatus stats = EnumStatus.OTHER_PROBLEM;
		if(event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) {
			if(event.entityPlayer.getHeldItem() != null) {
				ItemStack item = event.entityPlayer.getHeldItem();
				sendMessage(event.entityPlayer, item.getItem().getUnlocalizedName());
				if(this.finiteTorches.forbiddenBlocks.contains(item.getUnlocalizedName())) {
					if(event.isCancelable()) {
						event.setCanceled(true);
					}
					event.useBlock = Result.DENY;
					event.useItem = Result.DENY;
				}
			}
		}
	}*/
}
