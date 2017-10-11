
/**
 *
 * @author Dr. Baharav
 */
public class Main {

    
    public static void main(String[] args) {
        
        String str;
        int n;
        
        System.out.println("Starting Ascii art");
        
        n = 3;
        str = AsciiArt.square(n);
        System.out.println(str);
        
        
        n = 7;
        str = AsciiArt.lowerLeftTriangle(n);
        System.out.println(str);
        
        n = 5;
        str = AsciiArt.lowerLeftTriangle(n);
        System.out.println(str);


        str = AsciiArt.upperLeftTriangle(n);
        System.out.println(str);

        
        str = AsciiArt.lowerRightTriangle(n);
        System.out.println(str);
        
        str = AsciiArt.upperRightTriangle(n);
        System.out.println(str);
        
        
        str = AsciiArt.pyramid(n);
        System.out.println(str);
        
        str = AsciiArt.upperLeftTriangle("Hello!");
        System.out.println(str);
        
        System.out.println("End of Ascii art");
        
    }
    
    
}
