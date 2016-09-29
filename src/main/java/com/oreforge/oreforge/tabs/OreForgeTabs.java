package com.oreforge.oreforge.tabs;

import com.oreforge.oreforge.items.OFItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OreForgeTabs{
	public static final CreativeTabs tabOreForge = new CreativeTabs("oreForge")
	{
		@Override public Item getTabIconItem()
		{
			return OFItems.hammer;
		}
	};

}
