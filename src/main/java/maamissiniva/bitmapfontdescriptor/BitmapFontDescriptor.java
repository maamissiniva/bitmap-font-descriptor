package maamissiniva.bitmapfontdescriptor;

import java.util.List;

/**
 * Bitmap font descriptor.
 */
public class BitmapFontDescriptor {
    
    /**
     * Font name.
     */
    public String name;
    
    /**
     * Font sampled size.
     */
    public float size;

    /**
     * Distance from bottom to descent.
     */
    public float descent;
    
    /**
     * Distance from baseline to bottom.
     */
    public float baseline;
    
    /**
     * Distance from ascent to bottom. 
     */
    public float ascent;
    
    /**
     * Distance from top (max ascent) to bottom. 
     */
    public float top;

    /**
     * Texture file names.
     */
    public List<String> textures;
    
    /**
     * Map of char code to glyphs.
     */
    public List<CharGlyph> chars;
    
    /**
     * Glyphs.
     */
    public List<Glyph> glyphs;
    
}
