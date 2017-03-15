package com.jtsfour.dwfluid.client.render.block;

import com.jtsfour.dwcore.client.render.block.DWTileEntityRendererHandler;
import com.jtsfour.dwcore.client.render.block.TestTileEntitySpecialRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class DWFluidTileEntitySpecialRenderers {
	
	
	
	public static TileEntitySpecialRenderer fluid_still_renderer;
	
	public static void preInit(){
		/*fluid_still_renderer = new TestTileEntitySpecialRenderer();
		DWTileEntityRendererHandler.addRenderer(FluidStillEntity.class, fluid_still_renderer);
		*/
	}
}
