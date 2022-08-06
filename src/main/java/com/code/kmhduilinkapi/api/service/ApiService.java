package com.code.kmhduilinkapi.api.service;

import com.code.kmhduilinkapi.api.model.LinkRequestDTO;
import com.code.kmhduilinkapi.api.model.LinkResponseDTO;

public interface ApiService {
    LinkResponseDTO addCustomLink(LinkRequestDTO linkRequestDTO);
    String getLink(String customLink);
}
