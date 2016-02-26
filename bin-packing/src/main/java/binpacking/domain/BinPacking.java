package binpacking.domain;

import java.util.Collection;
import java.util.List;

public class BinPacking {

    private List<Bin> binList;
    private List<Brick> brickList;

    public List<Bin> getBinList() {
        return binList;
    }

    public void setBinList(List<Bin> binList) {
        this.binList = binList;
    }

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
