package com.example.vollyebox.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int teamId;

    private String teamName;
    private int founded;

    private String logo;

    @ManyToOne
    @JoinColumn(name = "hall")
    private Hall hall;

    @ManyToOne
    @JoinColumn(name = "country")
    private Country country;

    @OneToMany(mappedBy = "team")
    @JsonBackReference
    private List<PlayerEngagement> playerEngagements;


}