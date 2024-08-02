package com.bridge.red.back.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "`Attachment`")
public class Attachment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "attachTitle")
    private String attachTitle;

    @Column(name = "extension")
    private String extension;

    @Column(nullable = false, updatable = false)
    private Date uploadDate;

    @Column(name = "downloadLink")
    private String downloadLink;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "attachments")
    private Set<Card> cards=new HashSet<>();
}
