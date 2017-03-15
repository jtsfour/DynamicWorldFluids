package com.jtsfour.dwfluid;

import com.jtsfour.dwfluid.block.DWFluidBlocks;
import com.jtsfour.dwfluid.event.DWFluidEventHandler;
import com.jtsfour.dwfluid.fluid.FluidRegisterHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class DWFluidCommonProxy {
	
	public DWFluidCommonProxy(){
		
	}
	
	public void preInit(){
		DWFluidEventHandler handler = new DWFluidEventHandler();
		MinecraftForge.EVENT_BUS.register(handler);
		FluidRegisterHandler.preInit();
		
		DWFluidBlocks.preInit();
		//FMLCommonHandler.instance().bus().register(handler);
	}
	
	public void init(){
		
	}
	
	public void postInit(){
		FluidRegisterHandler.postInit();
	}
}
