package com.code.kmhduilinkapi.api.service;


import com.code.kmhduilinkapi.api.model.Link;
import com.code.kmhduilinkapi.api.model.LinkRequestDTO;
import com.code.kmhduilinkapi.api.model.LinkResponseDTO;
import com.code.kmhduilinkapi.api.repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiServiceImpl implements ApiService {
    @Autowired
    private ApiRepository apiRepository;

    @Override
    public LinkResponseDTO addCustomLink(LinkRequestDTO linkRequestDTO) {
        String link = linkRequestDTO.getLink();
        String customLink = linkRequestDTO.getCustomLink();

        var linkDatabase = apiRepository.findByCustomLink(customLink);

        if (!linkDatabase.isPresent()) {

            Link savedLink = new Link();
            savedLink.setLink(link);
            savedLink.setCustomLink(customLink);
            apiRepository.save(savedLink);
            return new LinkResponseDTO(0, "Custom link has been saved.");
        }
        return new LinkResponseDTO(1, "Custom link has been taken.");
    }

    @Override
    public String getLink(String customLink) {
        var linkDatabase = apiRepository.findByCustomLink(customLink);

        if(linkDatabase.isPresent()){
            return linkDatabase.get().getLink();
        }
        return "https://kmhdui.link/notfound";
    }
}
