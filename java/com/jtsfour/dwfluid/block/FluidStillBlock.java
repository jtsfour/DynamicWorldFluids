package com.jtsfour.dwfluid.block;

import com.jtsfour.dwcore.block.DWBlock;
import com.jtsfour.dwfluid.tileentity.FluidStillEntity;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FluidStillBlock extends DWBlock implements ITileEntityProvider {

	public FluidStillBlock() {
		super("dynamicfluid", Material.WATER);
		this.isBlockContainer=true;
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
