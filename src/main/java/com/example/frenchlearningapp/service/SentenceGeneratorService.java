package com.example.frenchlearningapp.service;

import com.example.frenchlearningapp.service.generatorlogic.MainGenerator;
import org.springframework.stereotype.Service;

/**
 * Utilizes logic within the "logic" package to construct appropriate and grammatically sound French sentences
 */
@Service
public class SentenceGeneratorService {

    /**
     * Crafts a written French sentence
     *
     * @param proficiencyLevel Used as a scalar for sentence generation
     * @return French sentence
     */
    public String generateSentence(String proficiencyLevel){
        return MainGenerator.getSentence(proficiencyLevel);
    }

}
