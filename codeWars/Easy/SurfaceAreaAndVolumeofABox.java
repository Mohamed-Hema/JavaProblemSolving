package codeWars.Easy;

public class SurfaceAreaAndVolumeofABox {
    public class Kata {
        public static int[] getSize(int w,int h,int d) {
            int surfaceArea = 2 * (w * h + h * d + w * d);
            int volume = w * h * d;
            return new int[] {surfaceArea, volume};
        }
    }
}
