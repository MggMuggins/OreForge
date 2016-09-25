package com.oreforge.oreforge.init;

import net.minecraft.item.Item;

import com.oreforge.oreforge.helpers.RegisterHelper;
import com.oreforge.oreforge.items.ItemOF;

public class OFItems {
	
	public static Item hammer = new ItemOF("hammer");
	
	public static void registerItems()
	{
		RegisterHelper.registerItem(hammer);
	}

}
