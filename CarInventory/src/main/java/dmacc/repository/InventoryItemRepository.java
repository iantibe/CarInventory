package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.InventoryItem;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> { }
