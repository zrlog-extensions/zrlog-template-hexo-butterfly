package com.zrlog.theme.bundled;
import com.zrlog.theme.spi.BundledThemeProvider;
/** Registers the hexo-theme-butterfly resources bundled in this JAR. */
public final class HexoThemeButterflyProvider implements BundledThemeProvider {
 public String id() { return "hexo-theme-butterfly"; }
 public String engine() { return "hexo"; }
 public String adapter() { return "butterfly"; }
 public boolean isDefault() { return false; }
}
