package com.jtsfour.dwfluid.block;

import com.jtsfour.dwcore.block.DWBlock;
import com.jtsfour.dwcore.item.DWCoreItems;
import com.jtsfour.dwfluid.DynamicWorldFluid;
import com.jtsfour.dwfluid.tileentity.FluidStillEntity;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FluidStillBlock extends DWBlock implements ITileEntityProvider {

	public FluidStillBlock() {
		super("dynamicfluid", DWFluidBlocks.DYNAMICFLUID, DynamicWorldFluid.MODID);
		this.setCreativeTab(DWCoreItems.DWCoreTab);
		this.isBlockContainer=true;
		//this.isEn
	}
	
	@Override
	public Boolean isEntityInsideMaterial(IBlockAccess world, BlockPos pos, IBlockState state, Entity entity, double y, Material material, boolean testingHead){
		/*if(material instanceof MaterialLiquid){
			//System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPpp");
			return true;
		}
		*/
		if(material.equals(Material.WATER)){
			return true;
		}
		return false;
	}
	
	/*@Override
	public boolean canCollideCheck(IBlockState state, boolean hitIfLiquid){
        //return hitIfLiquid && ((Integer)state.getValue(LEVEL)).intValue() == 0;
		return false;
	}*/
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos){
		return null;
		
	}
	
	@Override
	public boolean isFullCube(IBlockState state){
		return false;
	}
	
	@Override
	public boolean isCollidable(){
		return false;
	}
	
	@Override
	@Deprecated
	public boolean isOpaqueCube(IBlockState state){
		return false;
	}
	
	@Override
	 public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.INVISIBLE;
	 }

	@Override
	public TileEntity createNewTileEntity(World world, int meta){
		return new FluidStillEntity(meta);
		
	}
	
	@Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        super.breakBlock(world, pos, state);
        world.removeTileEntity(pos);
    }
	
	@Override
	@Deprecated
    public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int id, int param){
        super.eventReceived(state, worldIn, pos, id, param);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(id, param);
    }

}
