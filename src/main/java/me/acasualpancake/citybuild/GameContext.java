package me.acasualpancake.citybuild;


import me.acasualpancake.citybuild.engine.Context;
import me.acasualpancake.citybuild.engine.ContextComponent;
import me.acasualpancake.citybuild.engine.troubleshooting.CComponentException;

@SuppressWarnings("unused")
public class GameContext extends Context {

    @Override
    public void build() {
        for (ContextComponent component : getComponents()) {
            try {
                component.build(this);
            } catch (CComponentException e) {
                // TODO: Handle failed build.
            }
        }
    }
}
