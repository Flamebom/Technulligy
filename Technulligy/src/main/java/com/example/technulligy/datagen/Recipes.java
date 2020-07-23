package com.example.technulligy.datagen;

import java.util.function.Consumer;

import com.example.technulligy.setup.Registration;

import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraftforge.common.Tags;
import net.minecraft.tags.ItemTags;

public class Recipes extends RecipeProvider {
	public Recipes(DataGenerator generatorIn) {
		super(generatorIn);
	}
	 @Override
	    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
	        ShapedRecipeBuilder.shapedRecipe(Registration.WEAK_CORE.get())
	                .patternLine("axa")
	                .patternLine("x#x")
	                .patternLine("axa")
	                .key('a', Registration.NULL_CORE.get())
	                .key('x', Tags.Items.STONE)
	                .key('#', ItemTags.COALS)
	                .setGroup("technulligy")
	                .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	                .build(consumer);
	        ShapedRecipeBuilder.shapedRecipe(Registration.BASIC_CORE.get())
            .patternLine("axa")
            .patternLine("x#x")
            .patternLine("axa")
            .key('a', Registration.WEAK_CORE.get())
            .key('x', Tags.Items.INGOTS_IRON)
            .key('#', Registration.AETHER.get())
            .setGroup("technulligy")
            .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
            .build(consumer);
	        
	    }
}