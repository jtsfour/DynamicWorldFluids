package com.jtsfour.dwfluid.fluid;

import net.minecraftforge.fluids.Fluid;

public class DynamicFluid {
	
	private Fluid FLUID;
	
	private boolean REGISTERED;
	
	private float visibility = 0F;
	private int siltColor = 0;
	private boolean replace = true;
	
	public DynamicFluid(Fluid fluid, boolean reg){
		FLUID=fluid;
		REGISTERED=reg;
	}
	
	public void setForceReplace(boolean b0){
		replace=b0;
	}
	
	/*
	 * @ return whether or not the fluid handler should force all fluids placed to be the DynamicFluids version of it
	 */
	public boolean getForceReplace(){
		return replace;
	}
	
	public Fluid getFluid(){
		return FLUID;
	}
	
	public void setVisibility(float vis){
		visibility=vis;
	}
	
	public float getVisibility(){
		return visibility;
	}
	
	public void setSiltColor(int color){
		siltColor=color;
	}
	
	public int getSiltColor(){
		return siltColor;
	}
}
