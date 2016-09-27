package com.oreforge.oreforge.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.oreforge.oreforge.OEReference;

public class OFFloor extends Block{
	public OFFloor(String name)
	{
		super(Material.rock);
		this.setBlockName(name);
		this.setBlockTextureName(OEReference.MODID + ":" + name);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setStepSound(soundTypeStone);
		this.setHardness(2.5F);
		this.setResistance(10);
		this.setHarvestLevel("pickaxe", 1);
	}

}
