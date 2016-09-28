package com.oreforge.oreforge.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.oreforge.oreforge.OFReference;

public class OFFloor extends Block{

	public OFFloor(String unlocalizedName)
	{
		super(Material.rock);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(OFReference.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setStepSound(soundTypeStone);
		this.setHardness(2.5F);
		this.setResistance(10);
		this.setHarvestLevel("pickaxe", 1);
	}

}
