package javax.visrec.ml.data.norm;

import javax.visrec.ml.data.DataSet;

/**
 *
 * @author zoran
 */
public interface Normalizer {
    // specify param to determine inplace or copy normalization?
    public DataSet normalize(DataSet dataSet, boolean inplace);
}
