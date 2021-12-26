package com.mentoring.market.controller;

import com.mentoring.market.entity.Item;
import com.mentoring.market.entity.ItemRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-17T02:38:31.872349+03:00[Europe/Moscow]")
@RestController
@RequestMapping("${openapi.market.base-path:}")
//@RequestMapping("/")
public class ItemsApiController implements ItemsApi {

    private final NativeWebRequest request;
    private final ItemRepository repository;

    @org.springframework.beans.factory.annotation.Autowired
    public ItemsApiController(NativeWebRequest request, ItemRepository repository) {
        this.request = request;
        this.repository = repository;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/items",
            produces = {"application/json"}
    )
    public ResponseEntity<List<Item>> itemsGet() {
        ApiUtil.setExampleResponse(request, "application/json", repository.findAll().toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/items",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Item> itemsPost(@ApiParam(value = "") @Valid @RequestBody(required = false) Item item) {
        repository.save(item);
        ApiUtil.setExampleResponse(request, "application/json", item.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/items",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Item> itemsPut(@ApiParam(value = "") @Valid @RequestBody(required = false) Item item) {
        repository.save(item);
        ApiUtil.setExampleResponse(request, "application/json", item.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/items"
    )
    public ResponseEntity<Void> itemsDelete(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "id", required = true) Long id) {
        repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
