package wisteria.customelytra.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.Unit;
import wisteria.customelytra.CustomElytra;
import java.util.function.Function;

import static net.minecraft.item.Items.PHANTOM_MEMBRANE;
import static net.minecraft.item.Items.register;

public class ModItems {

     public static final Item MONARCH_ELYTRA = registerItem("monarch_elytra",
			 setting -> new ElytraItem(setting
    			.maxDamage(432)
    			.rarity(Rarity.EPIC)
    			.component(DataComponentTypes.GLIDER, Unit.INSTANCE)
    			.component(
    				DataComponentTypes.EQUIPPABLE,
    				EquippableComponent.builder(EquipmentSlot.CHEST)
    					.equipSound(SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA)
    					//.model(EquipmentAssetKeys.ELYTRA)
    					.damageOnHurt(false)
    					.build())
    			.repairable(PHANTOM_MEMBRANE))
	 );

    private static Item registerItem(String name, Function<Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(CustomElytra.MOD_ID, name),
                function.apply(new Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomElytra.MOD_ID, name)))));
    }

    public static void registerModItems() {
        CustomElytra.LOGGER.info("Registering Mod Items for " + CustomElytra.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(MONARCH_ELYTRA));
    }


}
