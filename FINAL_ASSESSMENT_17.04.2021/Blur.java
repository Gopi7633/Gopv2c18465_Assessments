package com.imageblur;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {

Color c[];

	Main() throws IOException, InterruptedException {
		File f = new File("D:\\img.jpg");
		BufferedImage im = ImageIO.read(f);

		BufferedImage bi = new BufferedImage(im.getWidth(), im.getHeight(), BufferedImage.TYPE_INT_RGB);
		int i = 0;
		int max = 400, radius = 10;
		int a1 = 0, r1 = 0, g1 = 0, b1 = 0;
		c = new Color[max];
		int x = 1, y = 1, x1, y1, ex = 5, d = 0;
		for (x = radius; x < im.getHeight() - radius; x++) {
        for (y = radius; y < im.getWidth() - radius; y++) {

            //20x20 matrix
            for (x1 = x - radius; x1 < x + radius; x1++) {
                for (y1 = y - radius; y1 < y + radius; y1++) {
                    c[i++] = new Color(im.getRGB(y1, x1));
                    //System.out.println(i);
                }
            }
            i = 0;

            for (d = 0; d < max; d++) {
                a1 = a1 + c[d].getAlpha();
            }
            a1 = a1 / (max);

            for (d = 0; d < max; d++) {
                r1 = r1 + c[d].getRed();
            }
            r1 = r1 / (max);

            for (d = 0; d < max; d++) {
                g1 = g1 + c[d].getGreen();
            }
            g1 = g1 / (max);

            for (d = 0; d < max; d++) {
                b1 = b1 + c[d].getBlue();
            }
            b1 = b1 / (max);
            int sum1 = (a1 << 24) + (r1 << 16) + (g1 << 8) + b1;
            bi.setRGB(y, x, (int) (sum1));

        }
    }
    ImageIO.write(bi, "jpg", new File("D:\\img1.jpg"));
}

public static void main(String[] args) throws IOException, InterruptedException {
    	new Main();
	}
}
