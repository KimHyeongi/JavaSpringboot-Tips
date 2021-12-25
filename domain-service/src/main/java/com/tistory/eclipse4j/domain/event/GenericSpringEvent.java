package com.tistory.eclipse4j.domain.event;

import lombok.Getter;

@Getter
public class GenericSpringEvent<T> {
    private T eventSource;

    public GenericSpringEvent(T eventSource){
        this.eventSource = eventSource;
    }
}
