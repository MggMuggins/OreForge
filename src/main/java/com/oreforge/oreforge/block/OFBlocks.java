package com.oreforge.oreforge.block;

import net.minecraft.block.Block;
import com.oreforge.oreforge.helpers.RegisterHelper;

public final class OFBlocks {
	
	public static Block floor = new OFFloor("floor");
	
	public static final void init()
	{
		RegisterHelper.registerBlock(floor);
	}
	
}
