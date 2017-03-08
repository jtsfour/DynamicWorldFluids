package com.jtsfour.dwfluid;

import com.jtsfour.dwfluid.event.DWFluidEventHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class DWFluidCommonProxy {
	
	public DWFluidCommonProxy(){
		
	}
	
	public void preInit(){
		DWFluidEventHandler handler = new DWFluidEventHandler();
		MinecraftForge.EVENT_BUS.register(handler);
		//FMLCommonHandler.instance().bus().register(handler);
	}
	
	public void init(){

	}
	
	public void postInit(){
		
	}
}
