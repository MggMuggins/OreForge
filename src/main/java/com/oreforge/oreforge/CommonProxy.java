package com.oreforge.oreforge;

import com.oreforge.oreforge.blocks.OFBlocks;
import com.oreforge.oreforge.crafting.Recipes;
import com.oreforge.oreforge.items.OFItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
  
  public void preInit(FMLPreInitializationEvent event) {
    OFBlocks.init();
    OFItems.init();
  }
  
  public void init(FMLInitializationEvent event) {
    Recipes.init();
  }
  
  public void postInit(FMLPostInitializationEvent event) {
    
  }
}
