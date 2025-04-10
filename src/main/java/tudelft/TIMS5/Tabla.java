package tudelft.TIMS5;

public class Tabla {
    public boolean comprobar(Character a, Character b,Character c) {
        boolean A = (a == 'v' || a == 'V');
        boolean B = (b == 'v' || b == 'V');
        boolean C = (c == 'v' || c == 'V');
        return (A && B) || C;
    }
}
