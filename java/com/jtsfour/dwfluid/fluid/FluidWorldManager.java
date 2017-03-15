package com.jtsfour.dwfluid.fluid;

import net.minecraft.world.World;

public class FluidWorldManager {
	
	private FluidManager MANAGER;
	private World WORLD;
	
	
	public FluidWorldManager(FluidManager man, World world){
		MANAGER=man;
		WORLD=world;
	}
}
