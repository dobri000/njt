package com.example.vollyebox.domain;

import com.example.vollyebox.domain.enumeration.Hand;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int playerId;

    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private int height;
    private int weight;
    private int spike;
    private int block;

    @Enumerated(EnumType.STRING)
    private Hand dominantHand;

    private String photo;

    @ManyToOne
    @JoinColumn(name = "nationality", referencedColumnName = "countryId")
    private Country nationality;

    @OneToMany(mappedBy = "player")
    private List<PlayerEngagement> playerEngagements;

}