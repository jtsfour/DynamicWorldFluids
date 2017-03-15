package com.jtsfour.dwfluid.fluid;

import java.util.ArrayList;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;

public class Pool {
	
	private World WORLD;
	private Lake LAKE;
	private FluidStack FLUID;
	private int ID;
	private int X;
	private int Z;
	private double surface;
	
	private int capacity;
	
	private ArrayList<BlockPos> BLOCKS;
	//NOTE CHANGE BLOCK STORAGE TO A LAYER BASED SYSTEM
	public Pool(World world, Lake lake, FluidStack fluid, int id, int x, int z, int y, int cap, ArrayList<BlockPos> blocks){
		WORLD=world;
		LAKE=lake;
		FLUID=fluid;
		ID=id;
		X=x;
		Z=z;
		surface=y;
		capacity=cap;
		BLOCKS=blocks;	
	}
	//updates everything
	public void updatePool(){
		
	}
	//updates the amount of blocks etc
	public void updateCapacity(){
		
	}
	//checks all borders for leaks
	public void updateBorders(){
		
	}
	
	/*public void addFluid(FluidStack fluid){
		
	}
	
	public FluidStack removeFluid(int amount){
		
	}
	
	//millibuckets per surface level of this Pool
	public int getMBAmountPerLevel(){
		int area=0;
		for(int i=0;i<BLOCKS.size();i++){
			if(BLOCKS.get(i).getY()==(int)Math.floor(surface)){
				area++;
			}
		}
		return (int)Math.floor(area*FluidManager.MBLEVEL);
	}*/
	
	
	
}
