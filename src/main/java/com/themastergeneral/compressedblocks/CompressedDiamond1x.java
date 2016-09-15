package com.themastergeneral.compressedblocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class CompressedDiamond1x extends Block {
	public CompressedDiamond1x()
	{
		super(Material.iron);
		setBlockName(CompressedBlocks.MODID + "_" + "CompressedDiamond1X");
		setBlockTextureName(CompressedBlocks.MODID + ":" + "CompressedDiamond1X");
		setLightLevel(0.0F);
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe", 2);
	}
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List list, boolean flag) 
	{
		list.add("81 Diamonds");
	}
}
