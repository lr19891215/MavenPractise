package itcast.service;

import com.fasterxml.jackson.core.JsonProcessingException;


public interface SaveService {

    public String save() throws JsonProcessingException;

    boolean check(String name);

}
