package stub;

import main.trigeometry.IBasicTrig;

public class TrigeometricBaseStub implements IBasicTrig {

    @Override
    public Double cos(Double x) {
        return Math.cos(x);
    }

    @Override
    public Double sin(Double x) {
        return Math.sin(x);
    }
}
