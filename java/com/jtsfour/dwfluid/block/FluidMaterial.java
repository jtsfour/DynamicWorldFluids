package com.jtsfour.dwfluid.block;

import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class FluidMaterial extends Material {

	public FluidMaterial() {
		super(MapColor.WATER);
	}
	
	@Override
	public boolean blocksMovement(){
		return false;
	}
	
	@Override
	public EnumPushReaction getMobilityFlag(){
		return EnumPushReaction.DESTROY;
	}
	
	@Override
	public boolean isLiquid(){
		return true;
	}
	
	@Override
	public boolean isOpaque(){
		return false;
	}
	
	@Override
	public boolean isReplaceable(){
		return true;
	}
	
	@Override
	public boolean isSolid(){
		return false;
	}
	
	

}
