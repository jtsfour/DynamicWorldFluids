package com.jtsfour.dwfluid.tileentity;

import com.jtsfour.dwcore.tileentity.DWTileEntity;
import com.jtsfour.dwfluid.block.FluidStillBlock;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

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
	
	/*public boolean shouldBlockBeRendered(){
		World world = this.getWorld();
		BlockPos pos = this.getPos();
		boolean flag=false;
		if(!(world.getBlockState(new BlockPos(pos.getX()+1,pos.getY(),pos.getZ())).getBlock() instanceof FluidStillBlock)){
			flag=true;
		}
		if(!(world.getBlockState(new BlockPos(pos.getX()-1,pos.getY(),pos.getZ())).getBlock() instanceof FluidStillBlock)){
			flag=true;
		}
		if(!(world.getBlockState(new BlockPos(pos.getX(),pos.getY()+1,pos.getZ())).getBlock() instanceof FluidStillBlock)){
			flag=true;
		}
		if(!(world.getBlockState(new BlockPos(pos.getX(),pos.getY()-1,pos.getZ())).getBlock() instanceof FluidStillBlock)){
			flag=true;
		}
		if(!(world.getBlockState(new BlockPos(pos.getX(),pos.getY(),pos.getZ()+1)).getBlock() instanceof FluidStillBlock)){
			flag=true;
		}
		if(!(world.getBlockState(new BlockPos(pos.getX(),pos.getY(),pos.getZ()-1)).getBlock() instanceof FluidStillBlock)){
			flag=true;
		}
		return !flag;
		
	}*/
	
	
}
