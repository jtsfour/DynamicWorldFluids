package com.jtsfour.dwfluid.block;

import com.jtsfour.dwcore.block.DWBlock;
import com.jtsfour.dwcore.block.DWBlockHandler;
import com.jtsfour.dwcore.item.DWItemBlock;
import com.jtsfour.dwcore.item.DWItemHandler;
import com.jtsfour.dwcore.tileentity.DWTileEntityHandler;
import com.jtsfour.dwfluid.item.FluidStillBlockItem;
import com.jtsfour.dwfluid.tileentity.FluidStillEntity;

import net.minecraft.block.material.Material;

public class DWFluidBlocks {
	
	public static Material DYNAMICFLUID = new FluidMaterial();
	
	private static DWBlock fluid_still;
	private static DWItemBlock fluid_still_item;
	
	
	public static void preInit(){
		fluid_still = new FluidStillBlock();
		fluid_still_item = new FluidStillBlockItem(fluid_still);
		DWBlockHandler.addBlock(fluid_still);
		DWItemHandler.addItemBlock(fluid_still_item);
		DWTileEntityHandler.addTileEntity(FluidStillEntity.class, fluid_still.getName());
	}
}
