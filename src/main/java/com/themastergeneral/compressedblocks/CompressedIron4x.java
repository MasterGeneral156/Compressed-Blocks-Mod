package com.themastergeneral.compressedblocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class CompressedIron4x extends Block {
	public CompressedIron4x()
	{
		super(Material.iron);
		setBlockName(CompressedBlocks.MODID + "_" + "CompressedIron4X");
		setBlockTextureName(CompressedBlocks.MODID + ":" + "CompressedIron4X");
		setLightLevel(0.0F);
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe", 1);
	}
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List list, boolean flag) 
	{
		list.add("59,049 Iron Ingots");
	}
}
