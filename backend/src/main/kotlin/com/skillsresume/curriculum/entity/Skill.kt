package com.skillsresume.curriculum.entity

import jakarta.persistence.*

@Entity
@Table(name = "tb_skill")
data class Skill(
    @Id
    @GeneratedValue
    var idSkill: Long? = null,
    var name: String,

    @ManyToOne
    @JoinColumn(name = "curriculum_id")
    var curriculum: Curriculum
)
