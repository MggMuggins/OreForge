package com.oreforge.oreforge.item;

import com.oreforge.oreforge.tabs.OFTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import com.oreforge.oreforge.OFReference;
import com.oreforge.oreforge.helpers.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;

public class OFItems {
	
	public static Item hammer;
	public static Item tongs;
	
	public static final void init()
	{
		tongs = new Item()
				.setUnlocalizedName("tongs")
				.setCreativeTab(OFTabs.tabOreForge)
				.setTextureName(OFReference.MODID + ":" + "tongs");
		RegisterHelper.registerItem(tongs);

        hammer = new OFItemHammer("hammer", IRON);
		GameRegistry.registerItem(hammer, "hammer");
	}
	
	//public static Item IRON;
	
	public static ToolMaterial IRON = EnumHelper.addToolMaterial("IRON", 2, 399, 6.0F, 2.0F, 0);

}
