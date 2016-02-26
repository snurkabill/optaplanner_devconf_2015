package binpacking;

import binpacking.domain.BinPacking;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

public class BinPackingRunner {

    public static void main(String[] argv) {

        SolverFactory solverFactory = SolverFactory.createFromXmlResource("binpacking/config.xml");
        Solver solver = solverFactory.buildSolver();
//        BinPacking binPacking = BinPackingGenerator.generateEasy();
        BinPacking binPacking = BinPackingGenerator.generateHard(100, 1048, 0);
        solver.solve(binPacking);
    }
}
