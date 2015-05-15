package dev.ieuank.finitetorches.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class LitTorch extends BlockTorch
{
	public static final Block litTorch = new LitTorch()
	.setHardness(0.5F).setBlockName("litTorch").setCreativeTab(CreativeTabs.tabTools).setBlockName("Lit Torch");

	public LitTorch() 
    {
		
    }
}
