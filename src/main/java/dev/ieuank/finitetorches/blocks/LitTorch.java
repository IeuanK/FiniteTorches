package dev.ieuank.finitetorches.blocks;

import net.minecraft.block.BlockTorch;
import dev.ieuank.finitetorches.FiniteTorches;

public class LitTorch extends BlockTorch
{

	public LitTorch() 
    {
		setBlockName(FiniteTorches.MODID + ":torch");
		setCreativeTab(FiniteTorches.creativeTab);
		setHardness(0F);
		setBlockTextureName("torch_on");
    }
}
