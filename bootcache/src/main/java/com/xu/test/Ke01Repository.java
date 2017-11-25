package com.xu.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
public interface Ke01Repository  extends JpaRepository<Ke01, Long>, JpaSpecificationExecutor<Ke01>{

}
