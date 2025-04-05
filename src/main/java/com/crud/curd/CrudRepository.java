package com.crud.curd;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<CRUD, Long> {
}
