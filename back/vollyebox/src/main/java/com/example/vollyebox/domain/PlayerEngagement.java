package com.example.vollyebox.domain;

import com.example.vollyebox.domain.enumeration.PlayerPosition;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "playerEngagement")
public class PlayerEngagement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int playerEngagementId;

    @ManyToOne
    @JoinColumn(name = "playerId")
    @JsonBackReference
    private Player player;

    @ManyToOne
    @JoinColumn(name = "teamId")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "seasonId")
    private Season season;

    @Enumerated(EnumType.STRING)
    private PlayerPosition position;

    private int number;


}
