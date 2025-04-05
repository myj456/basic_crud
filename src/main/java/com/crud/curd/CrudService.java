package com.crud.curd;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {

    private final CrudRepository crudRepository;

    public CrudService(CrudRepository crudRepository){
        this.crudRepository = crudRepository;
    }

    public List<CRUD> getCrud(){
        return crudRepository.findAll();
    }

    public CRUD getCRUDId(Long id){
        return crudRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않습니다."));
    }

    public CRUD createCrud(CRUD crud){
        return crudRepository.save(crud);
    }

    public CRUD updateCrud(Long id, CRUD updateCRUD){
        CRUD existingCRUD = getCRUDId(id);
        existingCRUD.setId(updateCRUD.getId());
        existingCRUD.setName(updateCRUD.getName());
        existingCRUD.setContent(updateCRUD.getContent());
        existingCRUD.setTitle(updateCRUD.getTitle());

        return crudRepository.save(existingCRUD);
    }

    public void deleteCrud(Long id){
        crudRepository.deleteById(id);
    }
}
