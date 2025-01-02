package me.acasualpancake.citybuild.engine;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

@SuppressWarnings("unused")
public abstract class Context {

    // Contains all components of a context.
    private final ArrayList<ContextComponent> components = new ArrayList<>();

    protected ArrayList<ContextComponent> getComponents() {
        return components;
    }

    /**
     * Adds a new component and checks if the component type is already contained.
     * @param component the component to add.
     */
    public boolean addComponent(ContextComponent component) {
        for (ContextComponent contextComponent : components) {
            if (contextComponent.getClass().equals(component.getClass())) return false;
        }
        components.add(component);
        return true;
    }

    /**
     * Returns the wanted component.
     * @param clazz the class of the wanted component.
     * @return the component.
     * @param <T> the type of the component.
     */
    @SuppressWarnings("unchecked")
    public @Nullable <T extends ContextComponent> T getComponent(Class<T> clazz) {
        for (ContextComponent component : components) {
            if (component.getClass().equals(clazz)) {
                try { return (T) component; }
                catch (ClassCastException e) { return null; }
            }
        }
        return null;
    }

    public abstract void build();
}
