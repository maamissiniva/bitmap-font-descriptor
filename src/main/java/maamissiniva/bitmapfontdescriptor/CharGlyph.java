package maamissiniva.bitmapfontdescriptor;

/**
 * Character glyph index.
 */
public class CharGlyph {
    
    /**
     * Character.
     */
    public int character;
    
    /**
     * Glyph index.
     */
    public int glyph;
    
    public CharGlyph() {
    }
    
    public CharGlyph(int character, int glyph) {
        this.character = character;
        this.glyph     = glyph;
    }
    
}
