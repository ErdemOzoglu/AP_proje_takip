package com.example.AP.gen.service;

import com.example.AP.gen.entity.BaseAdditionalFields;
import com.example.AP.gen.entity.BaseEntity;
import com.example.AP.gen.enums.GenErrorMessage;
import com.example.AP.gen.exceptions.ItemNotFoundException;
//import com.example.AP.sec.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public abstract class BaseEntityService<E extends BaseEntity, D extends JpaRepository<E, Long>> {


    private static final Integer DEFAULT_PAGE = 0;
    private static final Integer DEFAULT_SIZE = 10;

    private final D dao;

/*    private AuthenticationService authenticationService;


    @Autowired
    public void setAuthenticationService(@Lazy AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
*/
    public List<E> findAll(){
        return dao.findAll();
    }

    public Optional<E> findById(Long id){
        return dao.findById(id);
    }

    public E save(E entity){

        //setAdditionalFields(entity);
        entity = dao.save(entity);

        return entity;
    }

 /*   private void setAdditionalFields(E entity) {

        BaseAdditionalFields baseAdditionalFields = entity.getBaseAdditionalFields();

        Long currentCustomerId = getCurrentCustomerId();

        if (baseAdditionalFields == null){
            baseAdditionalFields = new BaseAdditionalFields();
            entity.setBaseAdditionalFields(baseAdditionalFields);
        }

        if (entity.getId() == null){
            baseAdditionalFields.setCreateDate(new Date());
            baseAdditionalFields.setCreatedBy(currentCustomerId);
        }

        baseAdditionalFields.setUpdateDate(new Date());
        baseAdditionalFields.setUpdatedBy(currentCustomerId);
    }
*/
    public void delete(E entity){
        dao.delete(entity);
    }

    public E getByIdWithControl(Long id) {

        Optional<E> entityOptional = findById(id);

        E entity;
        if (entityOptional.isPresent()){
            entity = entityOptional.get();
        } else {
            throw new ItemNotFoundException(GenErrorMessage.ITEM_NOT_FOUND);
        }

        return entity;
    }


    public D getDao() {
        return dao;
    }

 /*   public Long getCurrentCustomerId() {
        Long currentCustomerId = authenticationService.getCurrentUserId();
        return currentCustomerId;
    }
*/

    protected Integer getSize(Optional<Integer> sizeOptional) {

        Integer size = DEFAULT_SIZE;
        if (sizeOptional.isPresent()){
            size = sizeOptional.get();
        }
        return size;
    }

    protected Integer getPage(Optional<Integer> pageOptional) {

        Integer page = DEFAULT_PAGE;
        if (pageOptional.isPresent()){
            page = pageOptional.get();
        }
        return page;
    }
}
