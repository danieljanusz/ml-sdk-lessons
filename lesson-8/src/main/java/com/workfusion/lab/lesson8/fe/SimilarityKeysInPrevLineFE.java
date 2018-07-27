package com.workfusion.lab.lesson8.fe;

import java.util.Collection;
import java.util.Collections;

import com.workfusion.vds.sdk.api.nlp.annotation.DependsOn;
import com.workfusion.vds.sdk.api.nlp.fe.Feature;
import com.workfusion.vds.sdk.api.nlp.fe.FeatureExtractor;
import com.workfusion.vds.sdk.api.nlp.fe.annotation.FeatureName;
import com.workfusion.vds.sdk.api.nlp.fe.annotation.Index;
import com.workfusion.vds.sdk.api.nlp.fe.annotation.IndexType;
import com.workfusion.vds.sdk.api.nlp.fe.annotation.Indexes;
import com.workfusion.vds.sdk.api.nlp.model.Document;
import com.workfusion.vds.sdk.api.nlp.model.Element;
import com.workfusion.vds.sdk.api.nlp.model.Line;
import com.workfusion.vds.sdk.api.nlp.model.Token;

/**
 * Gets similarity of focus annotation to provided keyword
 */
@DependsOn({Line.class, Token.class})
@Indexes({
        @Index(covering = Line.class, covered = Token.class, type = IndexType.BIDIRECTIONAL)
})
@FeatureName(SimilarityKeysInPrevLineFE.FEATURE_NAME)
public class SimilarityKeysInPrevLineFE<T extends Element> implements FeatureExtractor<T> {

    public static final String FEATURE_NAME = "cosSimilarity";

    private String keyword;

    public SimilarityKeysInPrevLineFE(String keyword) {
        this.keyword = keyword.toLowerCase();
    }

    /**
     * Gets similarity of focus annotation to provided keyword
     *
     * Cosine similarity is a measure of similarity between two vectors of an inner product space
     * that measures the cosine of the angle between them.
     * The cosine of 0° is 1, and it is less than 1 for any other angle.
     *
     * @param document the Document containing the focus
     * @param element the annotation being checked for matching keyword
     * @return best similarity score to keyword
     */
    @Override
    public Collection<Feature> extract(Document document, T element) {

        // TODO:  PUT YOU CODE HERE

        return Collections.emptyList();
    }
}

