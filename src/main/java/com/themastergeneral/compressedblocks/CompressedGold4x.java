package com.themastergeneral.compressedblocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class CompressedGold4x extends Block {
	public CompressedGold4x()
	{
		super(Material.iron);
		setBlockName(CompressedBlocks.MODID + "_" + "CompressedGold4X");
		setBlockTextureName(CompressedBlocks.MODID + ":" + "CompressedGold4X");
		setLightLevel(0.0F);
		setStepSound(soundTypeMetal);
		setHardness(3.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe", 2);
	}
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List list, boolean flag) 
	{
		list.add("59,049 Gold Ingots");
	}
}
