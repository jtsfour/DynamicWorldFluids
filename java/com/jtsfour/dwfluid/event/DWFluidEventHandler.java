package com.jtsfour.dwfluid.event;

import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.event.world.WorldEvent;
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
	
	@SubscribeEvent()
	public void onWorldLoad(WorldEvent.Load e){
		if(!e.getWorld().isRemote){
			System.out.println("JGJGJGJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ");
		}
	}
	
	//custom swimming handler
	@SubscribeEvent()
	public void livingUpdate(LivingEvent.LivingUpdateEvent e){
		if(!e.getEntity().getEntityWorld().isRemote){
			
		}
	}
	
	@SubscribeEvent()
	public void water(BlockEvent.CreateFluidSourceEvent e){
		//e.getWorld().setBlockState(e.getPos(), e.getState().getBlock().getStateFromMeta(5));
	}
}