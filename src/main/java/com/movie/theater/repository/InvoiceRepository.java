package com.movie.theater.repository;

import com.movie.theater.model.entity.Invoice;
import com.movie.theater.model.response.InvoiceResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, String> {
}
