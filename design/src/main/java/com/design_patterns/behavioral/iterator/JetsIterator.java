package com.design_patterns.behavioral.iterator;

import java.util.List;

public class JetsIterator implements Iterator {
    List<IAircraft> jets;

    public JetsIterator(List<IAircraft> jets) {
        this.jets = jets;
    }

    @Override
    public IAircraft next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
    }

}
