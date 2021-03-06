package com.jtsfour.dwfluid;

import com.jtsfour.dwfluid.client.DWFluidClientProxy;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DynamicWorldFluid.MODID, version = DynamicWorldFluid.VERSION)
public class DynamicWorldFluid
{
    public static final String MODID = "dwfluid";
    public static final String VERSION = "1.0";
    
    public static boolean ISCLIENT = false;
    
    @SidedProxy(clientSide = "com.jtsfour.dwfluid.client.DWFluidClientProxy",serverSide = "com.jtsfour.dwfluid.DWFluidCommonProxy")
    public static DWFluidCommonProxy proxy;
    
    @Mod.Instance("dwfluid")
    public static DynamicWorldFluid instance;
    
    static{
    	FluidRegistry.enableUniversalBucket();
    }
    
    public static Configuration DWFluidCONFIG;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	DWFluidCONFIG = new Configuration(event.getSuggestedConfigurationFile());
    	
    	DWFluidCONFIG.load();
    	
    	//config stuff
    	
    	//Property testprop = DWFluidCONFIG.get("TEST", "TESTBOOL", false);
    	//System.out.println(testprop.getBoolean());
    	DWFluidCONFIG.save();
    	
    	if(proxy instanceof DWFluidClientProxy){
    		ISCLIENT=true;
    	}
        proxy.preInit();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit();
    }
}
