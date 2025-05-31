package wisteria.customelytra;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wisteria.customelytra.item.ModItems;

public class CustomElytra implements ModInitializer {
	public static final String MOD_ID = "customelytra";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}

}
