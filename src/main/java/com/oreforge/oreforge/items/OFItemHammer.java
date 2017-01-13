package com.oreforge.oreforge.items;

import net.minecraft.item.ItemPickaxe;
import com.oreforge.oreforge.OFReference;

public class OFItemHammer extends ItemPickaxe {

	public OFItemHammer(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(OFReference.MODID + ":" + unlocalizedName);
	}


}
