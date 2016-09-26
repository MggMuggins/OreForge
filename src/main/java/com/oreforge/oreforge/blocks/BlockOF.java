package com.oreforge.oreforge.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import com.oreforge.oreforge.OEReference;

public class BlockOF extends Block{
	public BlockOF(String name)
	{
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setBlockName(name);
		this.setBlockTextureName(OEReference.MODID + ":" + name);
	}

}
