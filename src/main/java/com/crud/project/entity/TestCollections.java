package com.crud.project.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "new_collections")
@ToString
public class TestCollections {

    @Id
    private String id;
    private String name;
    private String address;

    @Builder
    public TestCollections(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

