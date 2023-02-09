package com.example.readjson.model;

import lombok.*;

import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Entity {
    private String australianBusinessNumber;
    private String australianCompanyNumber;
    private String australianServiceAddress;
    private List<Company> company;
}
