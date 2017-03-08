package com.jtsfour.dwfluid.tileentity;

import com.jtsfour.dwcore.tileentity.DWTileEntity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

public class FluidStillEntity extends DWTileEntity {
	
	public ResourceLocation tex_still = null;
	public boolean hasFluid = false; 
	
	
	public FluidStillEntity(int level){
		
	}
	
	public void readFromNBT(NBTTagCompound tag){
		
	}
	
	public NBTTagCompound writeToNBT(NBTTagCompound tag){
		return tag;
	}
	
	
}
