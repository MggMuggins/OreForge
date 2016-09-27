package com.oreforge.oreforge.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.oreforge.oreforge.OEReference;
//import com.oreforge.oreforge.tabs.ModTabs;

public class ItemOF extends Item {
	
	public ItemOF(String name)
	{
		super();
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName(name);
		this.setTextureName(OEReference.MODID + ":" + name);
	}

}
