package dev.ieuank.finitetorches.blocks;

import net.minecraft.block.BlockTorch;
import dev.ieuank.finitetorches.FiniteTorches;

public class BlockLitTorch extends BlockTorch
{

	public BlockLitTorch() 
    {
		setBlockName(FiniteTorches.MODID + ":torch");
		setCreativeTab(FiniteTorches.creativeTab);
		setHardness(0F);
		setBlockTextureName("torch_on");
    }
}
