package ru.javaschool.documents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import ru.javaschool.documents.repository.entity.StatusEntity;

import java.util.Optional;

public interface StatusRepository extends JpaRepository<StatusEntity, Long> {
    /**
     * Поиск статуса по коду
     *
     * @param code код статуса
     * @return наименование статуса
     */
    Optional<StatusEntity> findByCode(@NonNull String code);
}
