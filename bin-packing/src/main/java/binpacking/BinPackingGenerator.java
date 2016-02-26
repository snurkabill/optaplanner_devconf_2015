package binpacking;

import binpacking.domain.Bin;
import binpacking.domain.BinPacking;
import binpacking.domain.Brick;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinPackingGenerator {

    public static BinPacking generateEasy() {
        BinPacking binPacking = new BinPacking();

        List<Bin> binList = new ArrayList<Bin>();
        Bin bin = new Bin();
        bin.setVolume(10);
        binList.add(bin);

        bin = new Bin();
        bin.setVolume(20);
        binList.add(bin);

        List<Brick> brickList = new ArrayList<Brick>();
        Brick brick = new Brick();
        brick.setVolume(2);
        brickList.add(brick);

        brick = new Brick();
        brick.setVolume(9);
        brickList.add(brick);

        binPacking.setBinList(binList);
        binPacking.setBrickList(brickList);
        return binPacking;
    }

    public static BinPacking generateHard(int numOfBins, int numOfBricks, long seed) {
        Random random = new Random(seed);

        int binBaseline = 2;
        int binMax = 10000;

        List<Bin> binList = new ArrayList<Bin>();
        for (int i = 0; i < numOfBins; i++) {
            Bin bin = new Bin();
            bin.setVolume(random.nextInt(binMax - binBaseline) + binBaseline);
            binList.add(bin);
        }
        int brickBaseline = 1;
        int brickMax = 900;

        List<Brick> brickList = new ArrayList<Brick>();
        for (int i = 0; i < numOfBricks; i++) {
            Brick brick = new Brick();
            brick.setVolume(random.nextInt(brickMax - brickBaseline) + brickBaseline);
            brickList.add(brick);
        }

        BinPacking binPacking = new BinPacking();
        binPacking.setBinList(binList);
        binPacking.setBrickList(brickList);

        return binPacking;
    }
}
