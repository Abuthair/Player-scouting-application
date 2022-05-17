package com.playerscoutingapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Sheika Abuthair
 * @Date : 16-05-2022
 * @Project : assignmentProject
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Signing {
    @Id
    @Column(name = "signingid")
    @GeneratedValue(generator = "signing_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "signing_gen",sequenceName = "signing_seq",initialValue = 1,allocationSize = 1)
    private Integer signingId;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private LocalDate dateOfJoining;
    /**
     *The Many-To-One mapping represents a single-valued association where a collection of entities can be associated with the similar entity
     */
    @ManyToOne
    @JoinColumn(name ="team_id")
    private Team team;
    /**
     * A one-to-one association column will be set as unique.
     */
    @OneToOne
    @Column(unique = true)
    @JoinColumn(name ="player_id")
    private Player player;
}
