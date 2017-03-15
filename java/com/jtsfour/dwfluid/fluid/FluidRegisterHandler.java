package com.jtsfour.dwfluid.fluid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.jtsfour.dwfluid.DynamicWorldFluid;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidRegisterHandler {
	
	//Map of all Dynamic Fluids
	private static Map<String, DynamicFluid> reg_fluids = new HashMap<String, DynamicFluid>();
	
	//list of all fluids registered to minecraft
	private static ArrayList<String> fluid_list = new ArrayList<String>();
	
	public FluidRegisterHandler(){
		
	}
	
	public static void preInit(){
		
	}
	
	public static void postInit(){
		ArrayList<Fluid> fluids = new ArrayList<Fluid>(FluidRegistry.getRegisteredFluids().values());
		try{
			DynamicWorldFluid.DWFluidCONFIG.load();
			for(int i=0;i<fluids.size();i++){
				fluid_list.add(fluids.get(i).getUnlocalizedName());
				addDynamicFluid(new DynamicFluid(fluids.get(i), DynamicWorldFluid.DWFluidCONFIG.getBoolean(fluid_list.get(i), "fluids_to_override", (fluid_list.get(i).equals(FluidRegistry.WATER.getUnlocalizedName()) || fluid_list.get(i).equals(FluidRegistry.LAVA.getUnlocalizedName()) ? true : false), "Should DynamicWorldFluids Override?")));
			}
		}catch(Exception e){
			
		}finally{
			DynamicWorldFluid.DWFluidCONFIG.save();
		}
	}
	
	private static void addDynamicFluid(DynamicFluid fluid){
		reg_fluids.put(fluid.getFluid().getUnlocalizedName(), fluid);
	}
	
	public static boolean isFluidOverrided(String fluid){
		if(reg_fluids.containsKey(fluid)){
			return reg_fluids.get(fluid).isRegistered();
		}
		return false;
	}
	
	public static DynamicFluid getDynamicFluid(String fluid){
		return reg_fluids.get(fluid);
	}
	
	

}