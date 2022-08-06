package com.code.kmhduilinkapi.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "link")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Link implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String link;

    private String customLink;
}
