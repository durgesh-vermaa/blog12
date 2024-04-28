package com.blogapp12.payload;

import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Size;
import lombok.Data;




@Data
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 3, message = "Title should be atleast 3 characters")


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
    @NotEmpty

    private String description;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
