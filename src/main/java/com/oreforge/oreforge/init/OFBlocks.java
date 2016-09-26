package com.oreforge.oreforge.init;

import net.minecraft.block.Block;
import com.oreforge.oreforge.blocks.BlockOF;
import com.oreforge.oreforge.helpers.RegisterHelper;

public class OFBlocks {
	
	public static Block floor = new BlockOF("floor");
	
	public static void registerBlocks()
	{
		RegisterHelper.registerBlock(floor);
	}

}
