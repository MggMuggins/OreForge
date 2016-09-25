package com.oreforge.oreforge;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import com.oreforge.oreforge.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = OEReference.MODID, name = OEReference.NAME, version = OEReference.VERSION)
public class OreForge {
	
	@SidedProxy(clientSide = OEReference.CLIENT_PROXY, serverSide = OEReference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@Instance(OEReference.MODID)
	public static OreForge instance;
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
