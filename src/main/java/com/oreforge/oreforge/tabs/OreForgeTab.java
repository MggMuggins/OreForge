package com.oreforge.oreforge.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OreForgeTab extends CreativeTabs{
	String name;
	
	public OreForgeTab(int par1, String par25tr)
	{
		super(par1, par25tr);
		this.name = par25tr;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return null;
	}

}
