package binpacking;

import binpacking.domain.Bin;
import binpacking.domain.BinPacking;
import binpacking.domain.Brick;
import org.optaplanner.core.api.score.Score;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.score.director.easy.EasyScoreCalculator;

import java.util.List;

public class BinPackingScoreFunction implements EasyScoreCalculator<BinPacking> {

    public Score calculateScore(BinPacking binPacking) {
        int hardScore = 0;
        int softScore = 0;

        List<Brick> bricks = binPacking.getBrickList();
        List<Bin> bins = binPacking.getBinList();

        for (Bin bin : bins) {
            int usedVolume = 0;
            for (Brick brick : bricks) {
                if (bin.equals(brick.getBin())) {
                    usedVolume += brick.getVolume();
                }
            }
            if (usedVolume > bin.getVolume()) {
                hardScore -= (usedVolume - bin.getVolume());
            }
            if (usedVolume != 0) {
                softScore -= 1;
            }
        }
        return HardSoftScore.valueOf(hardScore, softScore);
    }
}
