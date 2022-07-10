package net.brdle.delightful.common.item;

import net.brdle.delightful.Delightful;
import net.brdle.delightful.common.item.food.FoodValues;
import net.brdle.delightful.common.block.DelightfulBlocks;
import net.brdle.delightful.common.item.food.EnderNectarItem;
import net.brdle.delightful.common.item.food.PizzaItem;
import net.brdle.delightful.common.item.food.PricklyPearJuiceItem;
import net.brdle.delightful.common.item.knife.CompatKnifeItem;
import net.brdle.delightful.common.item.knife.DelightfulKnifeItem;
import net.brdle.delightful.common.item.knife.TaggedKnifeItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import java.util.ArrayList;
import java.util.function.Supplier;

public class DelightfulItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Delightful.MODID);

    // Knives
    public static final ArrayList<RegistryObject<Item>> knives = new ArrayList<>();
    public static final RegistryObject<Item> COPPER_KNIFE = registerKnife("copper");
    public static final RegistryObject<Item> BONE_KNIFE = registerKnife("bone");
    public static final RegistryObject<Item> BLACK_OPAL_KNIFE = registerGemKnife("black_opal");
    public static final RegistryObject<Item> TIN_KNIFE = registerIngotKnife("tin");
    public static final RegistryObject<Item> STEEL_KNIFE = registerIngotKnife("steel");
    public static final RegistryObject<Item> SILVER_KNIFE = registerIngotKnife("silver");
    public static final RegistryObject<Item> BRASS_KNIFE = registerIngotKnife("brass");
    public static final RegistryObject<Item> ENDERITE_KNIFE = registerIngotKnife("enderite");
    public static final RegistryObject<Item> BRONZE_KNIFE = registerIngotKnife("bronze");
    public static final RegistryObject<Item> CONSTANTAN_KNIFE = registerIngotKnife("constantan");
    public static final RegistryObject<Item> ELECTRUM_KNIFE = registerIngotKnife("electrum");
    public static final RegistryObject<Item> INVAR_KNIFE = registerIngotKnife("invar");
    public static final RegistryObject<Item> LEAD_KNIFE = registerIngotKnife("lead");
    public static final RegistryObject<Item> NICKEL_KNIFE = registerIngotKnife("nickel");

    public static final RegistryObject<Item> OBSIDIAN_INFUSED_ENDERITE_KNIFE = registerCompatKnife("obsidian_infused_enderite", "lolenderite");
    public static final RegistryObject<Item> LAPIS_LAZULI_KNIFE = registerCompatKnife("lapis_lazuli", "mekanismtools");
    public static final RegistryObject<Item> OSMIUM_KNIFE = registerCompatKnife("osmium", "mekanismtools");
    public static final RegistryObject<Item> REFINED_GLOWSTONE_KNIFE = registerCompatKnife("refined_glowstone", "mekanismtools");
    public static final RegistryObject<Item> REFINED_OBSIDIAN_KNIFE = registerCompatKnife("refined_obsidian", "mekanismtools");
    public static final RegistryObject<Item> LARGE_AMETHYST_KNIFE = registerCompatKnife("large_amethyst", "oresabovediamonds");
    public static final RegistryObject<Item> NETHERITE_OPAL_KNIFE = registerCompatKnife("netherite_opal", "oresabovediamonds");

    // Foods
    public static final RegistryObject<Item> CHEESEBURGER = registerItem("cheeseburger", () -> new ConsumableItem((new Item.Properties()).food(FoodValues.CHEESEBURGER).tab(FarmersDelight.CREATIVE_TAB), true));
    public static final RegistryObject<Item> DELUXE_CHEESEBURGER = registerItem("deluxe_cheeseburger", () -> new ConsumableItem((new Item.Properties()).food(FoodValues.DELUXE_CHEESEBURGER).tab(FarmersDelight.CREATIVE_TAB), true));
    public static final RegistryObject<Item> MARSHMALLOW_STICK = registerFood("marshmallow_stick", FoodValues.MARSHMALLOW_STICK, Items.STICK);
    public static final RegistryObject<Item> COOKED_MARSHMALLOW_STICK = registerFood("cooked_marshmallow_stick", FoodValues.COOKED_MARSHMALLOW_STICK, Items.STICK);
    public static final RegistryObject<Item> SMORE = registerFood("smore", FoodValues.SMORE);
    public static final RegistryObject<Item> CRAB_RANGOON = registerCompatFood("crab_rangoon", "ecologics", FoodValues.CRAB_RANGOON);
    public static final RegistryObject<Item> PRICKLY_PEAR_JUICE = registerCompatItem("prickly_pear_juice", "ecologics",
            () -> new PricklyPearJuiceItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FarmersDelight.CREATIVE_TAB)),
            () -> new PricklyPearJuiceItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> CHUNKWICH = registerCompatFood("chunkwich", "rottenleather", FoodValues.CHUNKWICH);
    public static final RegistryObject<Item> JELLY_BOTTLE = registerItem("jelly_bottle",
            () -> new ConsumableItem((new Item.Properties())
                    .food(FoodValues.JELLY_BOTTLE).craftRemainder(Items.GLASS_BOTTLE).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> NUT_BUTTER_BOTTLE = registerItem("nut_butter_bottle",
            () -> new ConsumableItem((new Item.Properties())
                    .food(FoodValues.NUT_BUTTER_BOTTLE).craftRemainder(Items.GLASS_BOTTLE).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> NUT_BUTTER_AND_JELLY_SANDWICH = registerItem("nut_butter_and_jelly_sandwich", () -> new ConsumableItem((new Item.Properties()).food(FoodValues.NUT_BUTTER_AND_JELLY_SANDWICH).tab(FarmersDelight.CREATIVE_TAB), true));
    public static final RegistryObject<Item> ENDER_NECTAR = registerItem("ender_nectar", () -> new EnderNectarItem((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16).tab(FarmersDelight.CREATIVE_TAB)));

    // WIP
    public static final RegistryObject<Item> PIZZA = registerItem("pizza", () -> new PizzaItem((new Item.Properties())
            //.tab(FarmersDelight.CREATIVE_TAB)
    ));

    // Cabinets
    public static final RegistryObject<Item> QUARTZ_CABINET = registerItem("quartz_cabinet", () -> new BlockItem(DelightfulBlocks.QUARTZ_CABINET.get(), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> BASALT_CABINET = registerItem("basalt_cabinet", () -> new BlockItem(DelightfulBlocks.BASALT_CABINET.get(), (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));

    // Registers a knife to Farmer's Delight tab, requiring modid
    public static RegistryObject<Item> registerCompatKnife(String name, String modid) {
        var knife = registerItem(name + "_knife", () ->
                ModList.get().isLoaded(modid) ?
                        new CompatKnifeItem(DelightfulTiers.valueOf(name.toUpperCase()), 0.5F, -2.0F, (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), modid) :
                        new CompatKnifeItem(DelightfulTiers.valueOf(name.toUpperCase()), 0.5F, -2.0F, (new Item.Properties()), modid));
        knives.add(knife);
        return knife;
    }

    // Registers a knife to Farmer's Delight tab, requiring non-empty ingot tag
    public static RegistryObject<Item> registerIngotKnife(String name) {
        var knife = registerItem(name + "_knife", () -> new TaggedKnifeItem(DelightfulTiers.valueOf(name.toUpperCase()), 0.5F, -2.0F, (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), ingot(name)));
        knives.add(knife);
        return knife;
    }

    // Registers a knife to Farmer's Delight tab, requiring non-empty gem tag
    public static RegistryObject<Item> registerGemKnife(String name) {
        var knife = registerItem(name + "_knife", () -> new TaggedKnifeItem(DelightfulTiers.valueOf(name.toUpperCase()), 0.5F, -2.0F, (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB), gem(name)));
        knives.add(knife);
        return knife;
    }

    // Registers a knife to Farmer's Delight tab
    public static RegistryObject<Item> registerKnife(String name) {
        var knife = registerItem(name + "_knife", () -> new DelightfulKnifeItem(DelightfulTiers.valueOf(name.toUpperCase()), 0.5F, -2.0F, (new Item.Properties()).tab(FarmersDelight.CREATIVE_TAB)));
        knives.add(knife);
        return knife;
    }

    // Registers a food to Farmer's Delight tab, optional craftRemainder
    public static RegistryObject<Item> registerFood(String name, FoodProperties food, Item... remainder) {
        return registerItem(name, (remainder.length > 0) ?
                (new Item.Properties()).food(food).craftRemainder(remainder[0]) :
                (new Item.Properties()).food(food));
    }

    // Sets creative tab to Farmer's Delight
    public static RegistryObject<Item> registerItem(String name, Item.Properties props) {
        return registerItem(name, () -> new Item(props.tab(FarmersDelight.CREATIVE_TAB)));
    }

    // Sets no creative tab
    public static RegistryObject<Item> registerCompatFood(String name, String modid, FoodProperties food) {
        if (ModList.get().isLoaded(modid)) {
            return registerItem(name, () -> new Item((new Item.Properties().food(food).tab(FarmersDelight.CREATIVE_TAB))));
        }
        return registerItem(name, () -> new Item((new Item.Properties().food(food))));
    }

    // Sets no creative tab
    public static RegistryObject<Item> registerCompatItem(String name, String modid, Supplier<Item> loaded, Supplier<Item> notLoaded) {
        if (ModList.get().isLoaded(modid)) {
            return registerItem(name, loaded);
        }
        return registerItem(name, notLoaded);
    }

    // Creative tab should be set before calling this function
    public static RegistryObject<Item> registerItem(String name, Supplier<Item> item) {
        return ITEMS.register(name, item);
    }

    public static final ResourceLocation ingot(String name) {
        return new ResourceLocation("forge", "ingots/" + name);
    }

    public static final ResourceLocation gem(String name) {
        return new ResourceLocation("forge", "gems/" + name);
    }

    public static final Supplier<Ingredient> getIngot(String name) {
        return () -> Ingredient.of(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(), ingot(name)));
    }

    public static final Supplier<Ingredient> getGem(String name) {
        return () -> Ingredient.of(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(), gem(name)));
    }

    public static void create(IEventBus bus) {
        ITEMS.register(bus);
    }
}