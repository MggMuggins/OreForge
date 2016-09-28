package com.oreforge.oreforge.blocks;

import net.minecraft.block.Block;
import com.oreforge.oreforge.helpers.RegisterHelper;

public class OFBlocks {
	
	public static Block floor = new OFFloor("floor");
	
	public static final void init()
	{
		RegisterHelper.registerBlock(floor);
	}
	
}
