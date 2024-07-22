package com.robertomessabrasil.carreseller.domain.repository;

import com.robertomessabrasil.carreseller.domain.entity.store.StoreEntity;
import io.github.robertomessabrasil.jwatch.observer.EventObserver;

import java.util.List;
import java.util.Optional;

public interface IStoreRepository {
    StoreEntity create(StoreEntity store);

    Optional<StoreEntity> findById(int storeId, EventObserver eventObserver);

    List<StoreEntity> listAll();

}
