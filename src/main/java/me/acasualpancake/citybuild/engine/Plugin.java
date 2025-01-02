package me.acasualpancake.citybuild.engine;

import me.acasualpancake.citybuild.engine.troubleshooting.PluginException;

@SuppressWarnings("unused")
public interface Plugin {
    void build() throws PluginException;
}
