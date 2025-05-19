package com.app.todolist_be.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "todo")
public class todo {

    @Id
    private String id;
    private Date startDate;
    private Date endDate;
    private String title;
    private String priority;
    private String status;
    private Date createdDate;
    private Data modifiedDate;
    private String waNumber;

}
