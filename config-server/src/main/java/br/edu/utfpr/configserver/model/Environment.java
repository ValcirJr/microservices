package br.edu.utfpr.configserver.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ToString
public class Environment {

    @Id
    @GeneratedValue
    private Long id;

    private String application;

    private String profile;

    private String label;

    @Column(name = "key_")
    private String key;

    @Setter
    private String value;
}
