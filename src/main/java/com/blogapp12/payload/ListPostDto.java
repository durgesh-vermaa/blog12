package com.blogapp12.payload;

import lombok.Data;


import java.util.List;


@Data
public class ListPostDto  {

    private List<PostDto> postDto;
    private int totalPages;
    private int totalElements;

    private boolean lastPage;
    private boolean firstPage;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public boolean isLastPage() {
        return lastPage;
    }

    public void setLastPage(boolean lastPage) {
        this.lastPage = lastPage;
    }

    public boolean isFirstPage() {
        return firstPage;
    }

    public void setFirstPage(boolean firstPage) {
        this.firstPage = firstPage;
    }

    public void setPostDto(List<PostDto> postDto) {
    }

    public void setPageNumber(int number) {
    }
}

