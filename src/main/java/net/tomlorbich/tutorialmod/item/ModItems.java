package net.tomlorbich.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tomlorbich.tutorialmod.TutorialMod;
import net.tomlorbich.tutorialmod.item.custom.ModToolMaterials;


public class ModItems {
    public static final Item AMETHYST_INGOT = registerItem("amethyst_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item AMETHYST_NUGGET = registerItem("amethyst_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new SwordItem(ModToolMaterials.AMETHYST, 10, 2f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems () {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID );
    }
}
