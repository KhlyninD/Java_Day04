package edu.school21.printer.app;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import edu.school21.printer.logic.Logic;

public class Main {

    private static char WHITE_PIXEL;
    private static char BLACK_PIXEL;
    private static final String IMAGE_PATH = "/resources/image.bmp";

    public static void main(String[] args) {
        BufferedImage img = checkArgs(args);
        if (img == null)
            System.exit(-1);
        new Logic(WHITE_PIXEL, BLACK_PIXEL).printImage(img);
    }

    public static BufferedImage checkArgs(String[] args) {
        BufferedImage img = null;

        if (args.length > 1 && args[0].length() == 1 && args[1].length() == 1) {
            WHITE_PIXEL = args[0].charAt(0);
            BLACK_PIXEL = args[1].charAt(0);
            try {
                img = ImageIO.read(File.class.getResource(IMAGE_PATH));
                return img;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return img;
    }
}
