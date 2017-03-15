package com.jtsfour.dwfluid.client;

import com.jtsfour.dwfluid.DWFluidCommonProxy;
import com.jtsfour.dwfluid.client.render.block.DWFluidTileEntitySpecialRenderers;

public class DWFluidClientProxy extends DWFluidCommonProxy {

	public DWFluidClientProxy() {
		super();
		
	}
	
	public void preInit(){
		super.preInit();
		DWFluidTileEntitySpecialRenderers.preInit();
	}
	
	public void init(){
		super.init();
	}
	
	public void postInit(){
		super.postInit();
		
	}

}
