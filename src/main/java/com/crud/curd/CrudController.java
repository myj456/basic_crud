package com.crud.curd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crud")
public class CrudController {
    private final CrudService crudService;

    public CrudController(CrudService crudService) {
        this.crudService = crudService;
    }

    // 전체 조회
    @GetMapping
    public List<CRUD> getCrud(){
        return crudService.getCrud();
    }

    // 부분 조회
    @GetMapping("/{id}")
    public ResponseEntity<CRUD> getCrudId(@PathVariable Long id){
        return ResponseEntity.ok(crudService.getCRUDId(id));
    }

    // 게시
    @PostMapping
    public ResponseEntity<CRUD> createCrud(@RequestBody CRUD crud){
        return ResponseEntity.ok(crudService.createCrud(crud));
    }

    // 수정
    @PutMapping("/{id}")
    public ResponseEntity<CRUD> updatedCrud(@PathVariable Long id, @RequestBody CRUD updatedCrud){
        return ResponseEntity.ok(crudService.updateCrud(id, updatedCrud));
    }

    // 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCrud(@PathVariable Long id){
        crudService.deleteCrud(id);
        return ResponseEntity.noContent().build();
    }
}
