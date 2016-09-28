package com.oreforge.oreforge.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.oreforge.oreforge.OFReference;
import com.oreforge.oreforge.helpers.RegisterHelper;

public class OFItems {
	
	public static Item hammer;
	
	public static final void init()
	{
		hammer = new Item().setUnlocalizedName("hammer").setCreativeTab(CreativeTabs.tabTools).setTextureName(OFReference.MODID + ":" + "hammer");
		RegisterHelper.registerItem(hammer);
	}

}
