package com.scaler.learning.Scaler.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class BaseModel {
    private long id;
    private Date createdAT;
    private Date lastUpdatedAt;
    private boolean isDeleted;
}
