package com.oreforge.oreforge;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = OFReference.MODID, name = OFReference.NAME, version = OFReference.VERSION)
public class OreForge {
	
	@SidedProxy(clientSide = OFReference.CLIENT_PROXY, serverSide = OFReference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@Instance(OFReference.MODID)
	public static OreForge instance;
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}
