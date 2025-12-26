package maamissiniva.bitmapfontdescriptor;

/**
 * Bitmap glyph, sprite with some font related information.
 */
public class Glyph {
    
    /**
     * Index of texture in the {@link BitmapFontDescriptor#textures} array. 
     */
    public int texture;
    
    /**
     * How much do we advance to draw the next glyph.
     */
    public float advance;

    /**
     * Where to draw the glyph.
     */
    public float drawX;
    
    /**
     * Where to draw the glyph.
     */
    public float drawY;
    
    /**
     * Draw width.
     */
    public float drawWidth;
    
    /**
     * Draw height.
     */
    public float drawHeight;
    
    /**
     * Glyph logical x.
     */
    public float lx;
    
    /**
     * Glyph logical y.
     */
    public float ly;
    
    /**
     * Glyph logical width.
     */
    public float lwidth;
    
    /**
     * Glyph logical height.
     */
    public float lheight;
    
    /**
     * Glyph texture coordinate.
     */
    public float u0;
    
    /**
     * Glyph texture coordinate.
     */
    public float u1;
    
    /**
     * Glyph texture coordinate.
     */
    public float v0;

    /**
     * Glyph texture coordinate.
     */
    public float v1;
    
}
