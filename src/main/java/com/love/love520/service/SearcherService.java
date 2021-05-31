package com.love.love520.service;

import com.love.love520.bean.ResultPerson;
import com.love.love520.bean.Searcher;

public interface SearcherService {

    public ResultPerson getResultPersonBySearcher(String name);

    public void insertSearcher(Searcher searcher);

}
