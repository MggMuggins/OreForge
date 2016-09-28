package com.oreforge.oreforge.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import com.oreforge.oreforge.init.OFBlocks;
import com.oreforge.oreforge.items.OFItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init()
	{
		GameRegistry.addShapedRecipe(new ItemStack(OFItems.hammer), new Object[]
		{
			"ABA",
			"ABA",
			" B ",
			'A', Items.iron_ingot,
			'B', Items.stick,
		});
		GameRegistry.addShapedRecipe(new ItemStack(OFBlocks.floor), new Object[]
		{
			"AAA",
			"AAA",
			"AAA",
			'A', Blocks.cobblestone,
		});
	}

}
