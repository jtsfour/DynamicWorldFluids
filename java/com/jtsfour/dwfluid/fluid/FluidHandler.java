package com.jtsfour.dwfluid.fluid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidHandler {
	
	private static Map<String, DynamicFluid> reg_fluids = new HashMap<String, DynamicFluid>();
	
	public FluidHandler(){
		
	}
	
	public void postInit(){
		ArrayList<Fluid> fluids = new ArrayList<Fluid>(FluidRegistry.getRegisteredFluids().values());
		for(int i=0;i<fluids.size();i++){
			addDynamicFluid(new DynamicFluid(fluids.get(i)));
		}
	}
	
	public void addDynamicFluid(DynamicFluid fluid){
		reg_fluids.put(fluid.getFluid().getUnlocalizedName(), fluid);
	}
	
	public void fixBlock(){
		
	}
	
	public void fixChunk(Chunk chunk, NBTTagCompound tag){
		
	}

}
