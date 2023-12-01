package ru.javaschool.documents.repository;

import org.codehaus.commons.nullanalysis.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.javaschool.documents.repository.entity.DocumentsEntity;
import ru.javaschool.documents.repository.entity.StatusEntity;

import javax.transaction.Transactional;
import java.util.Optional;

public interface DocumentRepository extends JpaRepository<DocumentsEntity, Long> {
    /**
     * Обновление статуса документа по id
     *
     * @param status статус документа
     * @param id     код документа
     */
    @Transactional
    @Modifying
    @Query("update DocumentsEntity d set d.status = ?1 where d.id = ?2")
    void updateStatusById(@Nullable StatusEntity status, Long id);

    @Override
    Optional<DocumentsEntity> findById(Long id);

    @Override
    void deleteById(Long id);
}
