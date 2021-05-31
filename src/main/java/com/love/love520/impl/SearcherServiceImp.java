package com.love.love520.impl;

import com.love.love520.bean.ResultPerson;
import com.love.love520.bean.Searcher;
import com.love.love520.mapper.SearcherMapper;
import com.love.love520.service.ResultPersonService;
import com.love.love520.service.SearcherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SearcherServiceImp implements SearcherService {

    @Resource
    SearcherMapper searcherMapper;

    @Resource
    ResultPersonService resultPersonService;

    @Override
    public ResultPerson getResultPersonBySearcher(String name) {
        ResultPerson resultPerson = resultPersonService.getResultPersonByName(name);
        return resultPerson;
    }

    @Override
    public void insertSearcher(Searcher searcher) {
        searcherMapper.insertSearcher(searcher);
    }
}
