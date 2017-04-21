package com.oreforge.oreforge.item;

import com.oreforge.oreforge.tabs.OFTabs;
import net.minecraft.item.ItemPickaxe;
import com.oreforge.oreforge.OFReference;

public class OFItemHammer extends ItemPickaxe {

	public OFItemHammer(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(OFTabs.tabOreForge);
		this.setTextureName(OFReference.MODID + ":" + unlocalizedName);
	}


}
