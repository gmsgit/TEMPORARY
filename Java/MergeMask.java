import java.lang.*;
import java.util.*;

public class MergeMask {
    public static void main(String[] args) {
        byte x;
        x=(byte)(9<<4);
        x=(byte)(x|12);

        System.out.println((x&0b11110000)>>4);
        System.out.println((x&0b00001111));
    }
}
