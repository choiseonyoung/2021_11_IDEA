package com.csy.student.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

@Entity
@Table(name="tbl_score")
public class ScoreVO {

    @Id
    // @GeneratedValue(strategy = GenerationType.SEQUENCE) // * 오라클에서 사용
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sc_seq;

    @Column
    private String sc_stnum;

    @Column
    private String sc_subject;

    @Column
    private String sc_score;
}
