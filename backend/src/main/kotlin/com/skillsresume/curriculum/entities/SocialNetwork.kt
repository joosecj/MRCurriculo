package com.skillsresume.curriculum.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

@Entity
@Table(name = "tb_social_netowork")
data class SocialNetwork(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idNetwork: Long? = null,
    var name: String,
    var url: String,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "curriculum_id")
    @JsonIgnore
    var curriculum: Curriculum

) {
    override fun toString(): String {
        return "SocialNetwork(idNetwork=$idNetwork, name='$name', url='$url', curriculum=$curriculum)"
    }
}