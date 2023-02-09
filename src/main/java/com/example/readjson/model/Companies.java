package com.example.readjson.model;

import lombok.*;

import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Companies {
    List<Entity> entity;
}
