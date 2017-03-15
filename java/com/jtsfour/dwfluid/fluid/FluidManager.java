package com.jtsfour.dwfluid.fluid;

import java.util.ArrayList;

import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class FluidManager {
	
	public static FluidManager instance;
	
	public static ArrayList<FluidWorldManager> world_managers = new ArrayList<FluidWorldManager>();
	public static ArrayList<Integer> loaded_dimensions = new ArrayList<Integer>();
	
	public FluidManager(){
		instance = this;
	}
	
	
	public boolean addWorld(World world){
		if(loaded_dimensions.contains(world.provider.getDimension())){
			loaded_dimensions.add(world.provider.getDimension());
			world_managers.add(new FluidWorldManager(this, world));
			return true;
		}
		return false;
	}
	
	//loads fluid pools and checks for dwfluid flags and generally fixes the chunk for use with dwfluid
	public void loadChunk(Chunk chunk){
		
	}
	
	
}
