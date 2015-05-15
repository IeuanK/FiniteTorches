package dev.ieuank.handles;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class FiniteCreativeTab extends CreativeTabs
{

	public FiniteCreativeTab(String label)
	{
		super(label);
		setNoScrollbar();
	}

	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(Blocks.torch);
	}
	
}
