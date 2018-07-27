package com.workfusion.lab.lesson9.model;

import com.workfusion.lab.lesson9.config.Assignment2ModelConfiguration;
import com.workfusion.vds.nlp.hypermodel.ie.generic.GenericIeHypermodel;
import com.workfusion.vds.sdk.api.hypermodel.ModelType;
import com.workfusion.vds.sdk.api.hypermodel.annotation.HypermodelConfiguration;
import com.workfusion.vds.sdk.api.hypermodel.annotation.ModelDescription;

/**
 * The model class. Define here you model details like code, version etc.
 */
@ModelDescription(
        code = "wf-lab-ml-sdk-lesson-9-model",
        title = "WF Lab ML-SDK Lesson 9 Model (1.0)",
        description = "WF Lab ML-SDK Lesson 9 Model (1.0)",
        version = "1.0",
        type = ModelType.IE
)
@HypermodelConfiguration(Assignment2ModelConfiguration.class)
public class Assignment2Model extends GenericIeHypermodel {

    public Assignment2Model() throws Exception {
    }
}
