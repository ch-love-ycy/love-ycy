package com.love.love520.controller;

import com.love.love520.bean.ResultPerson;
import com.love.love520.bean.Searcher;
import com.love.love520.service.ResultPersonService;
import com.love.love520.service.SearcherService;
import jdk.nashorn.internal.objects.NativeString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
public class SearchController {

    @Resource
    SearcherService searcherService;

    @Resource
    ResultPersonService resultPersonService;

    @PostMapping("/search")
    public ResultPerson search(@RequestBody Searcher searcher) throws IOException {
        String url = searcher.getUrl();
        ClassPathResource classPathResource = new ClassPathResource("static");
        String resource = classPathResource.getURL().getPath();
        url = resource + "/" + url;
        searcher.setUrl(url);
        searcherService.insertSearcher(searcher);
        ResultPerson resultPerson = resultPersonService.getResultPersonByName(searcher.getName());
        return resultPerson;
    }

}
