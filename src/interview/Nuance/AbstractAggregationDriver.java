/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Nuance;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author huico
 */
public abstract class AbstractAggregationDriver implements AggregationDriver {
    @Override
    public abstract void aggregateRecords(InputStream in, OutputStream out) throws IOException;
}
