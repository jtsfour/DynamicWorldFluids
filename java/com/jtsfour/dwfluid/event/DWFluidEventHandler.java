package com.jtsfour.dwfluid.event;

import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidRegistry.FluidRegisterEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DWFluidEventHandler {
	
	
	public DWFluidEventHandler(){
		
	}
	
	@SubscribeEvent()
	public void onFluidRegister(FluidRegisterEvent e){
		System.out.println(e.getFluidName());
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
	}
	
	@SubscribeEvent()
	public void onChunkLoad(ChunkDataEvent.Load e){
		
		//System.out.println(e.getData().getInteger("DataVersion"));
	}
}
