package net.brdle.delightful.common.item.knife.allthemodium;

import net.brdle.delightful.Util;
import net.brdle.delightful.common.item.DelightfulTiers;
import net.brdle.delightful.common.item.knife.CompatKnifeItem;
import net.brdle.delightful.data.DelightfulItemTags;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import java.util.function.Supplier;

public class AllthemodiumKnifeItem extends CompatKnifeItem {
	public AllthemodiumKnifeItem(Properties properties) {
		super("allthemodium", DelightfulItemTags.PLATES_ALLTHEMODIUM, DelightfulTiers.ALLTHEMODIUM, properties, Component.translatable("indestructible").withStyle(ChatFormatting.GOLD), null);
	}

	@Override
	public Supplier<Ingredient> getRod() {
		return Util.ing(DelightfulItemTags.RODS_ALLTHEMODIUM);
	}

	@Override
	public boolean canBeDepleted() {
		return false;
	}

	@Override
	public boolean isEnchantable(@NotNull ItemStack stack) {
		return true;
	}
}
