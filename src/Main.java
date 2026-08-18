public class Main {
    public static void main(String[] args) {
        // cargar imagen
        Image image = ImageUtils.load("data/input.png");

        // Apply requested filter
        ImageEditor editor = new ImageEditor(image);
        Image output = editor.negative();
        Image grayscale = editor.grayscale();
        Image oneChannelRed = editor.keepOnlyChannel(0);
        Image oneChannelGreen = editor.keepOnlyChannel(1);
        Image oneChannelBlue = editor.keepOnlyChannel(2);
        Image brightness = editor.brightness(100);
        Image darkness = editor.brightness(-100);
        Image BlackandWhite = editor.blackAndWhite(200);
        Image mirroredHorizontal = editor.mirrorHorizontal();
        Image rotate90 = editor.rotate90();
        Image blur = editor.blur();

         // Save transformed image.
        ImageUtils.save(image, "data/output.png");
        ImageUtils.save(output, "data/negative.png");
        ImageUtils.save(grayscale, "data/grayscale.png");
        ImageUtils.save(oneChannelRed, "data/oneChannelRed.png");
        ImageUtils.save(oneChannelGreen, "data/oneChannelGreen.png");
        ImageUtils.save(oneChannelBlue, "data/oneChannelBlue.png");
        ImageUtils.save(brightness, "data/brightness.png");
        ImageUtils.save(darkness, "data/darkness.png");
        ImageUtils.save(BlackandWhite, "data/BlackandWhite.png");
        ImageUtils.save(mirroredHorizontal, "data/mirroredHorizontal.png");
        ImageUtils.save(rotate90, "data/rotate90.png");
        ImageUtils.save(blur, "data/blur.png");
    }
}
