package com.jtsfour.dwfluid.client.render.block;

import com.jtsfour.dwfluid.tileentity.FluidStillEntity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class FluidStillRenderer extends TileEntitySpecialRenderer {
	
	
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float partialTick, int destroyStage) {
		 	/*if(te instanceof FluidStillEntity){
		 		if(((FluidStillEntity)te).shouldBlockBeRendered()){
		 			GlStateManager.pushMatrix();
		 			GlStateManager.translate(x, y, z);
		 			VertexBuffer vb = Tessellator.getInstance().getBuffer();
		    
		 			vb.begin(7, DefaultVertexFormats.POSITION_TEX);
		 			Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("dwcore:textures/blocks/dwcore_testtileentity_side_0.png"));

		 			vb.pos(1.0, 1.0, 0.0).tex(1.0, 0.0).endVertex();
		 			vb.pos(0.0, 1.0, 0.0).tex(0.0, 0.0).endVertex();
		 			vb.pos(0.0, 1.0, 1.0).tex(0.0, 1.0).endVertex();
		 			vb.pos(1.0, 1.0, 1.0).tex(1.0, 1.0).endVertex();
		 			GlStateManager.rotate(35F, 1F, 0F, 0F);
		 			GlStateManager.scale(0.5F, 0.5F, 1F);
		 			Tessellator.getInstance().draw();
		 			GlStateManager.popMatrix();
		 		}
		 		return;
		 	}else{
		 		return;
		 	}*/
		
			GlStateManager.pushMatrix();
			GlStateManager.translate(x, y, z);
			VertexBuffer vb = Tessellator.getInstance().getBuffer();

			vb.begin(7, DefaultVertexFormats.POSITION_TEX);
			Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("dwcore:textures/blocks/dwcore_testtileentity_side_0.png"));

			vb.pos(1.0, 1.0, 0.0).tex(1.0, 0.0).endVertex();
			vb.pos(0.0, 1.0, 0.0).tex(0.0, 0.0).endVertex();
			vb.pos(0.0, 1.0, 1.0).tex(0.0, 1.0).endVertex();
			vb.pos(1.0, 1.0, 1.0).tex(1.0, 1.0).endVertex();
			GlStateManager.rotate(35F, 1F, 0F, 0F);
			GlStateManager.scale(0.5F, 0.5F, 1F);
			Tessellator.getInstance().draw();
			GlStateManager.popMatrix();
			
	}
}
