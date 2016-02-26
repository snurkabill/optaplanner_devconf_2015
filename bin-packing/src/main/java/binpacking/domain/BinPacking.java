package binpacking.domain;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

import java.util.Collection;
import java.util.List;

@PlanningSolution
public class BinPacking implements Solution<HardSoftScore> {

    private List<Bin> binList;
    private List<Brick> brickList;

    private HardSoftScore score;

    public HardSoftScore getScore() {
        return score;
    }

    public void setScore(HardSoftScore hardSoftScore) {
        this.score = hardSoftScore;
    }


    @ValueRangeProvider(id = "binRange")
    public List<Bin> getBinList() {
        return binList;
    }

    public void setBinList(List<Bin> binList) {
        this.binList = binList;
    }

    @PlanningEntityCollectionProperty
    public List<Brick> getBrickList() {
        return brickList;
    }

    public void setBrickList(List<Brick> brickList) {
        this.brickList = brickList;
    }

    public Collection<?> getProblemFacts() {
        return null;
    }
}
