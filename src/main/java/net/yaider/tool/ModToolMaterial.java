package net.yaider.tool;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ModToolMaterial implements ToolMaterial {

    public static final ModToolMaterial OSCURA = new ModToolMaterial(
            2000, // Durabilidad de la herramienta
            10.0f, // Velocidad de minado
            5.0f, // Daño de ataque
            3, // Nivel de minería
            15, // Encantabilidad
            Ingredient.ofItems(Items.OAK_WOOD) // Ingrediente de reparación
    );

    private final int durability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;

    // Este ingrediente se usará para reparar la herramienta
    private final Ingredient repairIngredient;

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // Este metodo devuelve el ingrediente que se usará para reparar las herramientas
        return this.repairIngredient;
    }


    // el constructor de la clase
    public ModToolMaterial(int durability, float miningSpeed, float attackDamage, int miningLevel, int enchantability, Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }
}
