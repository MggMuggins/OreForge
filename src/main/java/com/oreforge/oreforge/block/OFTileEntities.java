package com.oreforge.oreforge.block;

import cpw.mods.fml.common.registry.GameRegistry;

public class OFTileEntities {
    //Initiliaze all tile entities here
    public static void init() {
        GameRegistry.registerTileEntity(ForgeTileEntity.class, "forge");
    }
}
