package com.themastergeneral.compressedblocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid = CompressedBlocks.MODID, version = CompressedBlocks.VERSION, name = CompressedBlocks.MODNAME)
public class CompressedBlocks
{
	//Blocks
	public static Block CompressedIron1x;
	public static Block CompressedIron2x;
	public static Block CompressedIron3x;
	public static Block CompressedIron4x;
	public static Block CompressedIron5x;
	public static Block CompressedIron6x;
	
	public static Block CompressedGold1x;
	public static Block CompressedGold2x;
	public static Block CompressedGold3x;
	public static Block CompressedGold4x;
	public static Block CompressedGold5x;
	public static Block CompressedGold6x;
	
	public static Block CompressedDiamond1x;
	public static Block CompressedDiamond2x;
	public static Block CompressedDiamond3x;
	public static Block CompressedDiamond4x;
	public static Block CompressedDiamond5x;
	public static Block CompressedDiamond6x;
	
    public static final String MODID = "compressedblocks";
    public static final String VERSION = "1.0";
    public static final String MODNAME = "Compressed Blocks by TMG";
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	System.out.println("Starting up...");
    	CompressedIron1x = new CompressedIron1x();
    	GameRegistry.registerBlock(CompressedIron1x, "CompressedIron1X");
    	CompressedIron2x = new CompressedIron2x();
    	GameRegistry.registerBlock(CompressedIron2x, "CompressedIron2X");
    	CompressedIron3x = new CompressedIron3x();
    	GameRegistry.registerBlock(CompressedIron3x, "CompressedIron3X");
    	CompressedIron4x = new CompressedIron4x();
    	GameRegistry.registerBlock(CompressedIron4x, "CompressedIron4X");
    	CompressedIron5x = new CompressedIron5x();
    	GameRegistry.registerBlock(CompressedIron5x, "CompressedIron5X");
    	CompressedIron6x = new CompressedIron6x();
    	GameRegistry.registerBlock(CompressedIron6x, "CompressedIron6X");
    	
    	CompressedGold1x = new CompressedGold1x();
    	GameRegistry.registerBlock(CompressedGold1x, "CompressedGold1X");
    	CompressedGold2x = new CompressedGold2x();
    	GameRegistry.registerBlock(CompressedGold2x, "CompressedGold2X");
    	CompressedGold3x = new CompressedGold3x();
    	GameRegistry.registerBlock(CompressedGold3x, "CompressedGold3X");
    	CompressedGold4x = new CompressedGold4x();
    	GameRegistry.registerBlock(CompressedGold4x, "CompressedGold4X");
    	CompressedGold5x = new CompressedGold5x();
    	GameRegistry.registerBlock(CompressedGold5x, "CompressedGold5X");
    	CompressedGold6x = new CompressedGold6x();
    	GameRegistry.registerBlock(CompressedGold6x, "CompressedGold6X");
    	
    	CompressedDiamond1x = new CompressedDiamond1x();
    	GameRegistry.registerBlock(CompressedDiamond1x, "CompressedDiamond1X");
    	CompressedDiamond2x = new CompressedDiamond2x();
    	GameRegistry.registerBlock(CompressedDiamond2x, "CompressedDiamond2X");
    	CompressedDiamond3x = new CompressedDiamond3x();
    	GameRegistry.registerBlock(CompressedDiamond3x, "CompressedDiamond3X");
    	CompressedDiamond4x = new CompressedDiamond4x();
    	GameRegistry.registerBlock(CompressedDiamond4x, "CompressedDiamond4X");
    	CompressedDiamond5x = new CompressedDiamond5x();
    	GameRegistry.registerBlock(CompressedDiamond5x, "CompressedDiamond5X");
    	CompressedDiamond6x = new CompressedDiamond6x();
    	GameRegistry.registerBlock(CompressedDiamond6x, "CompressedDiamond6X");
    	
