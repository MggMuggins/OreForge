package com.oreforge.oreforge;

import com.oreforge.oreforge.crafting.Recipes;
import com.oreforge.oreforge.init.OFBlocks;
import com.oreforge.oreforge.init.OFItems;
import com.oreforge.oreforge.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = OEReference.MODID, name = OEReference.NAME, version = OEReference.VERSION)
public class OreForge {
	
	@SidedProxy(clientSide = OEReference.CLIENT_PROXY, serverSide = OEReference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@Instance(OEReference.MODID)
	public static OreForge instance;
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		OFBlocks.registerBlocks();
		OFItems.registerItems();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		Recipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
