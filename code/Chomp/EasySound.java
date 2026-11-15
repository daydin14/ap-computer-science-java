//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class EasySound {

    private SourceDataLine line = null;
    private byte[] audioBytes;
    private int numBytes;

    public EasySound(String fileName) {
        File soundFile = new File(fileName);
        AudioInputStream audioInputStream = null;

        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (Exception var9) {
            System.out.println("*** Cannot find " + fileName + " ***");
            System.exit(1);
        }

        AudioFormat audioFormat = audioInputStream.getFormat();
        Info info = new Info(SourceDataLine.class, audioFormat);

        try {
            this.line = (SourceDataLine) AudioSystem.getLine(info);
            this.line.open(audioFormat);
        } catch (LineUnavailableException var8) {
            System.out.println("*** Audio line unavailable ***");
            System.exit(1);
        }

        this.line.start();
        this.audioBytes = new byte[(int) soundFile.length()];

        try {
            this.numBytes = audioInputStream.read(this.audioBytes, 0, this.audioBytes.length);
        } catch (IOException var7) {
            System.out.println("*** Cannot read " + fileName + " ***");
            System.exit(1);
        }

    }

    public void play() {
        this.line.write(this.audioBytes, 0, this.numBytes);
    }
}
