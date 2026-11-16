package net.dumb.vivianite.item;

import net.dumb.vivianite.Vivianite;
import net.dumb.vivianite.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VIVIANITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Vivianite.MOD_ID, "vivianite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vivianite"))
                    .icon(() -> new ItemStack(ModItems.Vivianite_Shard)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Vivianite_Shard);
                        entries.add(ModBlocks.VIVIANITE_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        Vivianite.LOGGER.info("Registering Item Groups for " + Vivianite.MOD_ID);
    }
}
