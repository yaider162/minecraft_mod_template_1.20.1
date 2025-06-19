package net.yaider.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yaider.Bombondecanela;

// Esta clase se encargará de ayudar a registrar los Items, esto para que minecraft sepa cuando agregamos items
public class ModItems {

    // Aquí se pueden registrar los items que se vayan a usar en el mod
    public static final Item EXAMPLE_ITEM = registerItem("pipi_de_kale", new Item(new Item.Settings()));

    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries){
        entries.add(EXAMPLE_ITEM);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Bombondecanela.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Bombondecanela.LOGGER.info("Registrando ModItems "+ Bombondecanela.MOD_ID);

        // Aquí añado el item al grupo de items de ingredientes en el tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
    }
}

