package com.themastergeneral.compressedblocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class CompressedDiamond2x extends Block {
	public CompressedDiamond2x()
	{
		super(Material.iron);
		setBlockName(CompressedBlocks.MODID + "_" + "CompressedDiamond2X");
		setBlockTextureName(CompressedBlocks.MODID + ":" + "CompressedDiamond2X");
		setLightLevel(0.0F);
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe", 2);
	}
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List list, boolean flag) 
	{
		list.add("6,561 Diamonds");
	}
}
