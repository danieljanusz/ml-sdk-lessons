package com.workfusion.lab.lesson8.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.workfusion.vds.sdk.api.hypermodel.annotation.ModelConfiguration;
import com.workfusion.vds.sdk.api.hypermodel.annotation.Named;
import com.workfusion.vds.sdk.api.nlp.annotator.Annotator;
import com.workfusion.vds.sdk.api.nlp.configuration.IeConfigurationContext;
import com.workfusion.vds.sdk.api.nlp.fe.FeatureExtractor;
import com.workfusion.vds.sdk.api.nlp.model.Document;
import com.workfusion.vds.sdk.api.nlp.model.Element;
import com.workfusion.vds.sdk.api.nlp.model.Field;
import com.workfusion.vds.sdk.api.nlp.model.IeDocument;
import com.workfusion.vds.sdk.api.nlp.model.NamedEntity;
import com.workfusion.vds.sdk.api.nlp.model.Token;
import com.workfusion.vds.sdk.api.nlp.processing.Processor;

/**
 * The model configuration class.
 * Here you can configure set of Feature Extractors, Annotators.
 */
@ModelConfiguration
public class Assignment1ModelConfiguration {

    /**
     * Regex pattern to use for matching {@link Token} elements.
     */
    public final static String TOKEN_REGEX = "([$\\$\\s:#_;'])";

    /**
     * Name of {@link Field} representing a total amount.
     */
    public final static String FIELD_TOTAL_AMOUNT = "total_amount";

    /**
     * Regex pattern to match a total amount.
     */
    public static final String TOTAL_AMOUNT_REGEX = "[0-9l]{1,3}[,\\.]?[0-9]{2,3}[\\.][0-9]*";

    /**
     * Type for {@link NamedEntity} to use for total amount NER.
     */
    private static final String NER_TYPE_TOTAL_AMOUNT = "total_amount";

    /**
     * Keyword that needs be found in previous line
     */
    private static final String KEYWORD_SIMILARITY = "total";

    @Named("annotators")
    public List<Annotator<Document>> getAnnotators(IeConfigurationContext context) {

        // TODO:  PUT YOU CODE HERE

        return Collections.emptyList();
    }

    @Named("featureExtractors")
    public List<FeatureExtractor<Element>> getFeatureExtractors(IeConfigurationContext context) {

        // TODO:  PUT YOU CODE HERE

        return Collections.emptyList();
    }

    @Named("processors")
    public List<Processor<IeDocument>> getProcessors() {

        // TODO:  PUT YOU CODE HERE

        return Collections.emptyList();
    }
}

