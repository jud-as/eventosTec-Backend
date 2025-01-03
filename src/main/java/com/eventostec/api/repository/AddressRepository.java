package com.eventostec.api.repository;

import com.eventostec.api.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {

    @Query("SELECT a FROM Address a WHERE a.event.id = :eventId")
    public Optional<Address> findByEventId(UUID eventId);
}
