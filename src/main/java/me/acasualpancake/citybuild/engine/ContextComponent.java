package me.acasualpancake.citybuild.engine;

import me.acasualpancake.citybuild.GameContext;
import me.acasualpancake.citybuild.engine.troubleshooting.CComponentException;
import org.jetbrains.annotations.NotNull;

public interface ContextComponent {
    /**
     * Builds the component.
     * @param gameContext the game context.
     * @throws CComponentException can be thrown when something goes wrong during build.
     */
    default void build(@NotNull GameContext gameContext) throws CComponentException {
        if (!gameContext.addComponent(this))
            throw new CComponentException("Could not apply component to game context.");
    }
}
