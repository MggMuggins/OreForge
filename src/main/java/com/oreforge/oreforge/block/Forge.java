package com.oreforge.oreforge.block;

import net.minecraft.tileentity.TileEntity;

public class Forge extends TileEntity {
	/*
	private boolean hasMaster, isMaster;
	private int masterX, masterY, masterZ;
	
	@Override
	public void updateEntity() {
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound data) {
		super.writeToNBT(data);
		data.setInteger("masterX", masterX);
		data.setInteger("masterY", masterY);
		data.setInteger("masterZ", masterZ);
		data.setBoolean("hasMaster", hasMaster);
		data.setBoolean("isMaster", isMaster);
		
		if (hasMaster() && isMaster()) {
			//Any other values should ONLY BE SAVED TO THE MASTER
		}
	}
	
	@Override
	public void readFromNBT(NBTTagCompound data) {
		super.readFromNBT(data);
        masterX = data.getInteger("masterX");
        masterY = data.getInteger("masterY");
        masterZ = data.getInteger("masterZ");
        hasMaster = data.getBoolean("hasMaster");
        isMaster = data.getBoolean("isMaster");
        
        if (hasMaster() && isMaster()) {
			//Any other values should ONLY BE SAVED TO THE MASTER
		}
	}
	
	public boolean hasMaster() {
		return hasMaster;
	}
	
	public boolean isMaster() {
		return isMaster;
	}
	
	public int getMasterX() {
        return masterX;
    }

    public int getMasterY() {
        return masterY;
    }

    public int getMasterZ() {
        return masterZ;
    }
    
    public void setHasMaster (boolean bool) {
    	hasMaster = bool;
    }
    
    public void setIsMaster (boolean bool) {
    	isMaster = bool;
    }
    
    public void setMasterCoords(int x, int y, int z) {
    	masterX = x;
    	masterY = y;
    	masterZ = z;
    }
    
    
    
    public boolean checkMultiBlockForm() {
    	int i = 0;
    	//Apparently this code scans in a 3x3 area starting with the bottom left corner
    	//We'll change this so that it only checks for our tileEntity next to it
    	for (int x = xCoord - 1; x < xCoord + 2; x++)
    		for (int y = yCoord; y < yCoord + 3; y++)
    			for (int z = zCoord - 1; z < zCoord +2; z++) {
    				TileEntity tile = worldObj.getBlockTileEntity(x, y, z);
    				//Makes sure tile isn't null, is an instance of the same Tile, and isn't already part of a multiblock
    				if (tile != null && (tile instanceof TileMultiBlock)) {
    					if (this.isMaster()) {
    						if (((TileMultiBlock)tile).hasMaster())
    						 i++;
    					} else if (!((TileMultiBlock)tile).hasMaster())
    						i++;
    				}
    			}
    	//if cd=ef gh=ik then cd+gf=ef+ik
    	return i > 25 && worldObj.isAirBlock(xCoord, yCoord + 1, zCoord);
    }
    
    public void setupStructure() {
    	for (int x = xCoord - 1; x < xCoord + 2; x++)
    		for (int y = yCoord; y < yCoord + 3; y++)
    			for (int z = zCoord - 1; z < zCoord + 2; z++) {
    				TileEntity tile = worldObj.getBlockTileEntity(x, y, z);
    				//Checks if block is bottom center
    				boolean master = (x == xCoord && y == yCoord && z == zCoord);
    				if (tile != null && (tile instanceof TileMultiBlock)) {
    					((TileMultiBlock) tile).setMasterCoords(xCoord, yCoord, zCoord);
    					((TileMultiBlock) tile).setHasMaster(true);
    					((TileMultiBlock) tile).setIsMaster(master);
    				}
    			}
    }
    
    public void reset() {
    	masterX = 0;
    	masterY = 0;
    	masterZ = 0;
    	hasMaster = false;
    	isMaster = false;
    }
    
    public boolean checkForMaster() {
    	TileEntity tile = worldObj.getBlockTileEntity(masterX, masterY, masterZ);
    	return (tile != null && (tile instanceof TileMultiBlock));
    }
    
    public void resetStructure() {
    	for (int xCoord -1; x < xCoord + 2; x++)
    		for (int y = yCoord; y < yCoord + 3; y++)
    			for (int z = zCoord - 1; z < zCoord + 2; z++) {
    				TileEntity tile = worldObj.getBlockTileEntity(x, y, z);
    				if (tile != null && (tile instanceof TileMultiBlock))
    					((TileMultiBlock) tile).reset();
    			}
    }
	*/
}