    	//Crafting
    	//Shaped recipes for compressed iron 1x.
    	GameRegistry.addRecipe(new ItemStack(CompressedIron1x), new Object[]{
    	    	"AAA",
    	    	"AAA",
    	    	"AAA",
    	    	'A', Blocks.iron_block
    	});
    	//Shapeless for compressed iron 1x to iron block
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.iron_block, 9), new Object[]
    		{
    			new ItemStack(CompressedIron1x)
    		});
    	//Shaped recipes for compressed iron 2x.
    	GameRegistry.addRecipe(new ItemStack(CompressedIron2x), new Object[]{
    	    	"AAA",
    	    	"AAA",
    	    	"AAA",
    	    	'A', CompressedIron1x
    	});
    	//Shapeless for compressed iron 3x to iron block
    	GameRegistry.addShapelessRecipe(new ItemStack(CompressedIron1x, 9), new Object[]
    		{
    			new ItemStack(CompressedIron2x)
    		});
    	//Shaped recipes for compressed iron 3x.
    	GameRegistry.addRecipe(new ItemStack(CompressedIron3x), new Object[]{
    	    	"AAA",
    	    	"AAA",
    	    	"AAA",
    	    	'A', CompressedIron2x
    	});
    	//Shapeless for compressed iron 3x to iron block
    	GameRegistry.addShapelessRecipe(new ItemStack(CompressedIron2x, 9), new Object[]
    		{
    			new ItemStack(CompressedIron3x)
    		});
    	//Shaped recipes for compressed iron 3x.
    	GameRegistry.addRecipe(new ItemStack(CompressedIron4x), new Object[]{
    	    	"AAA",
    	    	"AAA",
    	    	"AAA",
    	    	'A', CompressedIron3x
    	});
    	//Shapeless for compressed iron 3x to iron block
    	GameRegistry.addShapelessRecipe(new ItemStack(CompressedIron3x, 9), new Object[]
    		{
    			new ItemStack(CompressedIron4x)
    		});
    	//Shaped recipes for compressed iron 3x.
    	GameRegistry.addRecipe(new ItemStack(CompressedIron5x), new Object[]{
    	    	"AAA",
    	    	"AAA",
    	    	"AAA",
    	    	'A', CompressedIron4x
    	});
    	//Shapeless for compressed iron 3x to iron block
    	GameRegistry.addShapelessRecipe(new ItemStack(CompressedIron4x, 9), new Object[]
    		{
    			new ItemStack(CompressedIron5x)
    		});
    	//Shaped recipes for compressed iron 3x.
    	GameRegistry.addRecipe(new ItemStack(CompressedIron6x), new Object[]{
    	    	"AAA",
    	    	"AAA",
    	    	"AAA",
    	    	'A', CompressedIron5x
    	});
    	//Shapeless for compressed iron 3x to iron block
    	GameRegistry.addShapelessRecipe(new ItemStack(CompressedIron5x, 9), new Object[]
    		{
    			new ItemStack(CompressedIron6x)
    		});
    	
    	GameRegistry.addRecipe(new ItemStack(CompressedGold1x), new Object[]{
	    	"AAA",
	    	"AAA",
	    	"AAA",
	    	'A', Blocks.gold_block
	});
	//Shapeless for compressed iron 1x to iron block
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gold_block, 9), new Object[]
		{
			new ItemStack(CompressedGold1x)
		});
	//Shaped recipes for compressed iron 2x.
	GameRegistry.addRecipe(new ItemStack(CompressedGold2x), new Object[]{
	    	"AAA",
	    	"AAA",
	    	"AAA",
	    	'A', CompressedGold1x
	});
	//Shapeless for compressed iron 3x to iron block
	GameRegistry.addShapelessRecipe(new ItemStack(CompressedGold1x, 9), new Object[]
		{
			new ItemStack(CompressedGold2x)
		});
	//Shaped recipes for compressed iron 3x.
	GameRegistry.addRecipe(new ItemStack(CompressedGold3x), new Object[]{
	    	"AAA",
	    	"AAA",
	    	"AAA",
	    	'A', CompressedGold2x
	});
	//Shapeless for compressed iron 3x to iron block
	GameRegistry.addShapelessRecipe(new ItemStack(CompressedGold2x, 9), new Object[]
		{
			new ItemStack(CompressedGold3x)
		});
	//Shaped recipes for compressed iron 3x.
	GameRegistry.addRecipe(new ItemStack(CompressedGold4x), new Object[]{
	    	"AAA",
	    	"AAA",
	    	"AAA",
	    	'A', CompressedGold3x
	});
	//Shapeless for compressed iron 3x to iron block
	GameRegistry.addShapelessRecipe(new ItemStack(CompressedGold3x, 9), new Object[]
		{
			new ItemStack(CompressedGold4x)
		});
	//Shaped recipes for compressed iron 3x.
	GameRegistry.addRecipe(new ItemStack(CompressedGold5x), new Object[]{
	    	"AAA",
	    	"AAA",
	    	"AAA",
	    	'A', CompressedGold4x
	});
	//Shapeless for compressed iron 3x to iron block
	GameRegistry.addShapelessRecipe(new ItemStack(CompressedGold4x, 9), new Object[]
		{
			new ItemStack(CompressedGold5x)
		});
	//Shaped recipes for compressed iron 3x.
	GameRegistry.addRecipe(new ItemStack(CompressedGold6x), new Object[]{
	    	"AAA",
	    	"AAA",
	    	"AAA",
	    	'A', CompressedGold5x
	});
	//Shapeless for compressed iron 3x to iron block
	GameRegistry.addShapelessRecipe(new ItemStack(CompressedGold5x, 9), new Object[]
		{
			new ItemStack(CompressedGold6x)
		});
	
	///////////////////
	
			GameRegistry.addRecipe(new ItemStack(CompressedDiamond1x), new Object[]{
		    	"AAA",
		    	"AAA",
		    	"AAA",
		    	'A', Blocks.diamond_block
		});
		//Shapeless for compressed iron 1x to iron block
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block, 9), new Object[]
			{
				new ItemStack(CompressedDiamond1x)
			});
		//Shaped recipes for compressed iron 2x.
		GameRegistry.addRecipe(new ItemStack(CompressedDiamond2x), new Object[]{
		    	"AAA",
		    	"AAA",
		    	"AAA",
		    	'A', CompressedDiamond1x
		});
		//Shapeless for compressed iron 3x to iron block
		GameRegistry.addShapelessRecipe(new ItemStack(CompressedDiamond1x, 9), new Object[]
			{
				new ItemStack(CompressedDiamond2x)
			});
		//Shaped recipes for compressed iron 3x.
		GameRegistry.addRecipe(new ItemStack(CompressedDiamond3x), new Object[]{
		    	"AAA",
		    	"AAA",
		    	"AAA",
		    	'A', CompressedDiamond2x
		});
		//Shapeless for compressed iron 3x to iron block
		GameRegistry.addShapelessRecipe(new ItemStack(CompressedDiamond2x, 9), new Object[]
			{
				new ItemStack(CompressedDiamond3x)
			});
		//Shaped recipes for compressed iron 3x.
		GameRegistry.addRecipe(new ItemStack(CompressedDiamond4x), new Object[]{
		    	"AAA",
		    	"AAA",
		    	"AAA",
		    	'A', CompressedDiamond3x
		});
		//Shapeless for compressed iron 3x to iron block
		GameRegistry.addShapelessRecipe(new ItemStack(CompressedDiamond3x, 9), new Object[]
			{
				new ItemStack(CompressedDiamond4x)
			});
		//Shaped recipes for compressed iron 3x.
		GameRegistry.addRecipe(new ItemStack(CompressedDiamond5x), new Object[]{
		    	"AAA",
		    	"AAA",
		    	"AAA",
		    	'A', CompressedDiamond4x
		});
		//Shapeless for compressed iron 3x to iron block
		GameRegistry.addShapelessRecipe(new ItemStack(CompressedDiamond4x, 9), new Object[]
			{
				new ItemStack(CompressedDiamond5x)
			});
		//Shaped recipes for compressed iron 3x.
		GameRegistry.addRecipe(new ItemStack(CompressedDiamond6x), new Object[]{
		    	"AAA",
		    	"AAA",
		    	"AAA",
		    	'A', CompressedDiamond5x
		});
		//Shapeless for compressed iron 3x to iron block
		GameRegistry.addShapelessRecipe(new ItemStack(CompressedDiamond5x, 9), new Object[]
			{
				new ItemStack(CompressedDiamond6x)
			});
    	
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
}
