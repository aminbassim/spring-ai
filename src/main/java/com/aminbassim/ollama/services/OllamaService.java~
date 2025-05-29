package com.aminbassim.ollama.services;

import org.slf4j.Logger;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OllamaService {
    @Autowired
    private OllamaChatModel chatModel;
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(OllamaService.class);
    public String generateResult(String prompt) {

        try {
            OllamaOptions options = new OllamaOptions();
            options.setModel("llama2");

            logger.info("Modelo de Ollama: " + options.getModel());

            ChatResponse response = chatModel.call(new Prompt(prompt, options));

            logger.debug("Respuesta de Ollama: " + response.getResult().getOutput().getText());

            if (response != null) {
                return response.getResult().getOutput().getText();
            }
        }
        catch (Exception e){

            logger.error("Error al llamar a la API de Ollama: " + e.getMessage());
            e.printStackTrace();
        }
        return "Error: No hay respuesta recibida de Ollama API";
    }
}
