package net.yaider.tool;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yaider.Bombondecanela;

/**
 * Esta clase se encargará de ayudar a registrar las herramientas,
 * esto para que minecraft sepa cuando agregamos herramientas
 */
public class ModTools {

    // Aquí van las herramientas que se vayan a usar en el mod
    public static final ToolItem espada_oscura = registerTool("espada_oscura",
            new SwordItem(ModToolMaterial.OSCURA,6,-2.4f, new Item.Settings()));

    // Metodo para añadir herramientas al grupo de items de ingredientes
    private static ToolItem registerTool(String name, ToolItem tool) {
        return Registry.register(Registries.ITEM, new Identifier(Bombondecanela.MOD_ID,name),tool);
    }
    public static void registerModTools() {
        Bombondecanela.LOGGER.info("Registrando ModTools " + Bombondecanela.MOD_ID);
        // Aquí se pueden registrar las herramientas que se vayan a usar en el mod
        // Ejemplo: registerTool("nombre_de_la_herramienta", new ToolItem(new ToolSettings()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModTools::addToolsToCombatTabItemGroup);
    }

    private static void addToolsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(espada_oscura);
    }
}
